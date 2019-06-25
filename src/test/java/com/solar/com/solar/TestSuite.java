package com.solar.com.solar;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
	
	HomePage homePage = new HomePage();

	PreQuestionsPage prequestionspage = new PreQuestionsPage();
	
	
	
	

@Test
public void toVerifyResiRemoJourney() {
	
	homePage.clickOnResiRemoButton();
	prequestionspage.clickOnremortgaginButton();
	prequestionspage.selectRadioButton();
	prequestionspage.clickOnContinueButton();
	
}
	
	
}


