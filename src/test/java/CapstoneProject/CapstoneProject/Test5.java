package CapstoneProject.CapstoneProject;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.BaseConfig;
import search.Login2;
import search.searchproduct;

public class Test5 extends BaseConfig {
		
		public Login2 Login2obj;
		public searchproduct searchproductobj;
		
		
		
		WebDriver driver;
		
		@Parameters({"Port"})
		@BeforeClass
		public void setup1(String Port) throws MalformedURLException
		{
			driver=setUp(Port);
			
			Login2obj = new Login2(driver);
			searchproductobj= new searchproduct(driver);
		
				
		}
		
		@Test
		public void scenarioDemo() throws InterruptedException
		{
			
			searchproductobj.clickProduct5();	
			searchproductobj.searchProductVisible5();
			searchproductobj.addToCart5();
			Login2obj.Loginuserss5();
		}

		

	}



