package com.pageObjects;

import selenium.Element;
import selenium.LocatorType;

public class AccountPage {

	public static Element accountTab = new Element(LocatorType.ID, "lrsadminAccountsdump");

	public static Element addAccount = new Element(LocatorType.ID, "addAccount");

	public static Element viewAllAccounts = new Element(LocatorType.ID, "lrsadminAccounts");

	public static Element searchBoxOnAccountsPage = new Element(LocatorType.XPATH, "//input[(@id='mdSearchBox')]");
	
	public static Element accountOverViewOption = new Element(LocatorType.XPATH, "//a[(text()='Overview')]");
	
	public static Element searchIcon = new Element(LocatorType.ID, "mdSearchWidgetIcon");

	public static Element accountList = new Element(LocatorType.ID, "mdMasterListItems");

	public static Element firstAccount = new Element(LocatorType.XPATH,
			"//div[@class='listItem selected']//div[1]//div[1]");

	public static Element accountDetailsOption = new Element(LocatorType.XPATH, "//legend[text()='Account Details']");

	public static Element accountNameTextBox = new Element(LocatorType.XPATH, "//input[@placeholder='Account Name']");

	public static Element changeAccountOwnerLink = new Element(LocatorType.ID, "changeAcctOwnerLink");

	public static Element resentActivationEmailLink = new Element(LocatorType.ID, "resendActivationEmail");

	public static Element oneCuePlanDropDwon = new Element(LocatorType.XPATH, "(//div[@class='selectric'])[5]");

	public static Element oneCueBasicPlan = new Element(LocatorType.XPATH,
			"(//div[@class='selectricItems'])[5]/ul/li[1]");

	public static Element oneCueLocationTexBox = new Element(LocatorType.ID, "locationLimitON_CUE_RESTAURANT");

	public static Element accountSaveButton = new Element(LocatorType.XPATH, "//button[text()='Save']");

}
