package stepDefinations;

import junit.framework.Assert;
import pageObjects.FacebookLogin;
import pageObjects.FacebookLoginregistration;
import textContext.TextContext;

import com.cucumber.listener.Reporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class InvalidFacebookLogin_StepDef {
		
	TextContext textContext;
	FacebookLogin facebookLogin;
	FacebookLoginregistration facebookLoginregistration;
	
	public InvalidFacebookLogin_StepDef(TextContext textContext)
	{
		this.textContext = textContext;
		facebookLogin = textContext.getPageobjectManager().getFacebookLogin_Page();
		facebookLoginregistration = textContext.getPageobjectManager().getFacebookLoginregistration_Page();
	}
	
	@Given("^enter fcebook invalidusername$")
	public void setup(){		
		
		facebookLogin.enterusername();
				
	}
	@When("^enter facebook invalidpassword$") 
	public void enterUserName() throws InterruptedException{
		facebookLogin.enterpassword();
	}
	
	@Then("^click on facebook  invalidlogin$") 
	public void enterPassword()
	{
		facebookLogin.clickSignin();
		Reporter.addStepLog("face book login clicked successfully");
		Assert.assertEquals(true, false);
		
	}
	
	@Then("^US124 Enter the first name$") 
	public void EnterthefirstUesrname() throws InterruptedException
	{
		facebookLoginregistration.enterFirstName("teytyeuyeyeyreyre");
	}
			
//	@Then("^Close the facebook browser$") 
//	public void closeFacebook(){
//		
//		textContext.getwebdriverManager().Teardown();
//	}

}
