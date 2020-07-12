package com.dell.BDDFrameWork.pageAction;

import junit.framework.Assert;

public class LoginPageAction {

	com.dell.BDDFrameWork.pageLocator.LoginPageLocator locator = new com.dell.BDDFrameWork.pageLocator.LoginPageLocator();

	public void enterUserCredential(String userName, String passWord) {

		locator.enterUserName.clear();
		locator.enterUserName.sendKeys(userName);
		locator.enterPassWord.clear();
		locator.enterPassWord.sendKeys(passWord);

	}
	


	public void clickOnSignOn() {
		locator.clicOnSingIn.click();
		
	}

	public void validateLogin() {
		String ActualSignOff = locator.ValidateSignOff.getText();
		
		Assert.assertEquals("SIGN-OFF", ActualSignOff);
	}
	//Google
	public void enterUserCredential2(String userName, String passWord) {

		locator.Email.clear();
		locator.Email.sendKeys(userName);
		locator.Password.clear();
		locator.Password.sendKeys(passWord);

	}
	public void EnterText() {
		locator.SearchBox.clear();
		locator.SearchBox.sendKeys("Selenium");
	}
	public void ClickSearch() {
		locator.ClickSearch.click();
	}
	//Dell
	public void ClickSignIn() {
		locator.ClickSignIn.click();
		locator.ClickSignInFromSelection.click();
	}
	public void SignIn() {
		locator.Signin.click();
	}
	public void VerifyHomePage() {
		boolean HomePage =locator.VerifyHomePage.isDisplayed();
		
		Assert.assertTrue(HomePage);
	}
	
	public void EnterInGoogle() {
		locator.SearchBox.clear();
		
		locator.SearchBox.sendKeys("Selenium");
	}
	

}

