package com.automation.browser;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.automation.base.CustomException;
import com.automation.base.DataStoreRepository;

public abstract class Browser {

	protected static WebDriver driver;
	private final static Logger LOGGER = Logger.getLogger(Browser.class.getName());

	public final void openBrowser() throws CustomException {

		DataStoreRepository dataStoreRepository = DataStoreRepository.loadRepository("", "config");//new DataStoreRepository("", "config");
		String webURL = dataStoreRepository.getValue("testsiteBaseURl");

		getBrowser().get(webURL);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		LOGGER.info("Implicit wait applied on the driver for 60 seconds");
		getDriver().manage().window().maximize();
		LOGGER.info("Maximixe the window");
		LOGGER.info("Web application launched: " + webURL);

	}

	public WebDriver getBrowser() throws CustomException {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeBrowser() throws CustomException {
		if (driver != null) {
			driver.close();
			LOGGER.info("Close the browser open by selenium webdriver");
		} else
			throw new CustomException("Failed while closing the browser");

	}

	public void quiteBrowser() throws CustomException {
		if (driver != null) {
			driver.quit();
			LOGGER.info("Quite all the browsers open by selenium webdriver");
		} else {
			throw new CustomException("Failed while quiting the browser");
		}

	}

	public static WebDriver getDriver() {
		return driver;
	}

	// public static void setDriver(WebDriver driver) {
	// Browsers.driver = driver;
	// }

}
