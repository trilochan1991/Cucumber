package textContext;

import pageObjectManager.PageobjectManager;
import webDriverManager.WebdriverManager;

public class TextContext {
	
	private PageobjectManager pageobjectManager;
	private WebdriverManager webdriverManager;
	
	public TextContext()
	{
		webdriverManager = new WebdriverManager();
		pageobjectManager = new PageobjectManager(webdriverManager.getDriver());
		
	}
	
	public PageobjectManager getPageobjectManager(){
		return pageobjectManager;
	}
	
	public WebdriverManager getwebdriverManager(){
		return webdriverManager;
	}

}
