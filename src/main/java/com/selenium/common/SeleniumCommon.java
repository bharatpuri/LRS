package com.selenium.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.browser.Browser;

public class SeleniumCommon {
	 /**
	 * Wait for element 120 seconds
	 *
	 * @return
	 */
	 public static WebDriverWait waitForElement() {
	 return new WebDriverWait(Browser.getDriver(), 180);
	 }
	//
	// public static boolean isElementVisible(By by) {
	//
	// if(waitForElement().until(ExpectedConditions.elementToBeClickable(by)) !=
	// null) {
	// return true;
	// }
	// else {
	// throw new NoSuchElementException("No Element found");
	// }
	// }

	public static void waitForSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void click() {

		JavascriptExecutor js = (JavascriptExecutor) Browser.getDriver();
		js.executeScript("arguments[0].click();", Browser.getDriver().findElement(By.id("lrsadminAccGroupItem")));
	}

	/**
	 * This method will wait util 180 seconds
	 * 
	 * @return
	 * @throws HandleException
	 */
//	public static Wait<WebDriver> waitForElement() {
//
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(Browser.getDriver()).withTimeout(180, TimeUnit.SECONDS)
//				.pollingEvery(5, TimeUnit.SECONDS).ignoring(WebDriverException.class)
//				.ignoring(NoSuchElementException.class, ElementNotVisibleException.class);
//
//		return wait;
//	}

	public static void waitForLoad(WebDriver driver) {
			ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver driver) {
					return ((JavascriptExecutor) Browser.getDriver()).executeScript("return document.readyState")
							.equals("complete");
				}
			};
			WebDriverWait wait = new WebDriverWait(Browser.getDriver(), 120);
			wait.until(pageLoadCondition);
		}
	
	public static void getPageLoadStatus() {

		  JavascriptExecutor js = (JavascriptExecutor) Browser.getDriver();
		  String pageLoadStatus = (String) js.executeScript("return document.readyState");
		  System.out.println("Page Load Status:" + pageLoadStatus);
		  //Log.getLogger().info("Page Load Status:" + pageLoadStatus);

		 }

}