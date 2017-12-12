package com.automation.testCases;

import org.testng.annotations.Test;

import com.automation.base.CustomException;
import com.automation.browser.Browser;
import com.automation.browser.Chrome;

import applicationActions.LoginActions;

public class ATC_1 {
	@Test
	public void f() throws CustomException {
		Browser browser = new Chrome();
		LoginActions login = new LoginActions();
		browser.openBrowser();
		login.loginAsSuperAdmin("superadmin@lrs.com", "Password1");

	}
}
