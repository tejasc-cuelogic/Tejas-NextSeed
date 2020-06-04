package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	WebElement element = null;
	String message = null;
	
	@FindBy (xpath="//input[@data-id='0']")
	public WebElement OTP1;
	
	@FindBy (xpath="//input[@data-id='1']")
	public WebElement OTP2;
	
	@FindBy (xpath="//input[@data-id='2']")
	public WebElement OTP3;
	
	@FindBy (xpath="//input[@data-id='3']")
	public WebElement OTP4;
	
	@FindBy (xpath="//input[@data-id='4']")
	public WebElement OTP5;
	
	@FindBy (xpath="//input[@data-id='5']")
	public WebElement OTP6;
	
	@FindBy (xpath="//button[@class='ui primary button'][text()='Confirm']")
	public WebElement confirm;
	
	@FindBy (xpath="//BUTTON[@class='ui large primary button very relaxed'][text()='Continue']")
	public WebElement cont;

	@FindBy (xpath="(//DIV[@class='default text'][text()='Select'][text()='Select'])[1]")
	public WebElement title;
	
	@FindBy (xpath="//div[@role='option']/span[contains(text(),'Mr.')]")
	public WebElement title1;
	
	@FindBy (name="firstLegalName")
	public WebElement fn;
	
	@FindBy (name="lastLegalName")
	public WebElement ln;

	@FindBy (name="street")
	public WebElement address;
	
	@FindBy (name="city")
	public WebElement city;
	
	@FindBy (xpath="/html/body/div[2]/div/div[2]/form/div[4]/div[2]/div[1]")
	public WebElement state;
	
	@FindBy (name="password")
	public WebElement txt_pwd;
	
	@FindBy (name="zipCode")
	public WebElement zip;
	
	@FindBy (name="phoneNumber")
	public WebElement ph;
	
	@FindBy (name="dateOfBirth")
	public WebElement dob;
	
	@FindBy (name="ssn")
	public WebElement ss;
	
	@FindBy (xpath="//BUTTON[@class='ui primary button'][text()='Verify my identity']")
	public WebElement verify;
	
	@FindBy (xpath="//input[@data-id='0']")
	public WebElement otp1;
	
	@FindBy (xpath="//input[@data-id='1']")
	public WebElement otp2;
	
	@FindBy (xpath="//input[@data-id='2']")
	public WebElement otp3;
	
	@FindBy (xpath="//input[@data-id='3']")
	public WebElement otp4;
	
	@FindBy (xpath="//input[@data-id='4']")
	public WebElement otp5;
	
	@FindBy (xpath="//input[@data-id='5']")
	public WebElement otp6;

	
	@FindBy (xpath="//BUTTON[@class='ui primary button relaxed'][text()='Continue']")
	public WebElement conti;
	
	@FindBy (xpath="//BUTTON[@class='ui large primary button very relaxed'][text()='Continue']")
	public WebElement Continue;
	
	@FindBy (xpath="//BUTTON[@data-cy='SELF_EMPLOYED']")
	public WebElement Emp;
	
	@FindBy (xpath="//Button[@class='ui basic button  primary-hover'][text()='No']")
	public WebElement Brokerage;
	

	@FindBy (name=("netWorth"))
	public WebElement Firm;

	
	@FindBy (name="annualIncomeCurrentYear")
	public WebElement inco;	
	
	@FindBy (xpath="//button[@class='ui circular icon button active multistep__btn next']")
	public WebElement fwd;	
		
	@FindBy (xpath="//LABEL[text()='Individual']")
	public WebElement Financial;	
	
	@FindBy (name="netWorth")
	public WebElement net;	
	
	@FindBy (name="annualIncomeCurrentYear")
	public WebElement annual;	
	
	@FindBy (xpath="//BUTTON[@type='submit']")
	public WebElement Next3;	
	
	@FindBy (xpath="//BUTTON[@data-cy='SOME']")
	public WebElement exp;	
	
	@FindBy (xpath="(//INPUT[@type='checkbox'])[1]")
	public WebElement chk1;	
		
	@FindBy (xpath="(//INPUT[@type='checkbox'])[2]")
	public WebElement chk2;
	
	@FindBy (xpath="//BUTTON[@data-cy='inv-profile-exp'][text()='Continue to Account']")
	public WebElement acct;
	
	@FindBy (xpath="//H5[@class='ui header mb-0'][text()='Individual Account']")
	public WebElement success;
	
	
	@FindBy (xpath="//H5[@class='ui header mb-0'][text()='Individual Account']")
	public WebElement indiv;
	
	@FindBy (xpath="//button[@class='ui circular icon button multistep__btn next active']")
	public WebElement nex;
	
	@FindBy (xpath="//BUTTON[@class='ui green button link-button'][text()='Link bank account manually']")
	public WebElement man;

	@FindBy (xpath="//label[text()='Checking']")
	public WebElement bank;
	
	@FindBy (name="accountNumber")
	public WebElement banks;
	
	@FindBy (name="routingNumber")
	public WebElement bank2;
	
	@FindBy (xpath="//INPUT[@autocomplete='nope']")
	public WebElement bn;
	
	@FindBy (xpath="//button[@class='ui large primary button mt-30 relaxed'][text()='Confirm']")
	public WebElement bank3;
	
	@FindBy (xpath="//button[text()='I don’t want to deposit any money now']")
	public WebElement bank4;
	
	@FindBy (xpath="//button[text()='Create your account']")
	public WebElement bank5;
	
	@FindBy (xpath="//button[@class='ui large primary button'][text()='Explore Campaigns']")
	public WebElement camp;
	
	@FindBy (xpath="//BUTTON[@class='ui primary button'][text()='Dashboard']")
	public WebElement dash;
	
	@FindBy (xpath="//a[@class='ui basic compact fluid button'][text()='Add New Account']")
	public WebElement open;
	
	@FindBy (xpath="//h5[@class='ui header mb-0'][text()='Self-Directed IRA']")
	public WebElement IRA;
	
	@FindBy (xpath="//button[@class='ui primary button relaxed'][text()='Continue']")
	public WebElement NexIRA;

	
	
	@FindBy (name="netWorth")
	public WebElement worth1;
	
	@FindBy (name="income")
	public WebElement income1;
	
	@FindBy (xpath="//button[@class='ui circular icon button active multistep__btn next']")
	public WebElement Nex;
	
	@FindBy (xpath="//BUTTON[@data-cy='0']")
	public WebElement Trad;
	
	@FindBy (xpath="//button[@class='ui circular icon button active multistep__btn next']")
	public WebElement Nex1;
	
	@FindBy (xpath="//h5[@class='ui header mb-0'][text()='Checking Account']")
	public WebElement chk;
	
	
	@FindBy (xpath="//LABEL[text()='IRA Transfer']")
	public WebElement Fund;
	
	@FindBy (xpath="//button[@class='ui circular icon button active multistep__btn next']")
	public WebElement Nex2;
	
	@FindBy (xpath="//div[@class='file-uploader undefined']")
	public WebElement identity;
	
	@FindBy (xpath="//button[@class='ui large primary button relaxed'][text()='Submit for review']")
	public WebElement review;
	
	@FindBy (xpath="//H5[@class='ui header mb-0'][text()='Entity Account']")
	public WebElement entity;
	
	@FindBy (name="netAssets")
	public WebElement Asset;
	
	@FindBy (name="annualIncome")
	public WebElement Revenue;
	
	@FindBy (xpath="//button[@class='ui primary button mt-30 relaxed'][text()='Continue']")
	public WebElement Nex4;
	
	@FindBy (xpath="//BUTTON[@data-cy='fin-info-entity-submit'][text()='Continue']")
	public WebElement finfo;
	
	
	@FindBy (name="name")
	public WebElement name;
	
	@FindBy (name="taxId")
	public WebElement taxId;

	@FindBy (name="entityType")
	public WebElement Entity;
	
	@FindBy (xpath="//SPAN[@class='text'][text()='LLC']")
	public WebElement Type;
	
	@FindBy (xpath="//DIV[@class='default text'][text()='Select']")
	public WebElement state1;
	
	@FindBy (xpath="/html/body/div[1]/div/div[5]/div/div/div[3]/div/div/form/div[5]/div[2]/div[1]/input")
	public WebElement state2;
	
	
	@FindBy (name="street")
	public WebElement Street1;
	
	@FindBy (xpath="//BUTTON[@type='submit']")
	public WebElement Next5;

	@FindBy (xpath="(//P)[3]")
	public WebElement err;

	
	@FindBy (xpath="//BUTTON[@data-cy='false']")
	public WebElement Trust;
	
	@FindBy (xpath="//INPUT[@autocomplete='nope']")
	public WebElement Title;

	@FindBy (xpath="//DIV[@class='file-uploader-child']")
	public WebElement Upload;
	
	@FindBy (xpath="(//DIV[@class='file-uploader-child'])[1]")
	public WebElement Upload1;
	
	@FindBy (xpath="/html/body/div[1]/div/div[4]/div/div/div[3]/div/div/form/div[2]/div/div[2]")
	public WebElement Upload2;
	
		
	
	@FindBy (xpath="(//BUTTON[@data-cy='forma tion-doc'][text()='Continue']")
	public WebElement con;
	
	
	@FindBy (name="value")
	public WebElement Funds;
	
	@FindBy (xpath="(//button[@class='ui large primary button  relaxed'][text()='Confirm']")
	public WebElement Confirm;
	
	@FindBy (xpath="//BUTTON[@class='ui large primary button  relaxed'][text()='Confirm']")
	public WebElement Confirmentity;
	
//	
//	@FindBy (xpath="(//BUTTON[@class='ui large primary button relaxed'][text()='Submit for review']")
//	public WebElement Review;
	

	
	
	public Login(WebDriver driver)
	{
		
		
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	
	//	  public WebElement btn_login(WebDriver d)throws Exception
//	    {
//	 	   try
//	 	   {
//	 		   element= d.findElement(By.xpath("//A[@class='ui button secondary'][text()='Log In']"));
//	 		   System.out.println("Login button found");
//	 		   
//	 	   }
//	 	   
//	 	   catch(Exception e)
//	 		 {
//	 		   throw e;
//	 		  }
//	 		
//	 		 return element;
//	     }
	  
	  
	 /* public WebElement txt_pwd(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   element= d.findElement(By.name("password"));
	 		   
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }*/
	  
	  public WebElement btn_logs(WebDriver d)throws Exception
	    {
	 	   try
	 	   {
	 		   element= d.findElement(By.xpath("//BUTTON[@class='ui large primary button very relaxed'][text()='Log in']"));
	 		   
	 	   }
	 	   
	 	   catch(Exception e)
	 		 {
	 		   throw e;
	 		  }
	 		
	 		 return element;
	     }
	  
	  
	  public WebElement btn_signup(WebDriver d)throws Exception
	  {
		  try
		  {
			  element= d.findElement(By.xpath("//a[@class='ui button primary'][text()='Sign Up']"));
			  System.out.println("Signup button found");
		  }
	  
	     catch(Exception e)
		  {
	    	 throw e;
		  }
		  return element;
	    }
	  
	  
	  public WebElement btn_investor(WebDriver d)throws Exception
	  {
		  try
		  {
			  element= d.findElement(By.xpath("//BUTTON[@data-cy='investor']"));
			  
		  }
	  
	     catch(Exception e)
		  {
	    	 throw e;
		  }
		  return element;
	    }

	  public WebElement btn_open(WebDriver d)throws Exception
	  {
		  try
		  {
			  element= d.findElement(By.xpath("//A[@class='ui large primary button very relaxed'][text()='Open account']"));
			  
		  }
	  
	     catch(Exception e)
		  {
	    	 throw e;
		  }
		  return element;
	    }

	  
	 
	  
	  public WebElement email_add(WebDriver d)throws Exception
	  {
		  try
		  {
			  element= d.findElement(By.name("email"));
		  }
	  
	   catch(Exception e)
		  {
		   throw e;
		  }
	  return element;
	  
	  }
	  
	  public WebElement pwd(WebDriver d)throws Exception
	  {
		  try
		  {
			  element= d.findElement(By.name("password"));
		  }
	  
	   catch(Exception e)
		 
	   {
		   throw e;
		  }
		  
	  return element;
	  
	  }
	  
	  
	  public WebElement ssn(WebDriver d)throws Exception
	  {
		  try
		  {
			  element= d.findElement(By.name("ssn"));
		  }
	  
	   catch(Exception e)
		 
	   {
		   throw e;
		  }
		  
	  return element;
	  
	  }
	  
	  
	  
	  
	  
	  public WebElement btn_register(WebDriver d)throws Exception
	  {
		  try
		  {
			  element= d.findElement(By.xpath("//button[@class='ui large fluid primary button very relaxed'][text()='Register']"));
		  }
	  
	   catch(Exception e)
		  {
		   throw e;
		  }
	  
		 return element;
	  
	  }
	  
	  public WebElement confirm_email(WebDriver d)throws Exception
	  {
		  try
		  {
			  element= d.findElement(By.xpath("//INPUT[@data-id='0']"));
			  element= d.findElement(By.id("2b5de8e6-f584-4656-9796-b3cda9f5ae73-1"));
			  element= d.findElement(By.id("2b5de8e6-f584-4656-9796-b3cda9f5ae73-2"));
			  element= d.findElement(By.id("2b5de8e6-f584-4656-9796-b3cda9f5ae73-3"));
			  element= d.findElement(By.id("2b5de8e6-f584-4656-9796-b3cda9f5ae73-4"));
			  element= d.findElement(By.id("2b5de8e6-f584-4656-9796-b3cda9f5ae73-5"));
		  }
	  
	   catch(Exception e)
		  {
		   throw e;
		  }
	  
		 return element;
	  
	  }
	  
 }
