package selenium;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.automation.base.CustomException;
import com.automation.browser.Browser;
import com.selenium.common.SeleniumCommon;

/**
 * This class contains all the element actions
 * 
 * @author bharatp
 *
 */
public class Element {

	private final static Logger LOGGER = Logger.getLogger(Element.class.getName());

	private WebElement element = null;
	private LocatorType locatorType;
	private String Value;

	public Element(LocatorType type, String value) {
		locatorType = type;
		Value = value;

	}

	/**
	 * Get the element
	 * 
	 * @return
	 * @throws CustomException
	 */
	private WebElement getElement() throws CustomException {
		if (element == null) {
			element = this.findElement(locatorType, Value);
		}
		return element;
	}

	/**
	 * Check element is enabled or not
	 * 
	 * @return
	 * @throws CustomException
	 */
	public boolean isElementEnabled() throws CustomException {

		if (getElement().isEnabled()) {
			LOGGER.info("Element found as enabled");
		} else {
			LOGGER.error("Element is not found as enabled");
			throw new CustomException("Element is not found as enabled");
		}
		return false;

	}

	/**
	 * Check element is displayed or not
	 * 
	 * @return
	 * @throws CustomException
	 */
	public boolean isElementDisplayed() throws CustomException {

		if (getElement().isDisplayed()) {
			LOGGER.info("Element found as displayed");
		} else {
			LOGGER.error("Element is not found as displayed");
			throw new CustomException("Element is not found as displayed");
		}
		return false;

	}

	/**
	 * Check element is Selected or not
	 * 
	 * @return
	 * @throws CustomException
	 */
	public boolean isElementSelected() throws CustomException {

		if (getElement().isSelected()) {
			LOGGER.info("Element found as selected");
		} else {
			LOGGER.error("Element is not found as displayed");
			throw new CustomException("Element is not found as selected");
		}

		return false;

	}

	/**
	 * Click on element
	 * 
	 * @throws CustomException
	 */
	public void performClickAction() throws CustomException {

		if (getElement().isEnabled()) {
			element.click();
			LOGGER.info("Perform click action on this element");
		} else {
			LOGGER.error("Failed to perform click action on this element");
			throw new CustomException("Failed to perform click action this element" + element);
		}
	}

	/**
	 * Enter text on text element
	 * 
	 * @param text
	 * @throws CustomException
	 */
	public void setText(String text) throws CustomException {
		if (getElement().isEnabled()) {
			getElement().clear();
			getElement().sendKeys(text);
			LOGGER.info("Entered text on this element");
		} else {
			LOGGER.error("Failed to enter text on this element");
			throw new CustomException("Failed to enter text on this element" + element);
		}

	}

	/**
	 * Enter number on text element
	 * 
	 * @param text
	 * @throws CustomException
	 */
	public void setText(int number) throws CustomException {
		
		if (getElement().isEnabled()) {
			getElement().clear();
			getElement().sendKeys(String.valueOf(number));
			LOGGER.info("Entered text on this element");
		} else {
			LOGGER.error("Failed to enter text on this element");
			throw new CustomException("Failed to enter text on this element" + element);
		}

	}

	/**
	 * Submit on element
	 * 
	 * @throws CustomException
	 */
	public void performSubmitAction() throws CustomException {
		if (getElement().isEnabled()) {
			element.submit();
			LOGGER.info("Perform click action on this element");
		} else {
			LOGGER.error("Failed to perform Submit action on this element");
			throw new CustomException("Failed to perform click action this element: " + element);
		}
	}

	/**
	 * Get the text from element
	 * 
	 * @return
	 * @throws CustomException
	 */
	public String getTextFromElement() throws CustomException {
		String text = null;
		if (getElement().isEnabled()) {
			text = getElement().getText();
			LOGGER.info("Get text from element");
		} else {
			LOGGER.error("Failed to get the text on this element");
			throw new CustomException("Failed to get the text on this element: " + element);
		}
		return text;
	}

	/**
	 * Clear text form text Box element
	 * 
	 * @throws CustomException
	 */
	public void clearTextBox() throws CustomException {
		if (getElement().isEnabled()) {
			getElement().clear();
			LOGGER.info("Clear text on this locator: " + element);
		} else {
			LOGGER.error("Failed to clear the element text on this element");
			throw new CustomException("Failed to clear the element text on this element: " + element);
		}

	}

	/**
	 * Mouse hover on element
	 * 
	 * @throws CustomException
	 */
	public void mouseHover() throws CustomException {
		Actions actions = new Actions(Browser.getDriver());
		actions.moveToElement(getElement()).build().perform();
		SeleniumCommon.waitForSeconds(3);

	}

	public void selectByVisibleText(String selectOption) throws CustomException {

		Select select = new Select(getElement());

		select.selectByVisibleText(selectOption);
	}

	// /**
	// * Find element from web page
	// *
	// * @param type
	// * @param value
	// * @return WebElement
	// * @throws CustomException
	// */
	// public WebElement findElement(LocatorType type, String value) throws
	// CustomException {
	// WebElement webElement = null;
	//
	// switch (type) {
	// case ID: // Search the element with Id property
	// if (SeleniumCommon.isElementVisible(By.id(value))) {
	// webElement = Browser.getDriver().findElement(By.id(value));
	// } else {
	// LOGGER.error("No element found on web page by " + value);
	// throw new NoSuchElementException("No element found on web page by " + value);
	// }
	// break;
	// case NAME: // Search the element with Name property
	// if (SeleniumCommon.isElementVisible(By.name(value))) {
	// webElement = Browser.getDriver().findElement(By.name(value.trim()));
	// } else {
	// LOGGER.error("No element found on web page by " + value);
	// throw new NoSuchElementException("No element found on web page by " + value);
	// }
	// break;
	// case CSSSELECTOR: // Search the element with cssSelector property
	// if (SeleniumCommon.isElementVisible(By.cssSelector(value))) {
	// webElement = Browser.getDriver().findElement(By.cssSelector(value));
	// } else {
	// LOGGER.error("No element found on web page by " + value);
	// throw new NoSuchElementException("No element found on web page by " + value);
	// }
	// break;
	// case XPATH: // Search the element with xpath property
	// if (SeleniumCommon.isElementVisible(By.xpath(value))) {
	// webElement = Browser.getDriver().findElement(By.xpath(value));
	// } else {
	// LOGGER.error("No element found on web page by " + value);
	// throw new NoSuchElementException("No element found on web page by " + value);
	// }
	// break;
	// case CLASSNAME: // Search the element with className property
	// if (SeleniumCommon.isElementVisible(By.className(value))) {
	// webElement = Browser.getDriver().findElement(By.className(value));
	// } else {
	// LOGGER.error("No element found on web page by " + value);
	// throw new NoSuchElementException("No element found on web page by " + value);
	// }
	// break;
	// case LINKTEXT: // Search the element with linkText property
	// if (SeleniumCommon.isElementVisible(By.linkText(value))) {
	// webElement = Browser.getDriver().findElement(By.linkText(value));
	// } else {
	// LOGGER.error("No element found on web page by " + value);
	// throw new NoSuchElementException("No element found on web page by " + value);
	// }
	// break;
	// case PARTIALLINKTEXT:// Search the element with partialLinkText
	// if (SeleniumCommon.isElementVisible(By.partialLinkText(value))) {
	// webElement = Browser.getDriver().findElement(By.partialLinkText(value));
	// } else {
	// LOGGER.error("No element found on web page by " + value);
	// throw new NoSuchElementException("No element found on web page by " + value);
	// }
	// break;
	// case TAGNAME: // Search the element with tagName property
	// if (SeleniumCommon.isElementVisible(By.name(value))) {
	// webElement = Browser.getDriver().findElement(By.tagName(value));
	// } else {
	// LOGGER.error("No element found on web page by " + value);
	// throw new NoSuchElementException("No element found on web page by " + value);
	// }
	// break;
	// default: // Throw exception if any invalid WebElement is found
	// throw new CustomException("Failed to find the locator");
	// }
	// return webElement;
	// }

	/**
	 * Find element from web page
	 * 
	 * @param type
	 * @param LocatorValue
	 * @return WebElement
	 * @throws CustomException
	 */
	public WebElement findElement(LocatorType type, String LocatorValue) throws CustomException {
		WebElement webElement = null;
		By byLocator = null;
		switch (type) {
		case ID: // Search the element with Id property
			byLocator = By.id(LocatorValue);
			break;
		case NAME: // Search the element with Name property
			byLocator = By.name(LocatorValue);
			break;
		case CSSSELECTOR: // Search the element with cssSelector property
			byLocator = By.cssSelector(LocatorValue);
			break;
		case XPATH: // Search the element with xpath property
			byLocator = By.xpath(LocatorValue);
			break;
		case CLASSNAME: // Search the element with className property
			byLocator = By.className(LocatorValue);
			break;
		case LINKTEXT: // Search the element with linkText property
			byLocator = By.linkText(LocatorValue);
			break;
		case PARTIALLINKTEXT:// Search the element with partialLinkText
			byLocator = By.partialLinkText(LocatorValue);
			break;
		case TAGNAME: // Search the element with tagName property
			byLocator = By.tagName(LocatorValue);
		default: // Throw exception if any invalid locator is found
			throw new CustomException("Failed to find the locator");
		}
		if(SeleniumCommon.waitForElement().until(ExpectedConditions.elementToBeClickable(byLocator)) != null) {
			if (Browser.getDriver().findElement(byLocator).isDisplayed()) {
				webElement = Browser.getDriver().findElement(byLocator);
				LOGGER.info("Element found successfully");
			} else {	
				LOGGER.error("Failed Element is not found by " + byLocator);
			}
		}
		return webElement;
	}

//	public WebElement findElem(By byLocator) {
//		WebElement webElement = null;		
//
//		SeleniumCommon.getPageLoadStatus();
//		
//
//		if (Browser.getDriver().findElement(byLocator).isDisplayed()) {
//			webElement = Browser.getDriver().findElement(byLocator);
//			LOGGER.info("Element found successfully");
//		} else {	
//			LOGGER.error("Failed Element is not found by " + byLocator);
//		}
//		return webElement;
//
//	}
	
	
}
