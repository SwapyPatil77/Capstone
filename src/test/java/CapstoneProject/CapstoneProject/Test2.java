package CapstoneProject.CapstoneProject;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import capstonepageobject.Singup;
import config.BaseConfig;
import correctlogin.DeleteAccount2;
import correctlogin.Login;

public class Test2 extends BaseConfig{
	
		public Login Login1;
		public DeleteAccount2 deleteccount;
		public Singup homelogin1;
		
		WebDriver driver;
		
		@Parameters({"Port"})
		@BeforeClass
		public void setup1(String Port) throws MalformedURLException
		{
			driver=setUp(Port);
			
			Login1 = new Login(driver);
			deleteccount = new DeleteAccount2(driver);
		} 
		
		@Test
		public void scenarioDemo() throws InterruptedException
		{
			
	        // Class 1
			homelogin1.HomePagesignup();
			homelogin1.VisiblesignupCheck();
			Login1.enteremailandpassword();
			Login1.loginclick();
			
			// class 2
			deleteccount.AccountButtonVerify();
		}



	}


