package stepDefinations;



import com.cucumber.listener.Reporter;

import pageObjects.FacebookLogin;
import textContext.TextContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLogin_StepDef {
		
	TextContext textContext;
	FacebookLogin facebookLogin;
	
	public FacebookLogin_StepDef(TextContext textContext)
	{
		this.textContext = textContext;
		facebookLogin = textContext.getPageobjectManager().getFacebookLogin_Page();
	}
	
	@Given("^enter fcebook username$")
	public void setup(){		
		
		facebookLogin.enterusername();
				
	}
	@When("^enter facebook password$") 
	public void enterUserName() throws InterruptedException{
		facebookLogin.enterpassword();
	}
	
	@Then("^click on facebook login$") 
	public void enterPassword()
	{
		facebookLogin.clickSignin();
		Reporter.addStepLog("face book login clicked successfully");
	}
	
	@Then("^Read the value from email$") 
	public String readUesrname()
	{
		return "fghfhfghfhfhfh";
	}
			
//	@Then("^Close the facebook browser$") 
//	public void closeFacebook(){
//		
//		textContext.getwebdriverManager().Teardown();
//	}

}
