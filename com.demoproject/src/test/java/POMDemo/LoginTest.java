package POMDemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMDemo.DashboardPage;
import POMDemo.LoginPage;

public class LoginTest {
    Logger log = Logger.getLogger(LoginTest.class);
	WebDriver driver;
	LoginPage lp;
	DashboardPage dp;
	@BeforeMethod	
	public void setUp() {	
		System.setProperty("webdriver.chrome.drive", "D:/chromedriver.exe");	
		driver = new ChromeDriver();		
		driver.get("file:///C:/Users/LOGITECH/Downloads/Offline%20Website/Offline%20Website/index.html");	
		lp=new LoginPage(driver);
		dp=new DashboardPage(driver);
		}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
	@Test// tester working login page
	public void validLoginTest() {	
		lp.enterUname("mangesh@gmail.com");	
		lp.enterPass("123456");	
		lp.clickLogin();
		}	
	
	@Test// tester working on Dashboard page	
	public void test02() {
		lp.ValidLogin();	
		Assert.assertEquals(driver.getTitle(),lp.getTitle());
		}

	@Test
	public void test03(){
		lp.ValidLogin();
		dp.getCourses();
	}
}


