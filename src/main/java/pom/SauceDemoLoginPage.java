package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pojo.LaunchBrowser;

public class SauceDemoLoginPage {
	

	
	@FindBy (xpath = "//input[@id='user-name']" )private WebElement userName;
	@FindBy (xpath = "//input[@id='password']")private WebElement password;
	@FindBy (xpath = "//input[@id='login-button']")private WebElement login;
	
	
	
	public SauceDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  enterUserName(String user)
	{
		userName.sendKeys(user);
	}
	
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void logIn()
	{
		login.click();
	}

}
