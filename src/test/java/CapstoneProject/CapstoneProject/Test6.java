package CapstoneProject.CapstoneProject;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ProductReview.Login3;
import ProductReview.Products;
import ProductReview.ReviewProduct;
import config.BaseConfig;

public class Test6 extends BaseConfig {
		
		public Login3 Login3obj;
		public Products allobj;
		public ReviewProduct reviewobj;
	    WebDriver driver;
		
		@Parameters({"Port"})
		@BeforeClass
		public void setup2(String Port) throws MalformedURLException
		{
			driver=setUp(Port);
			
			Login3obj=new Login3(driver);
			allobj=new Products(driver);
			reviewobj=new ReviewProduct(driver);
		}

		
		@Test
		public void DemoScenario() 
		{
			Login3obj.Loginuserss6();
			allobj.PerformReview();
			reviewobj.EnterReview();
		}


	}

