package com.solar.com.solar;

import org.openqa.selenium.By;

public class ExistingMortgagePage extends Utils {
	
	private By _dropdownNavigation = By.xpath("//div[@class='predictive-input']");
	
	
	
	
	public void clickOnDropDown() {
		
		clickOnElement(_dropdownNavigation);
	}
	
	public void dropDownNavigation () {
		
		selectByVisibleText(_dropdownNavigation, "Accord Mortgage");
	}

}
