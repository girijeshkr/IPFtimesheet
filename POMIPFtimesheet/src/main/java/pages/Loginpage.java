package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class Loginpage extends Baseclass{

	
	@FindBy(name="UserName")
	WebElement username;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutton;
	
	
	
	
	
	
	
	public Loginpage()
	{
	PageFactory.initElements(driver,this);	
	}
	
	
	//Actions
	public WebElement validateloginpagetitile() {
	return loginbutton;
	
		}
	
	public WebElement entuserpass(String us, String pwd)
	{
		username.sendKeys(us);
		password.sendKeys(pwd);
		return password;
	}
	}


