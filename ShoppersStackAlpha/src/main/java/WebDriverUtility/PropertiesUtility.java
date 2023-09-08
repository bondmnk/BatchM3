package WebDriverUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesUtility {

	
	public String propertiesFile(String key) throws Throwable {
		File file=new File("./src/main/resources/TestData/testDataLogin.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties properties = new Properties();
		properties.load(fis);
		String value=properties.getProperty(key);
		return value;
	}
}
