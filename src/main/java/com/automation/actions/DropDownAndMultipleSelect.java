package com.automation.actions;

import com.automation.base.CustomException;

public interface DropDownAndMultipleSelect {

	public String getSelectedValueFromDropDown(String element) throws CustomException;

	public void selectOptionFromDropDownByIndex(int value, String element) throws CustomException;

	public void selectOptionFromDropDownByVisiableText(String dropDownElement, String element) throws CustomException;

}
