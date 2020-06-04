package stepdefinition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.Login;
import PageObject.Message;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverinit.Appdriver;

public class Investor_Signup {

	static Common com = new Common();

	static Appdriver intdriver = new Appdriver();
	static WebDriver d = intdriver.driverInit();
	static Login log = new Login(d);
	static Message msg = new Message();


	@Given("^User should navigate to open account pop up and clicks on investor option$")
	public static void get_ns_url() throws Exception {

		d.get(com.get_property("url"));

		log.txt_pwd.click();
		Thread.sleep(5000);
		log.txt_pwd.sendKeys("fourroses");
		log.btn_logs(d).click();

	}

	@When("^User Clicks on sign up button$")
	public void signup_btn() throws Exception {
		try {
			log.btn_signup(d).click();
			System.out.println("Clicked on signup button");

		}

		catch (Exception e) {

			throw e;
		}
	}

	@When("^User click investor option$")
	public void btn_investor() throws Exception {
		try {
			log.btn_investor(d).click();
			System.out.println("Clicked on investor option");
			
			Thread.sleep(4000);

		}

		catch (Exception e) {

			throw e;
		}
	}
	
		
	@When("^User enters invalid login credentials$")
	public void invalid_investor_details() throws Exception {
		try 
		{
			
			String randomEmail = com.randomEmails();

			log.email_add(d).click();
			d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			d.findElement(By.name("email")).sendKeys(randomEmail);
			

			log.pwd(d).click();
			d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			
			
			if((msg.txt_email(d).getText().contains("The Email Address format is invalid")))
	    	{
	    		System.out.println("Invalid Email");
	    	}
			
	    	else
	    	{
	    		
	    		System.out.println("valid Email");
	    		
	    	}
			
			String randomString = com.randomString(4);
			
			d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			d.findElement(By.name("password")).sendKeys(randomString);
			
			if((msg.txt_pwd(d).getText().contains("The Password must be at least 8 characters")))
			{
				System.out.println("Invalid Password");
			}
			
			else
			{
				System.out.println("valid password");
			}
			
			
		}
					
		catch(Exception e)
		{
		
			throw e;
		}
						
	}		
	
	
	
	@Then("^Exit from application$")
	public void exit_app() throws Exception {
		try 
		{
			d.quit();
			
		}

		catch (Exception e) {

			throw e;
		}
	}
	

	
	
	@When("^User clears ivalid details and enters investor details$")
	public WebDriver valid_investor_details() throws Exception {
		try {
		
				
			log.email_add(d).clear();
			
			String randomEmail = com.randomEmail();

			log.email_add(d).click();
			d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			d.findElement(By.name("email")).sendKeys(randomEmail);
			

			String randomStrings= com.randomString(8);
			log.pwd(d).click();
			d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			log.pwd(d).sendKeys(randomStrings);
						
			
			log.btn_register(d).click();
			d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			com.invalid_otp(log);
			
			
			if(msg.invalid_otp(d).getText().contains("Please enter correct verification code."))
			{
				System.out.println("Invalid OTP");
			}
			
			else
			{
				System.out.println("Valid OTP");
			}
			
			com.valid_otp(log);
			
			d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	
			System.out.println("Entered valid OTP");

			log.title.click();
			
			log.title1.click();
			
			
			String randomString2= com.randomString(4);
			log.fn.sendKeys(randomString2);
			d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			com.randomString(4);
			log.ln.sendKeys(randomString2);
			log.address.click();
			log.address.sendKeys("13843 Oak Fair Bend, Cypress, TX 77429");
			log.city.click();
			log.city.sendKeys("Atlanta");

			log.state1.click();
			
			d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

			log.zip.click();
			String randomPhone = com.randomPhone(10);
			com.randomPhone(10);
			log.zip.sendKeys(randomPhone);

			log.ph.click();
			log.ph.sendKeys("1111111111");

			log.dob.click();
			log.dob.sendKeys("09/12/1988");

			
			log.ss.sendKeys("912122456");
			
			log.dob.click();
			
			Thread.sleep(6000);
			
			if(msg.invalid_ssn(d).getText().contains("The Social Security Number is not in the format XXX-XX-XXXX."))
			{
				System.out.println("Invalid SSN");
			}
			
			else
			{
				System.out.println("valid ssn");
			}
			
			d.findElement(By.name("ssn")).click();
			System.out.println("Clicked on ssn field");
			Thread.sleep(4000);
			
			d.findElement(By.name("ssn")).sendKeys((Keys.chord(Keys.CONTROL, "a")));
			System.out.println("Cleared ssn field");
			
			String randomssn = com.randomPhone(9);
			com.randomPhone(9);
			log.ssn(d).sendKeys(randomssn);

			log.verify.click();
			
			d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

	     	com.invalid_otp(log);
			
			d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			
			
			if(msg.invalid_otp(d).getText().contains("Please enter correct verification code."))
			{
				System.out.println("Invalid OTP");
			}
			
			else
			{
				System.out.println("Valid OTP");
			}
			
			
			com.valid_otp(log);
			
			
			log.conti.click();

			log.Emp.click();
			
			log.Brokerage.click();
			Thread.sleep(6000);
			log.Brokerage.click();
			
			Thread.sleep(6000);
			
			log.Financial.click();
			Thread.sleep(4000);
			
			log.net.click();
			String randomphone = com.randomPhone(6);
			com.randomPhone(6);
			log.net.sendKeys(randomphone);
			
			log.inco.click();
			String randomphone1 = com.randomPhone(6);
			com.randomPhone(6);
			log.inco.sendKeys(randomphone1);

			log.conti.click();
			Thread.sleep(4000);
			
//			new Actions(d).sendKeys(Keys.PAGE_DOWN).build().perform();
//			
//			
//			JavascriptExecutor executor1 = (JavascriptExecutor) d;
//			executor1.executeScript("arguments[0].click();", log.chk1);
//			executor1.executeScript("arguments[0].click();", log.chk2);
//			executor1.executeScript("arguments[0].click();", log.acct);
//			Thread.sleep(6000);
			
			log.exp.click();
			d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			log.chk1.click();
			
			log.chk2.click();
		
		    log.acct.click();
			
		    d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		    
		    
//          if(msg.success_msg(d).getText().contains("Which type of investment account would you like to open?"))		    
//		    
//          {
//        	  System.out.println("Acct setup successful");
//          }
//          
//          else
//          {
//        	  System.out.println("Acct setup fail");
//          }
//          
//	    
//			log.indiv.click();
//	      	System.out.println("Clicked on individual");
//			
//			new Actions(d).sendKeys(Keys.PAGE_DOWN).build().perform();
//		
//			com.invalid_bank(log);
//			
//			if(msg.invalid_bank(d).getText().contains("This account cannot be used, please check the information and try again"))
//			{
//				System.out.println("Invalid bank details");
//			}
//			
//			
//			else
//			{
//				
//				System.out.println("Valid bank details");
//			}
//		
//	
//			log.bank2.click();
//			
//			d.findElement(By.name("routingNumber")).sendKeys((Keys.chord(Keys.CONTROL, "a")));
//			
//			log.bank2.sendKeys("122105278");
//			
//			log.bank3.click();
//				
//			log.bank4.click();
//			
//			Thread.sleep(10000);
//			
//			new Actions(d).sendKeys(Keys.PAGE_DOWN).build().perform();
//			Thread.sleep(10000);
//			
//			log.bank5.click();
//			
//			System.out.println("Successfully created Individual account");
//			
//			d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
//		       
//		    log.camp.click();
//		    Thread.sleep(5000);
//		    log.dash.click();
//		    
//			new Actions(d).sendKeys(Keys.PAGE_DOWN).build().perform();
//			
//		    log.open.click();
//			d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
//		    log.IRA.click();
//			d.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
//		    log.NexIRA.click();
//		  
//		    log.worth1.click();
//		  
//		    String randomworth = com.randomPhone(5);
//			   	    
//		    com.randomPhone(5);
//		    log.worth1.sendKeys(randomworth);
//		    		
//		    log.income1.click();
//		    String randominco = com.randomPhone(5);
//		    com.randomPhone(5);
//		    
//		    log.income1.sendKeys(randominco);
//		    
//		    log.conti.click();
//		    d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
//		    log.Trad.click();
//		    Thread.sleep(10000);
//		    log.chk.click();
//		    d.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS) ;
//		    
//		    new Actions(d).sendKeys(Keys.PAGE_DOWN).build().perform();
//		    com.linked_bank(log);
//             System.out.println("Linked bank successfully");
//             
//		    log.identity.click();
//	        d.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS) ;
//     	    Common.uplogadFileWithRobot("C:\\Users\\ChromeDriver\\For.txt");	
//     	         	    
//     	   Thread.sleep(10000);
//		    
//		    new Actions(d).sendKeys(Keys.PAGE_DOWN).build().perform();
//	        log.review.click();
//	        d.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS) ;
//	        
//	        log.camp.click();
//		    d.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS) ;
//		    log.dash.click();
//		    	
//		    Thread.sleep(5000);
//		    log.open.click();
//		    d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;		   
		    log.entity.click();
		    System.out.println("Clicked on open button for entity");
		    
		    d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		    String randomphone2 = com.randomPhone(10);
		    com.randomPhone(6);
		    log.Asset.sendKeys(randomPhone);
		    
		    log.Revenue.click();
		    com.randomPhone(6);
		    log.Revenue.sendKeys(randomPhone);
		    
		    d.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		    log.finfo.click();
		    d.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		    
		    log.name.click();
		    String randomstring = com.randomString(5);
		    log.name.sendKeys(randomstring);
		    
		    
		    log.taxId.sendKeys("254025402");
		
		    log.taxId.click();
		    String randomphoneid = com.randomPhone(9);
		    com.randomPhone(9);
		    log.taxId.sendKeys(randomphoneid);
		
		    d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			   
		    log.Entity.click();
		    d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		    log.Type.click();
		    d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		    
		    log.address.click();
			log.address.sendKeys("13843 Oak Fair Bend, Cypress, TX 77429");
			log.city.click();
			log.city.sendKeys("Atlanta");
			
			log.state1.click();
			
			log.state2.click();
			d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			log.zip.click();
			String randomPhones = com.randomPhone(10);
			com.randomPhone(5);
			log.zip.sendKeys(randomPhones);
		    
			
			new Actions(d).sendKeys(Keys.PAGE_DOWN).build().perform();
			log.Nex4.click();
			Thread.sleep(12000);
			
			if(msg.taxid_error(d).getText().contains("There was an issue with the information you submitted. Please double-check and try again. If you have any questions please contact support@nextseed.com"))
					{
				
				System.out.println("Taxid is duplicate");
					} 
					
			else
			{
				System.out.println("Tax id is not duplicate");
			}
			
			
             log.taxId.click();
             Thread.sleep(6000);
             log.taxId.sendKeys((Keys.chord(Keys.CONTROL, "a")));
            
             
		    String randomphoneids = com.randomPhone(9);
		    com.randomPhone(9);
		    log.taxId.sendKeys(randomphoneids);
		    new Actions(d).sendKeys(Keys.PAGE_DOWN).build().perform();
		    Thread.sleep(6000);
		    log.Nex4.click();
		    
			log.Trust.click();
			Thread.sleep(12000);
			
			log.Title.click();
			
			String randomstrings = com.randomString(6);
			com.randomString(6);
			log.Title.sendKeys(randomstrings);
		    
			
		   // JavascriptExecutor executor2 = (JavascriptExecutor) d;
		//	executor2.executeScript("arguments[0].click();", log.Upload);
		    log.Upload.click();
           Thread.sleep(4000);
		    
		    Common.uplogadFileWithRobot("C:\\Users\\ChromeDriver\\For.txt");
		    d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    
		    log.Upload1.click();
		    Thread.sleep(8000);
		    Common.uplogadFileWithRobot("C:\\Users\\ChromeDriver\\For.txt");
		    Thread.sleep(8000);
		    
		    log.Upload2.click();
		   Thread.sleep(8000);
	        Common.uplogadFileWithRobot("C:\\Users\\ChromeDriver\\For.txt");
	        d.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		    
//	        log.Upload3.click();
//	        System.out.println("clicked on upload 3 button");
//		    Thread.sleep(8000);
//		    Common.uplogadFileWithRobot("C:\\Users\\ChromeDriver\\For.txt");
//		    Thread.sleep(10000);
//		    

     	    
	 	    
		    log.con.click();
//	
//		    log.Funds.click();
//		    log.Funds.sendKeys("2300");
//		    Thread.sleep(3000);
//		    log.Confirmentity.click();
//		   
//		    Thread.sleep(3000);
//		     
//			  new Actions(d).sendKeys(Keys.PAGE_DOWN).build().perform();
//		   	JavascriptExecutor executor5 = (JavascriptExecutor) d;
//			executor5.executeScript("arguments[0].click();", log.review);
//			log.camp.click();
				   		
	}
	
		
		
		catch (Exception e) {

			throw e;
		}
		return null;
	}
	

		
}