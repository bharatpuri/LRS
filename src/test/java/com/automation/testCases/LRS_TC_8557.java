package com.automation.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.CustomException;
import com.automation.browser.Browser;
import com.automation.browser.Chrome;

import applicationActions.AccountActions;
import applicationActions.LoginActions;
import applicationsCredentails.UserCredentails;

/**
 * Verify user is able to search & select a account from super admin
 * 
 * @author bharatp
 *
 */
public class LRS_TC_8557 {
	Browser browser = new Chrome();
	
	AccountActions accountActions = new AccountActions();

	LoginActions login = new LoginActions();

	@BeforeClass
	public void openLRSWebApplication() throws CustomException {

		browser.openBrowser();
	}

	@Test(priority = 1)
	public void loginAsSuperUser() throws CustomException {

		login.loginInLRSApplication(UserCredentails.sueperAdminUsername, UserCredentails.sueperAdminPassword);
	}
	
	@Test(priority = 2)
	public void verifyAccountsOptions() throws CustomException {
		accountActions.verifyAccountOptions();
	}

	@Test(priority = 3)
	public void searchAccountAndClick() throws CustomException {
		accountActions.searchAccountAndSelect();
	}
	@AfterClass
	public void afterTest() throws CustomException {
		browser.closeBrowser();
	}

}
