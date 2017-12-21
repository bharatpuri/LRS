package com.automation.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.base.CustomException;
import com.automation.browser.Browser;
import com.automation.browser.Chrome;

import applicationActions.AccountActions;
import applicationActions.GroupActions;
import applicationActions.LoginActions;
import applicationsCredentails.UserCredentails;

/**
 * Verify that user is able to navigate to Groups submenu.
 * 
 * @author bharatp
 *
 */
public class LRS_TC_8556 {
	Browser browser = new Chrome();

	LoginActions login = new LoginActions();
	AccountActions accountActions = new AccountActions();

	GroupActions groupActions = new GroupActions();

	@BeforeClass
	public void openLRSWebApplication() throws CustomException {

		browser.openBrowser();
	}

	@Test(priority = 1)
	public void loginAsSuperUser() throws CustomException {

		login.loginInLRSApplication(UserCredentails.sueperAdminUsername, UserCredentails.sueperAdminPassword);
	}

	@Test(priority = 2)
	public void verifyAddGroupAndViewAllGroupsOptions() throws CustomException {
		accountActions.nevigateToHomePage();

	}
//
//	@Test(priority = 3)
//	public void navigateToAddGroupPage() throws CustomException {
//		accountActions.nevigateToHomePage();
//		groupActions.nevigateToAddGroupPage();
//	}

//	@Test(priority = 4)
//	public void navigateToViewAllGroupsPage() throws CustomException {
//		groupActions.nevigateToViewAllGroupsPage();
//	}
//
//	@AfterClass
//	public void afterTest() throws CustomException {
//		browser.closeBrowser();
//	}

}
