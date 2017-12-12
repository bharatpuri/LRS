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

	public static Element userName = new Element(LocatorType.ID, "j_username");

	public static Element loginPassword = new Element(LocatorType.ID, "j_password");

	public static Element loginButton = new Element(LocatorType.XPATH, "//button[contains(.,'Login')]");

}
