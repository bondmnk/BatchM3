package TestCases;

import org.testng.annotations.Test;

import PomClasses.HomePage;
import WebDriverUtility.BaseClass;

public class Login1 extends BaseClass{

	
	@Test(groups="smokeTest")
	public void Tc_Login_002()  {
		 HomePage Hpage = new HomePage(driver);
		 Hpage.getWomenLink().click();
	}
}
