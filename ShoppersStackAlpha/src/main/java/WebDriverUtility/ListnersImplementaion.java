package WebDriverUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersImplementaion extends BaseClass implements ITestListener {

	public void onTestFailure(ITestResult result) {
		String FailedMethod= result.getMethod().getMethodName().toString();

		TakesScreenshot ts=(TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		String timestamp="Screnshot-"+FailedMethod;
       String timeStamp= LocalDateTime.now().toString().replace(':', '-');
		File parmanentFile=new File("./Screenshots/"+timestamp+timeStamp+".png");

		try {
			FileHandler.copy(tempFile, parmanentFile);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(driver.getTitle());
	}


}
