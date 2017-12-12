package com.automation.actions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.automation.base.CustomException;

public interface ElementsListActions {

	public List<WebElement> getElementList(String locator) throws CustomException;

	public String getElementTextFromElementList(String elementList, String locator) throws CustomException;

	public int getElementCountFromElementList(String elementList) throws CustomException;

	public int getElementIndex(String elementList, String elementName) throws CustomException;

	public void clickOnIndexInElementList(int location, String elementList) throws CustomException;

	public String getTextByIndexFromElementList(int index, String elementList) throws CustomException;
}