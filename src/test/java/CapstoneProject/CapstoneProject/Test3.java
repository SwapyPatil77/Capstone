package CapstoneProject.CapstoneProject;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.BaseConfig;
import incorrectlogin.Login3;
import incorrectlogin.LoginIncorrect;



public class Test3 extends BaseConfig{
		
		public Login3 Login3obj;
	    public LoginIncorrect LoginIncorrectobj;


	WebDriver driver;

	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		Login3obj = new Login3(driver);
		LoginIncorrectobj= new LoginIncorrect(driver);	
	}

	@Test
	public void scenarioDemo() throws InterruptedException
	   {
		Login3obj.Homeclick3();
		LoginIncorrectobj.enteremailandpassword2();
	    }

	}


