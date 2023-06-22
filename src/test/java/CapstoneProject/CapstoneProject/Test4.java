package CapstoneProject.CapstoneProject;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import RemovefromCart.AddToCart;
import RemovefromCart.Login2;
import config.BaseConfig;

public class Test4 extends BaseConfig{
		
		public Login2 Login2obj;
		public AddToCart AddToCartobj;

		
		
		WebDriver driver;
		
		@Parameters({"Port"})
		@BeforeClass
		public void setup1(String Port) throws MalformedURLException
		{
			driver=setUp(Port);
			
			Login2obj = new Login2(driver);
			AddToCartobj= new AddToCart(driver);
		
				
		}
		
		@Test
		public void scenarioDemo() throws InterruptedException
		{
			Login2obj.Loginusers4();
			AddToCartobj.Addcartclick();	
			
			
		}

	}


