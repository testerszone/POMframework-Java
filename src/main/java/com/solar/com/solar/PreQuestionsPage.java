package com.solar.com.solar;

import org.openqa.selenium.By;

public class PreQuestionsPage extends Utils{
	
	
	
	private By _remortgagingButton = By.xpath("//label[@for='radio_RemortgageQ001_buy_or_remortgage']");

    private By _livingthereButton = By.xpath("//label[@for='radio_LivingInQ002_living_or_letting']");

    private By _radioButton = By.xpath("//label[contains(.,'Free up some cash')]");
    private By _continueButton = By.name(("continue"));

public void clickOnremortgaginButton() {
	
	clickOnElement( _remortgagingButton);
}

public void clickOnlivingthereButton() {
	
	clickOnElement(_livingthereButton);
}

public void selectRadioButton() {
	
	clickOnElement(_radioButton);
	
}

public void clickOnContinueButton() {
	clickOnElement(_continueButton);
}



}
