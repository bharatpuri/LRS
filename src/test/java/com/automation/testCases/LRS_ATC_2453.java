package com.automation.testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.automation.base.CustomException;
import com.automation.browser.Browser;
import com.automation.browser.Chrome;

import applicationActions.AccountActions;
import applicationActions.LoginActions;
import applicationsCredentails.UserCredentails;

/**
 * Verify user should able to to edit the maximum allowed locations number for
 * "One Cue" Product
 * 
 * @author bharatp
 *
 */
public class LRS_ATC_2453 {

	Browser browser = new Chrome();

	LoginActions login = new LoginActions();

	AccountActions accountActions = new AccountActions();

	@BeforeTest
	public void beforeTest() throws CustomException {
		browser.openBrowser();
	}

	@Test(priority = 1)
	public void loginAsSuperUser() throws CustomException {

		login.loginInLRSApplication(UserCredentails.sueperAdminUsername, UserCredentails.sueperAdminPassword);
	}

	@Test(priority = 2)
	public void searchAccountAndClick() throws CustomException {
		accountActions.searchAccountAndSelect();
	}

	@Test(priority = 3)
	public void editOneCuePlan() throws CustomException {
		accountActions.editOneCuePlan();

	}

//	@AfterTest
//	public void afterTest() throws CustomException {
//		browser.closeBrowser();
//	}

}
