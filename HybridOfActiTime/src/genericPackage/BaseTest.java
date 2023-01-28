package genericPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {
     protected static WebDriver driver;

    @BeforeMethod
	public void setup() throws IOException
	{
		
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH,"Browser");
		String url = flib.readPropertyData(PROP_PATH, "Url");
	
		if (browserValue.equals("chrome")) 
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
	         new ChromeDriver();
	        
		}  
	}
    public void ActiTimeValidLoginpage()
    {
    	
    	
    }
    
}
