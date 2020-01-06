package stepdeffile;



import org.openqa.selenium.WebElement;

import base.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.Loginpage;


public class Stepdeffile extends Baseclass{

	
	
	
	
	@Given("url launched successfully and user is on login page old")
	public void url_launched_successfully_and_user_is_on_login_page_old() {
	    Baseclass.initialization();
	}


	@When("title of login page is Timesheet old")
	public void title_of_login_page_is_Timesheet_old()
	{
		Loginpage loginpage=new Loginpage();
	WebElement	title=loginpage.validateloginpagetitile();
	String loginpagetitle=title.getText();
	System.out.println(loginpagetitle);
	String expected="Login";
	if(expected.equals(loginpagetitle)){
		System.out.println("Pass");
		}
		else {
		    System.out.println("Fail");
		}
	
	
	
	}

	@Then("user enter username  and password old")
	public void user_enter_username_and_password_old() {
		
		Loginpage loginpage=new Loginpage();
		
	   
	}

	@Then("user clicks on Login Button old")
	public void user_clicks_on_Login_Button_old() {
	    
	}

	@Then("user is on homepage old")
	public void user_is_on_homepage_old() {
	    
	}

	@Then("user click on logoff button old")
	public void user_click_on_logoff_button_old() {
	   
	}


}
