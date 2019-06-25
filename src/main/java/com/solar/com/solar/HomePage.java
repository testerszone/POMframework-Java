package com.solar.com.solar;

import org.openqa.selenium.By;

public class HomePage extends Utils {
	
	private By _resiRemoButton = By.xpath("//a[@data-uuid='f07fbf8c-7dc2-427f-8706-cced4755bb0f']");
	
	



public  void clickOnResiRemoButton() 
{
	
	clickOnElement( _resiRemoButton);
}







}