package driverinit;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appdriver
{
	WebDriver driver = null;
	
//	File f =new File("C:\\Users\\Tejas Chaudhari\\Documents\\EclipseWorkspace\\PF-Shadow\\src\\config.properties"); 
//	FileInputStream fis= new FileInputStream(f);
//	Properties pro= new Properties();
//	pro.load(fis);
//    pro.getProperty("CHROME");

		public static WebDriver driverInit()
		{
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setJavascriptEnabled(true);
			caps.setCapability("cssSelectorsEnabled", false);
			caps.setCapability("applicationCacheEnabled", true);
			caps.setCapability("acceptSslCerts",true);
			System.setProperty("webdriver.chrome.driver", "C://Users//ChromeDriver//chromedriver.exe");
			WebDriver driver=new ChromeDriver(caps);	
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().getCookies();
			return driver;
		}
	}