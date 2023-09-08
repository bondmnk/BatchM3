package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelComePage {
WebDriver driver;
	public WelComePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="loginBtn")
	private WebElement loginButtonWelComePage;
	
	public WebElement getloginButtonWelComePage() {
		return loginButtonWelComePage;
	}
	
}
