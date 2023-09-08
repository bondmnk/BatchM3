package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PomClasses.HomePage;
import PomClasses.LoginPage;
import PomClasses.WelComePage;
import WebDriverUtility.BaseClass;
import WebDriverUtility.PropertiesUtility;
import WebDriverUtility.driverUtility;
import WebDriverUtility.exelUtilityClass;
import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(WebDriverUtility.ListnersImplementaion.class)
public class Login extends BaseClass {
	@Test
	public void Tc_Login_001() throws Throwable  {
		HomePage Hpage = new HomePage(driver);
	     WebElement MenLink = Hpage.getMenMenuLink();
	  
	    driverUtility driverU =  new driverUtility();
	    driverU.scrollWebPage(driver, 0, 1000);
	    Thread.sleep(4000);
	}

		@Test(groups="smokeTest")
		public void Tc_Login_002()  {
	     HomePage Hpage = new HomePage(driver);
	     Hpage.getMenMenuLink().click();
	}

}
