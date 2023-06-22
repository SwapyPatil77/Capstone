package CapstoneProject.CapstoneProject;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import capstonepageobject.AccountVerification;
import capstonepageobject.Deleteaccount;
import capstonepageobject.Singup;
import capstonepageobject.UserRegistration;
import config.BaseConfig;

public class Test1 extends BaseConfig {
	public Singup homesignup;
	public UserRegistration Filluserdetails;
	public AccountVerification VerifyAccount;
	public Deleteaccount deleteaccverify;
	
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		 homesignup = new Singup(driver);
		 Filluserdetails = new UserRegistration(driver);
		 VerifyAccount = new AccountVerification(driver);
		 deleteaccverify = new Deleteaccount(driver);
	}
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
        // Class 1
		homesignup.HomePagesignup();
		homesignup.VisiblesignupCheck();
		homesignup.EnterNameEmail();
		homesignup.Clickenter();
		
		// Class 2
		Filluserdetails.VisiblesignupCheck();
		Filluserdetails.filldetialsAccountuser();
		
		// Class 3
		VerifyAccount.AccountButtonVerify();
		
		// Class 4
		deleteaccverify.AccountButtonVerify();
	}



}