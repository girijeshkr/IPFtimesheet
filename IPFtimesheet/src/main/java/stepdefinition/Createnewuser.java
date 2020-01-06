/*package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.openqa.selenium.support.ui.Select;

public class Createnewuser {
	
	WebDriver driver;
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver","C:/Users/deepak13862/Downloads/chromedriver_win32/chromedriver.exe");
		 
		driver=new ChromeDriver();
		driver.get("IN-MH1DSW101921.mastek.com:9000/Account/Login");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		   driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		   driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

	@When("^user navigation link is available on home page$")
	public void user_navigation_link_is_available_on_home_page() {
		System.out.println(driver.findElement(By.cssSelector("a[href*='/Users/']")).getText());   
	}

	@Then("^click on user navigation link$")
	public void click_on_user_navigation_link() {
		driver.findElement(By.cssSelector("a[href*='/Users/']")).click();
	}

	@Then("^click on create new button$")
	public void click_on_create_new_button() {
	  
		driver.findElement(By.cssSelector(".btn.btn-primary.contItem")).click();
	}

	@Then("fill all the user information")
	public void fill_all_the_user_information() {
	    driver.findElement(By.cssSelector("input[id='User_FirstName']")).sendKeys("Automation");
	    driver.findElement(By.cssSelector("input[id='User_Surname']")).sendKeys("IPFTimesheet");
	    driver.findElement(By.cssSelector("input[id='User_UserName']")).click();
	    Select drprole=new Select(driver.findElement(By.cssSelector("select[id='User_Role_Id']")));
	    drprole.selectByVisibleText("Admin");
	    Select Grade=new Select(driver.findElement(By.cssSelector("select[id='User_UserGrade_Id']")));
	    Grade.selectByVisibleText("A");
	    Select costcentre=new Select(driver.findElement(By.cssSelector("select[id='User_CostCentre_Id']")));
	    costcentre.selectByVisibleText("IPF - IPF");
	    Select budget=new Select(driver.findElement(By.cssSelector("select[id='User_Budget_Id']")));
	    budget.selectByVisibleText("UK - UK");
	    Select location=new Select(driver.findElement(By.cssSelector("select[id='User_Location_Id']")));
	    location.selectByVisibleText("UK - UK");
	    driver.findElement(By.cssSelector("input[id='User_DisplayName']")).sendKeys("userprofilename");
	    
	    driver.findElement(By.cssSelector("input[id='User_Email']")).sendKeys("userprofilename@gmail.com");
	    driver.findElement(By.cssSelector("input[id='checkbox']")).isSelected();
	    
	    driver.findElement(By.cssSelector("input[id='User_StartDate']")).click();
	   
	    driver.findElement(By.cssSelector("input[id='User_StartDate']")).sendKeys("01");
	    driver.findElement(By.cssSelector("input[id='User_StartDate']")).sendKeys("01");
	    driver.findElement(By.cssSelector("input[id='User_StartDate']")).sendKeys("2019");
	    
	    
	    driver.findElement(By.cssSelector("input[id='User_EndDate']")).click();
	    driver.findElement(By.cssSelector("input[id='User_EndDate']")).sendKeys("12");
	    driver.findElement(By.cssSelector("input[id='User_EndDate']")).sendKeys("31");
	    driver.findElement(By.cssSelector("input[id='User_EndDate']")).sendKeys("2019");
	}
	

	@Then("click on save button")
	public void click_on_save_button() {
		driver.findElement(By.cssSelector("input[value='Save']")).click();
	    
	}

	same with test data tablle DDT*

	@Then("^fill all the user information$")
	public void fill_all_the_user_information(DataTable credentials) 
	{
	List<List<String>>	userdetail=credentials.asLists();
	driver.findElement(By.cssSelector("input[id='User_FirstName']")).sendKeys(userdetail.get(0).get(0));
    driver.findElement(By.cssSelector("input[id='User_Surname']")).sendKeys(userdetail.get(0).get(1));
    driver.findElement(By.cssSelector("input[id='User_UserName']")).sendKeys(userdetail.get(1).get(0));
    driver.findElement(By.cssSelector("select[id='User_Role_Id']")).sendKeys(userdetail.get(1).get(1));
    driver.findElement(By.cssSelector("select[id='User_UserGrade_Id']")).sendKeys(userdetail.get(2).get(0));
    		driver.findElement(By.cssSelector("select[id='User_CostCentre_Id']")).sendKeys(userdetail.get(2).get(1));
    				driver.findElement(By.cssSelector("select[id='User_Budget_Id']")).sendKeys(userdetail.get(3).get(0));
    						driver.findElement(By.cssSelector("select[id='User_Location_Id']")).sendKeys(userdetail.get(3).get(1));
    						driver.findElement(By.cssSelector("input[id='User_DisplayName']")).sendKeys(userdetail.get(4).get(0));
    			    
    			    driver.findElement(By.cssSelector("input[id='User_Email']")).sendKeys(userdetail.get(4).get(1));
    			    
    			   
    			    driver.findElement(By.cssSelector("input[id='User_StartDate']")).click();
    				  this is for data table without maps
    			    driver.findElement(By.cssSelector("input[id='User_StartDate']")).sendKeys(userdetail.get(6).get(0));
    			    driver.findElement(By.cssSelector("input[id='User_StartDate']")).sendKeys(userdetail.get(6).get(1));
    			    driver.findElement(By.cssSelector("input[id='User_StartDate']")).sendKeys(userdetail.get(6).get(2));
    			    
    			    
    			   driver.findElement(By.cssSelector("input[id='User_EndDate']")).click();
    				   this is for data table without maps
    			    driver.findElement(By.cssSelector("input[id='User_EndDate']")).sendKeys(userdetail.get(6).get(1));
    			    driver.findElement(By.cssSelector("input[id='User_EndDate']")).sendKeys(userdetail.get(6).get(1));
    			    driver.findElement(By.cssSelector("input[id='User_EndDate']")).sendKeys(userdetail.get(6).get(2));
    			     
	}
	
	@Then("^click on save button$")
	public void click_on_save_button() 
	{
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}

	@Then("^user verify userdetails page$")
	public void user_verify_userdetails_page() throws InterruptedException
	{
		
		WebElement	userdetailpagetitle=driver.findElement(By.xpath("//h4[text()='User details']"));
		System.out.println("the title of the page ::" + userdetailpagetitle.getText());
	}
	
	@Then("^click on edit button to add project to the user$")
	public void click_on_edit_button_to_add_project_to_the_user()
	{
		
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
}
	@Then("^click on checkbox to select a project$")
	public void click_on_checkbox_to_select_a_project() throws InterruptedException  
	{
		 Thread.sleep(3000);
	WebElement	modcon=driver.findElement(By.xpath("//div[@class='modal-dialog']"));
WebElement	modcontent=modcon.findElement(By.xpath("//div[@class='modal-content']"));
WebElement modbody=modcontent.findElement(By.xpath("//div[@class='modal-body']"));

modbody.findElement(By.xpath("//input[@value='2']")).click();



	}
		
	
		
	
	@Then("^click on save button to assign project$")
	public void click_on_save_button_to_assign_project() 
	{
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
	}
	
	@Then("^click on any month and fill user timesheet$")
	public void click_on_any_month_and_fill_user_timesheet()
	{
	WebElement	month=driver.findElement(By.xpath("//div[@class='container']"));
WebElement monthblock=month.findElement(By.xpath("//div[@class='card']"));
WebElement monthselect=monthblock.findElement(By.xpath("//div[@class='card-body']"));
WebElement monthrow=monthselect.findElement(By.xpath("//div[@class='row']"));
WebElement monthsubrow=monthrow.findElement(By.xpath("//div[@class='col-sm']"));
monthsubrow.findElement(By.xpath("//a[@class='badge badge-danger'] [1]")).click();



		driver.findElement(By.xpath("[class='container'] [class='badge badge-danger'][2]")).click();
		driver.findElement(By.cssSelector("[class='toggle-group'] [class='btn btn-default active toggle-off']")).click();
		
	}
@Then("^click on off button in Timesheet page and put it ON$")
public void click_on_off_button_in_Timesheet_page_and_put_it_ON()
{
	driver.findElement(By.cssSelector(".btn.btn-default.active.toggle-off")).click();
}

@Then("^fill the timesheet with a  valid values and click on tab button$")
public void fill_the_timesheet_with_a_valid_values_and_click_on_tab_button()
{
WebElement timesheet=driver.findElement(By.xpath("//input[@class='day1 form-control-sm text-sm-center']"));
timesheet.clear();
timesheet.sendKeys("1");
timesheet.sendKeys(Keys.TAB);

}

@Then("^click on save button on timesheet page$")
public void click_on_save_button_on_timesheet_page()
{
	driver.findElement(By.cssSelector(".btn.btn-primary.btn.float-right.formBtn")).click();
	}
@Then("^click on submit button$")
public void click_on_submit_button()
{
driver.findElement(By.xpath("//a[@class='btn btn-success float-right formBtn tsSubmit']")).click();
driver.switchTo().alert().accept();
}

}
*/

