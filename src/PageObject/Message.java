package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Message {

	WebElement element;
	
	
	public WebElement txt_email(WebDriver driver) throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("//p[text()='The Email Address format is invalid.']"));
			
		}
	
	    catch(Exception e)
		{
	    	throw e;
		}
		return element;
	
	}
	
	public WebElement txt_pwd(WebDriver driver) throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("//p[text()='The Password must be at least 8 characters.']"));
			
		}
	
	    catch(Exception e)
		{
	    	throw e;
		}
		return element;
	
	}
	
	
	public WebElement invalid_otp(WebDriver driver) throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("//P[text()='Please enter correct verification code.']"));
			
		}
	
	    catch(Exception e)
		{
	    	throw e;
		}
		return element;
	
	}
	
	public WebElement invalid_ssn(WebDriver driver) throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("//P[@class='field-error'][text()='The Social Security Number is not in the format XXX-XX-XXXX.']"));
			
		}
	
	    catch(Exception e)
		{
	    	throw e;
		}
		return element;
	
	}
	
		
	public WebElement success_msg(WebDriver driver) throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("//H4[@class='ui header'][text()='Which type of investment account would you like to open?']"));
			
		}
	
	    catch(Exception e)
		{
	    	throw e;
		}
		return element;
	
	}
	

	public WebElement invalid_bank(WebDriver driver) throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("//div[@class='fr-view'][text()='This account cannot be used, please check the information and try again']"));
			
		}
	
	    catch(Exception e)
		{
	    	throw e;
		}
		return element;
	
	}
	
	
	public WebElement taxid_error(WebDriver driver) throws Exception
	{
		try
		{
			element= driver.findElement(By.xpath("(//P)[3]"));
			
		}
	
	    catch(Exception e)
		{
	    	throw e;
		}
		return element;
	
	}
	

	
	
	
	
	//DIV[@class='fr-view'][text()='This account cannot be used, please check the information and try again']

	
	
	
	}