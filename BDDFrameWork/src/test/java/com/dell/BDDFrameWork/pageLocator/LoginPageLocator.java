package com.dell.BDDFrameWork.pageLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.dell.BDDFrameWork.util.TestBase;

public class LoginPageLocator extends TestBase{
	
	
	public LoginPageLocator(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH ,using="//input[@name='userName']")
	public WebElement enterUserName;
	

	@FindBy(how=How.XPATH ,using="//input[@name='password']")
	public WebElement enterPassWord;

	@FindBy(how=How.XPATH ,using="//input[@name='password']")
	public WebElement clicOnSingIn;
	
	@FindBy(how=How.XPATH ,using="//a[text()='SIGN-OFF']")
	public WebElement ValidateSignOff;
	
	//Google
	@FindBy(how=How.NAME,using="q")
	public WebElement SearchBox;
	
	@FindBy(how=How.NAME,using="btnK")
	public WebElement ClickSearch;
	
	//Dell
	@FindBy(how=How.XPATH ,using="//span[text()='Sign In']")
	public WebElement ClickSignIn;
	
	@FindBy(how=How.XPATH ,using="//a[text()='Sign In']")
	public WebElement ClickSignInFromSelection;
	
	@FindBy(how=How.ID ,using="EmailAddress")
	public WebElement Email ;
	
	@FindBy(how=How.ID ,using="Password")
	public WebElement Password;
	
	@FindBy(how=How.ID ,using="sign-in-button")
	public WebElement Signin;
	
	@FindBy(how=How.XPATH ,using="//span[text()='MOHAMMAD JAHAN']")
	public WebElement VerifyHomePage;
	

}