package com.selenium.common;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.browser.Browser;

public class SeleniumCommon {
	/**
	 * Wait for element 120 seconds
	 * 
	 * @return
	 */
	public static WebDriverWait waitForElement() {
		return new WebDriverWait(Browser.getDriver(), 120);
	}
	
	public static boolean isVisible(By by) {
		return waitForElement().until(ExpectedConditions.visibilityOfElementLocated(by)).isDisplayed();
	}
	
	// capture screen shot
}