package stepdefinition;








import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.Set;

import io.cucumber.core.api.Scenario;
import io.cucumber.datatable.DataTable;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;

import cucumber.api.java.After;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Loginsteps {

	WebDriver driver;

	
	
	@Before
	
	public void launchIPFurl()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/deepak13862/Downloads/chromedriver_win32/chromedriver.exe");
		 
		driver=new ChromeDriver();
		driver.get("https://timesheets.dev.decisioning.ipf.cloud/");
	}
	
	
	
		@After
		public void tearDown(Scenario scenario) {
		    if (scenario.isFailed()) {
		            final byte[] screenshot = ((TakesScreenshot) driver)
		                        .getScreenshotAs(OutputType.BYTES);
		            scenario.embed(screenshot, "image/png"); //stick it in the report
		    }
		    driver.close();
		
	}
	


@Before("@SmokeTest3,@SmokeTest4,@SmokeTest2")
public void SSO()
{
	driver.findElement(By.cssSelector("#username")).sendKeys("admin");
	   driver.findElement(By.cssSelector("#password")).sendKeys("123456");
	   driver.findElement(By.cssSelector("button[type='submit']")).click();
	

}
	
@After("@SmokeTest3,@SmokeTest4,@SmokeTest2")
public void closebrowser2()
{
	driver.quit();
}

	@Given("^url launched successfully and user is on login page$")
	public void url_launched_successfully_and_user_is_on_login_page()
	{
		System.out.println("user is on enter login credential screen");
	}
	
	@When("^title of login page is Timesheet$")
	public void title_of_login_page_is_Timesheet()
	{
	WebElement landingpageheader=driver.findElement(By.xpath("//*[text()='Timesheets']"));
	
	System.out.println("Landing page title is ::" +landingpageheader.getText());
	
	
	
	}
	
	
	
	@Then("^user enter username  and password$") 
	public void user_enter_username_and_password(DataTable usercred) throws Throwable
	{
		
		List<Map<String, String>> upass=  usercred.asMaps(String.class, String.class);

	
	{
		for (int i = 0;i < 1; i++) 
		{
		driver.findElement(By.cssSelector("#username")).sendKeys(upass.get(i).get("username"));
		   driver.findElement(By.cssSelector("#password")).sendKeys(upass.get(i).get("password"));
		   driver.findElement(By.cssSelector("button[type='submit']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.cssSelector("a[href*='submit()']")).click();
		   Thread.sleep(2000);
		} 
	}
		
		   
		
		
	}

	
	
	@Then("^user clicks on Login Button$")
	public void user_clicks_on_Login_Button() throws InterruptedException {
		
	}
	@Then("^user is on homepage$")
	public void user_is_on_homepage() throws InterruptedException {
	    
	   System.out.println("home page titile is Timesheet");
	   Thread.sleep(1000);
	}
	@Then("^user click on logoff button$")
	public void user_click_on_logoff_button() throws InterruptedException
	{
		System.out.println("user clicked on logoff button"); 
	}
	
	
	@Given("^url launched successfully and user is on login page of IPF timesheet$")
	public void url_launched_successfully_and_user_is_on_login_page_of_IPF_timesheet()
	{
		System.out.println("user is on enter login credential screen");
	}
	
	@When("^title of login page is displayed as  Timesheet$")
	public void title_of_login_page_is_as_Timesheet()
	{
	WebElement landingpageheader=driver.findElement(By.xpath("//*[text()='Timesheets']"));
	
	System.out.println("Landing page title is ::" +landingpageheader.getText());
	
	
	
	}
	
	
	
	@Then("^user enter username  and password for both the valid and invalid user$") 
	public void user_enter_username_and_password_for_both_the_valid_and_invalid_user(DataTable usercred) throws Throwable
	{
		
		List<Map<String, String>> upass=  usercred.asMaps(String.class, String.class);

	
	{
		for (int i = 0;i < 2; i++) 
		{
		driver.findElement(By.cssSelector("#username")).sendKeys(upass.get(i).get("username"));
		   driver.findElement(By.cssSelector("#password")).sendKeys(upass.get(i).get("password"));
		   driver.findElement(By.cssSelector("button[type='submit']")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.cssSelector("a[href*='submit()']")).click();
		   
		} 
	}
		
		   
		
		
	}

	
	
	@Then("^user clicks on Login$")
	public void user_clicks_on_Login() throws InterruptedException {
		
	}
	@Then("^user is on homepage with valid user$")
	public void user_is_on_homepage_with_valid_user() {
		System.out.println("home page titile is Timesheet");
	}
	@Then("^user click on logoff button and enter invalid login credentials$")
	public void user_click_on_logoff_button_and_enter_invalid_login_credentials() throws InterruptedException
	{
		System.out.println("user clicked on logoff nutton"); 
	}
	
	
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		System.out.println("user is on homepage of IPF timesheet Application");
		
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
    			    
    			   
    			    driver.findElement(By.cssSelector("input[id='User_StartDate']")).sendKeys(userdetail.get(6).get(0));
    			  
    			    driver.findElement(By.cssSelector("input[id='User_EndDate']")).sendKeys(userdetail.get(6).get(1));
    			    
    			     
	}
	
	@Then("^click on save button$")
	public void click_on_save_button() 
	{
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
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



		
		
	}
@Then("^click on off button in Timesheet page and put it ON$")
public void click_on_off_button_in_Timesheet_page_and_put_it_ON()
{
	driver.findElement(By.cssSelector(".btn.btn-default.active.toggle-off")).click();
}

@Then("^fill the timesheet with a  valid values and click on tab button$")
public void fill_the_timesheet_with_a_valid_values_and_click_on_tab_button() throws InterruptedException
{
WebElement timesheet=driver.findElement(By.xpath("//input[@class='day1 form-control-sm text-sm-center']"));
timesheet.clear();
timesheet.sendKeys("1");
timesheet.sendKeys(Keys.TAB);
Thread.sleep(1000);
}

@Then("^click on save button on timesheet page$")
public void click_on_save_button_on_timesheet_page()
{
	driver.findElement(By.cssSelector(".btn.btn-primary.btn.float-right.formBtn")).click();
	}
@Then("^click on submit button$")
public void click_on_submit_button() throws InterruptedException
{
driver.findElement(By.xpath("//a[@class='btn btn-success float-right formBtn tsSubmit']")).click();
driver.switchTo().alert().accept();
Thread.sleep(2000);
}




@Given("^user is on home page with title as Timesheet$")
public void user_is_on_home_page_with_title_as_Timesheet()
{
WebElement hompagetitle=driver.findElement(By.cssSelector("a[href*='/Home/Index']"));
String actual =hompagetitle.getText();
String expected ="TimeSheets";

System.out.println(actual);

if(expected.equals(actual)){
System.out.println("Pass");
}
else {
    System.out.println("Fail");
}

	
	
}
	@When("^Admin Link is available on home page navigation bar$")
	public void Admin_Link_is_available_on_home_page_navigation_bar() throws InterruptedException {
		
		WebElement Admintab=driver.findElement(By.cssSelector("a[href*='/Admin/Dashboard']"));
		System.out.println(Admintab.getText());
		Thread.sleep(1000);
	}

	@Then("^click on Admin Link which is available on home page navigation bar$")
	public void click_on_Admin_Link_which_is_avaialable_on_home_page_navigation_bar() throws InterruptedException {
		driver.findElement(By.cssSelector("a[href*='/Admin/Dashboard']")).click();
		Thread.sleep(1000);
	}

	@Then("^select option Projects from Header dropdown$")
	public void select_option_Projects_from_Header_dropdown() throws InterruptedException {
	
	Select header=new Select(driver.findElement(By.xpath("//select[@name='layout']")));
	header.selectByVisibleText("Projects");
	
	}

	@Then("^click on Download button$")
	public void click_on_Download_button() throws InterruptedException {
		
	    driver.findElement(By.xpath("//button[text()='Download']")).click();
	    Thread.sleep(6000);
	}
	
	@Given("user is on IPF timesheet homepage")
	public void user_is_on_IPF_timesheet_homepage() {
		WebElement IPFtitlehome=driver.findElement(By.cssSelector("a[href*='/Home/Index']"));
		System.out.println(IPFtitlehome.getText());
	   
	}

	@When("navigation bar is available with Project link on home page")
	public void navigation_bar_is_available_with_Project_link_on_home_page() {
		WebElement Projectlink=driver.findElement(By.xpath("//a[@href='/Projects/Index']"));
		String actual =Projectlink.getText();
		String expected ="Projects";

		System.out.println(actual);

		if(expected.equals(actual)){
		System.out.println("Pass");
		}
		else {
		    System.out.println("Fail");
		}

	}

	@Then("click on project link")
	public void click_on_project_link() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/Projects/Index']")).click();
		
	}

	@Then("click on create new")
	public void click_on_create_new()
	{
		driver.findElement(By.xpath("//a[@href='/Projects/Create']"));
		
	}
	


@Then("^enter all the project Related details$")
public void enter_all_the_project_Related_details(DataTable ProjDetail) throws InterruptedException
{
                                        
List<Map<String, String>>	project=ProjDetail.asMaps(String.class, String.class);
{
for (int i = 0;i < 1; i++)
	
{
driver.findElement(By.xpath("//input[@id='Project_Name']")).sendKeys(project.get(i).get("Name"));
driver.findElement(By.xpath("//input[@id='Project_Description']")).sendKeys(project.get(i).get("Description"));
driver.findElement(By.xpath("//input[@name='Project.StartDate']")).sendKeys(project.get(i).get("StartDate"));
driver.findElement(By.xpath("//input[@id='Project_EndDate']")).sendKeys(project.get(i).get("EndDate"));

Thread.sleep(1000);
}	
}
	
}

	
	


@Then("^click on create button to create a new project$")
public void click_on_create_button_to_create_a_new_project() throws InterruptedException
{
	
	driver.findElement(By.xpath("//input[@value='Create']")).click();
	Thread.sleep(4000);
}



@Given("^url launched successfully and user is on login page of IPF timesheet new$")
public void url_launched_successfully_and_user_is_on_login_page_of_IPF_timesheet_new()
{
	System.out.println("user is on enter login credential screen");
}

@When("^title of login page is displayed as  Timesheet new$")
public void title_of_login_page_is_displayed_as_Timesheet_new() 
{
	driver.findElement(By.cssSelector("input[id='userNameInput']")).sendKeys("bhora@ipf.cloud");
	driver.findElement(By.cssSelector("input[id='passwordInput']")).sendKeys("Welcome123");
	driver.findElement(By.xpath("//*[@id='submitButton']")).click();





}



@Then("^user enter username  and password for both the valid and invalid user new$")
public void user_enter_username_and_password_for_both_the_valid_and_invalid_user_new() throws InterruptedException 
{
	Thread.sleep(1000);
	Set<Cookie> allCookies = driver.manage().getCookies();
	driver.close();
	
	
	
	 
	driver=new ChromeDriver();
	driver.get("https://timesheets.dev.decisioning.ipf.cloud/");
	Thread.sleep(1000);
	for(Cookie cookie : allCookies) {

        driver.manage().addCookie(cookie);

        }
	driver.get("https://timesheets.dev.decisioning.ipf.cloud/");
	Thread.sleep(3000);
}
	
}






