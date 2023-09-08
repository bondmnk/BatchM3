package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettingElements {

	public WebDriver driver;
	public AccountSettingElements(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[name()='svg'and @data-testid='LogoutIcon']")
	private WebElement logoutIcon;
	
	public WebElement getlogoutIcon() {
		return logoutIcon;
	}
	
}
