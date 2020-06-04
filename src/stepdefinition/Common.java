package stepdefinition;

import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.security.SecureRandom;
import java.util.Properties;
import java.util.Random;





import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.Login;
import cucumber.api.java.en.Given;

 

public class Common {

	WebElement element;
	Properties prop;

	static WebDriver d;
	static Login log = new Login(null);
	
	
	
public String get_property(String key)
{
  try
  {
	  prop= new Properties();
	  prop.load(new FileInputStream("C:\\Users\\Kalim\\workspace\\NS\\src\\Config.properties"));
	 
 
  }
  catch(Exception e)
  {
	  
  }
  
     return  prop.getProperty(key);
}


public static String randomString(int length) 
{
	String SOURCE = "abcdefghijklmnopqrstuvwxyz";
	 SecureRandom secureRnd = new SecureRandom();
	StringBuilder sb = new StringBuilder(length); 
	
	for (int i = 0; i < length; i++) 
	{
	
      sb.append(SOURCE.charAt(secureRnd.nextInt(SOURCE.length()))); 
	}
	
	  return sb.toString();  	   	  
	}

public static String randomPhone(int length) 
{
	String SOURCE = "12345678";
	 SecureRandom secureRnd = new SecureRandom();
	StringBuilder sb = new StringBuilder(length); 
	
	for (int i = 0; i < length; i++) 
	{
	
      sb.append(SOURCE.charAt(secureRnd.nextInt(SOURCE.length()))); 
	}
	
	  return sb.toString();  	   	  
	
}



public static String randomEmails()
{
	  return randomString(7) + '#' + "yopmail" + '.' + "com";  	   	  
}


public static String randomEmail()
{
	  return randomString(7) + '@' + "yopmail" + '.' + "com";  	   	  
}



public static String randomEmails1()
{
	  return randomString(7) + '@' + "yopmail" + "com";  	   	  
}


public static void uplogadFileWithRobot(String imagePath) throws InterruptedException
{
	 Robot robot = null;
	 try 
	    {
	        robot = new Robot();
	    } 
	    
	    catch (AWTException e)
	    {
	        e.printStackTrace();
	    }
    StringSelection stringSelection = new StringSelection(imagePath);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    System.out.println("Clipboard object" +clipboard);
    clipboard.setContents(stringSelection, null);
   
    
   
    
    robot.setAutoDelay(4000);
    System.out.println("robot object "+robot);
    robot.delay(4000);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(1000);
    
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    Thread.sleep(1000);
    
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.delay(1000);
    robot.keyRelease(KeyEvent.VK_ENTER);

}


public static void invalid_otp(Login log)
{
	try
	{

		System.out.println("clicked on first otp field");
		log.OTP1.click();
		log.OTP1.sendKeys("2");		
		log.OTP2.click();
		log.OTP2.sendKeys("1");
		log.OTP3.click();
		log.OTP3.sendKeys("1");
		log.OTP4.click();
		log.OTP4.sendKeys("1");
		log.OTP5.click();
		log.OTP5.sendKeys("1");
		log.OTP6.click();
		log.OTP6.sendKeys("1");
		log.confirm.click();

	}
  
	catch(Exception e)
	{
		throw e;
	}


}


public static void valid_otp(Login log)
{
	try
	{

		System.out.println("clicked on first otp field");
		log.OTP1.click();
		log.OTP1.sendKeys("1");		
		log.OTP2.click();
		log.OTP2.sendKeys("1");
		log.OTP3.click();
		log.OTP3.sendKeys("1");
		log.OTP4.click();
		log.OTP4.sendKeys("1");
		log.OTP5.click();
		log.OTP5.sendKeys("1");
		log.OTP6.click();
		log.OTP6.sendKeys("1");
		log.confirm.click();

	}
  
	catch(Exception e)
	{
		throw e;
	}


}


public static void linked_bank(Login log) throws Exception
{
	try
	{

		log.man.click();
		Thread.sleep(3000);			
		log.bank.click();
		log.banks.sendKeys("0000000008");
		log.bank2.sendKeys("122105278");
		log.bn.click();
		log.bn.sendKeys("Test");
		log.bank3.click();
		Thread.sleep(2000);
		log.bank4.click();
		Thread.sleep(18000);
		
	}
  
	catch(Exception e)
	{
		throw e;
	}


}


public static void invalid_bank(Login log) throws Exception
{
	try
	{

		log.man.click();
		Thread.sleep(3000);			
		log.bank.click();
		log.banks.sendKeys("00000000008");
		log.bank2.sendKeys("122105277");
		log.bn.click();
		log.bn.sendKeys("Test");
		log.bank3.click();
		Thread.sleep(2000);

	}
  
	catch(Exception e)
	{
		throw e;
	}


}




}


	