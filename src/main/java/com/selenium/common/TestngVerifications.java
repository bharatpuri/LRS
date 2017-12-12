package com.selenium.common;

import org.testng.Assert;

public class TestngVerifications {
	/**
	 * Verify the two strings
	 * 
	 * @param expectedText
	 * @param actualText
	 */
	public void verifyText(String expectedText, String actualText) {

		Assert.assertEquals(expectedText, actualText);

	}

}
