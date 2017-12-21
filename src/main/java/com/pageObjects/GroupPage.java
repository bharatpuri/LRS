package com.pageObjects;

import selenium.Element;
import selenium.LocatorType;

/**
 * This class will contains all the elements of Groups page.
 * 
 * @author bharatp
 *
 */
public class GroupPage {
	
	public static Element groupTab = new Element(LocatorType.XPATH, "//li[(@id='lrsadminAccGroupItem')]");
	
	public static Element groupTabCaret = new Element(LocatorType.XPATH, "//li[@id='lrsadminAccGroupItem']//a[1]//span");
	
	public static Element addNewGroup = new Element(LocatorType.ID, "addAccountGroups");

	public static Element newGroupLabel = new Element(LocatorType.ID, "accountGroupsNameLbl");

	public static Element viewAllGroups = new Element(LocatorType.ID, "showAllAccountGroup");

	public static Element groupDetailLalelOnViewGroupsPage = new Element(LocatorType.XPATH,
			"//div[text()='Group Detail']");

	public static Element accountGroupName = new Element(LocatorType.ID, "accountGroupName");

	public static Element groupDescription = new Element(LocatorType.ID, "description");

	public static Element cancelGroupButton = new Element(LocatorType.XPATH, "//button[contains(.,'Cancel')]");

	public static Element saveGroupButton = new Element(LocatorType.XPATH, "//button[contains(.,'Save')]");

	public static Element deleteGroupButton = new Element(LocatorType.XPATH, "//button[contains(.,'Delete Group')]");

	public static Element firstGroupFromList = new Element(LocatorType.XPATH, "//div[(@class='mdMasterNode')]");

}
