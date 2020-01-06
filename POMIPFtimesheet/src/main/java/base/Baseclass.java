package base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.TestUtil;

public class Baseclass {

	public static WebDriver driver;
	public static Properties prop;
	
	public Baseclass() {
	try {
		
	prop=new Properties();
				FileInputStream  fis=new FileInputStream("C:/Users/deepak13862/eclipse-workspace/POMIPFtimesheet/src/main/java/configEnvVariable/config.properties");
	
	prop.load(fis);
	}
	catch(IOException e)
	{
	e.getMessage();	
	}
	}
public static void initialization()
{
	String browsername=prop.getProperty("browser");
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/deepak13862/Downloads/chromedriver_win32/chromedriver.exe");
		 
		driver=new ChromeDriver();
	}
	else if(browsername.equals("firefox"))
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/deepak13862/Downloads/chromedriver_win32/chromedriver.exe");
		 
		driver=new FirefoxDriver();
	}

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT ,TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));
}

}
