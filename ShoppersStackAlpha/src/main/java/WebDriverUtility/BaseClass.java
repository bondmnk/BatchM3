package WebDriverUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import PomClasses.AccountSettingElements;
import PomClasses.HomePage;
import PomClasses.LoginPage;
import PomClasses.WelComePage;

public class BaseClass {

	public static WebDriver driver;
	String Browser;
	PropertiesUtility pro = new PropertiesUtility();

	// @Parameters("browser")
	@BeforeClass(groups = {"RegrationTest","smokeTest"})
	public void confBeforeClass() throws Throwable {
		System.out.println("----------------Lanching The Browser--------------------");

		Browser=pro.propertiesFile("Browser");


		if(Browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(Browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(Browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./Driver/edgedriver.exe");
			driver=new EdgeDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();

		String URL=pro.propertiesFile("Url");
		driver.get(URL);
	}

	@BeforeMethod(groups = {"RegrationTest","smokeTest"})
	public void confBeforeMethod() throws Throwable {
		System.out.println("----------Login To Application--------------");
		WelComePage WelPage = new WelComePage(driver);
		WelPage.getloginButtonWelComePage().click();


		LoginPage loginp = new LoginPage(driver);

		String USERNAME = pro.propertiesFile("UserName");
		loginp.getEmailTextField().sendKeys(USERNAME);

		String PASSWORD=pro.propertiesFile("PassWord");
		loginp.getPasswordTextField().sendKeys(PASSWORD);

		loginp.getLoginButton().click();

	}
	@AfterMethod(groups = {"RegrationTest","smokeTest"})
	public void confAfterMethod() throws Throwable {
		System.out.println("----------LogOut To Application--------------");

		Thread.sleep(3000);
		//		HomePage Hpage=new HomePage(driver);
		HomePage.accountSettingIcon(10,driver).click();


		AccountSettingElements ASelements = new AccountSettingElements(driver);
		ASelements.getlogoutIcon().click();

	}

	@AfterClass(groups = {"RegrationTest","smokeTest"})
	public void confAfterClass() {
		System.out.println("----------Closing The server--------------");
		driver.quit();
	}
}
