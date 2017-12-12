package com.automation.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.base.DataStoreRepository;
import com.automation.base.CustomException;

public class Chrome extends Browser {
	@Override
	public WebDriver getBrowser() throws CustomException {
		//DataStoreRepository data = new DataStoreRepository("", "config");
		DataStoreRepository dataStoreRepository = DataStoreRepository.loadRepository("", "config");
		//IDataStoreInMap dataStore = data.CreateDataStoreForFile();

		System.setProperty("webdriver.chrome.driver", dataStoreRepository.getValue("windows_chromeDriverPath"));

		driver = new ChromeDriver();
		return driver;
	}

}
