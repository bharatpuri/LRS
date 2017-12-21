package com.pageObjects;

import selenium.Element;
import selenium.LocatorType;

/**
 * This class contains all the elements of login page
 * 
 * @author bharatp
 *
 */
public class LoginPage {

	public static Element loginuserName = new Element(LocatorType.ID, "j_username");

	public static Element loginPassword = new Element(LocatorType.ID, "j_password");

	public static Element loginButton = new Element(LocatorType.XPATH, "//button[contains(.,'Login')]");
	
	public static Element loggedInUserName = new Element(LocatorType.ID, "loggedInuserName");

	public static Element profileOption = new Element(LocatorType.ID, "lrsadminAccountSettingsMenuItem");
	
	public static Element accountRoleName = new Element(LocatorType.ID, "accountSettingRoleName");

}
