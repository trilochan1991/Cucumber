package stepDefinations;

import pageObjects.FacebookLogin;
import textContext.TextContext;
import cucumber.api.java.en.Then;

public class Facebookregister_def {
	
	TextContext textContext;
	FacebookLogin facebookLogin;
	FacebookLogin_StepDef facebookLogin_StepDef;
	
	public Facebookregister_def(TextContext textContext, FacebookLogin_StepDef facebookLogin_StepDef)
	{
		this.textContext = textContext;
		this.facebookLogin_StepDef= facebookLogin_StepDef;
		facebookLogin = textContext.getPageobjectManager().getFacebookLogin_Page();
	}
	
	@Then("^Enter user name in register name section$")
	public void FirstrName() throws InterruptedException{		
		
		facebookLogin.enterFirstName(facebookLogin_StepDef.readUesrname());
				
	}

}
