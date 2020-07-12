package stepsDef;

import com.dell.BDDFrameWork.pageAction.LoginPageAction;
import com.dell.BDDFrameWork.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends TestBase {
	LoginPageAction action = new LoginPageAction();
	
	@Given("^Launch \"([^\"]*)\"$")
	public void i_navigate_through(String URL) throws Throwable {
	    //getDriver(URL);
		getDriver(URL);
	}
	
	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String userName, String passWord) throws Throwable {
	   action.enterUserCredential(userName, passWord);
	}

	@Then("^I click on Sign In button$")
	public void i_click_on_Sign_In_button() throws Throwable {
	   action.clickOnSignOn();
	}

	@Then("^I validate Flight Finder page appeared$")
	public void i_validate_Flight_Finder_page_appeared() throws Throwable {
	    action.validateLogin();
	}
	//Google
	@Then("^Enter Hello World on Search field$")
	public void Then_Enter_Hello_World_on_Search_field() throws Throwable {
	    action.EnterText();
	}
	
	@Then("^click on Search$")
	public void click_on_Search() throws Throwable {
	   action.ClickSearch();
	}
	//Dell
	@When("^Enter \"([^\\\"]*)\" and \"([^\\\"]*)\"$")
	public void Enter_username_and_password(String username, String passWord) throws Throwable {
	   //action.enterUserCredential2(prop.getProperty("username"), prop.getProperty("password"));
		action.enterUserCredential2(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Then("^Click on Signin Button$")
	public void Click_on_Signin_Button() throws Throwable {
	   action.ClickSignIn();
	}

	@Then("^Click SignIn$")
	public void Click_SignIn() throws Throwable {
	   action.SignIn();
	}
	@Then("^Verify User In Home Page$")
	public void Verify_User_In_Home_Page() throws Throwable {
	   action.VerifyHomePage();
	}
	
	@Then("^Enter Selenium on Search field$")
	public void Enter_Selenium_on_Search_field() throws Throwable {
	   action.EnterInGoogle();
	}
	
	


}
