package PomClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	@FindBy(id="men")
	private WebElement MenMenuLink;

	@FindBy(id="women")
	private WebElement WomenMenuLink;

	//	@FindBy(xpath="//*[name()='svg' and @data-testid='SettingsIcon']")
	//	private WebElement settingIcon;

	public static  WebElement accountSettingIcon(int seconds,WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[name()='svg' and @data-testid='SettingsIcon']"))));
		return driver.findElement(By.xpath("//*[name()='svg' and @data-testid='SettingsIcon']"));

	}



	//	public WebElement getSettingIcon() {
	//		return settingIcon;
	//	}


	public WebElement getMenMenuLink() {
		return MenMenuLink;
	}

	public WebElement getWomenLink() {
		return WomenMenuLink;
	}


}
