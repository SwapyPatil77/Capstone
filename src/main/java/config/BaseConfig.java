package config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseConfig {
	

	
		 WebDriver driver;
		    String nodeURL;
		 public WebDriver setUp(String Port) throws MalformedURLException
		    {           
		        if(Port.equalsIgnoreCase("5555"))
		        {
		            nodeURL = "http://172.20.10.2:4444/wd/hub";         
		            System.out.println("Chrome Browser Initiated");
		            DesiredCapabilities capabilities = DesiredCapabilities.chrome();            
		            capabilities.setBrowserName("chrome");
		            capabilities.setPlatform(Platform.WINDOWS);
		            
		            driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
		            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		            
		            driver.get("https://automationexercise.com/");
		            driver.manage().window().maximize();
		            
		        }
		        
		        
		        else
		            if(Port.equalsIgnoreCase("6666"))
		            {
		                nodeURL = "http://172.20.10.2:4444/wd/hub";
		                System.out.println("Microsoft Browser Initiated");
		                DesiredCapabilities capabilities1 = DesiredCapabilities.edge();
		                capabilities1.setBrowserName("MicrosoftEdge");
		                capabilities1.setPlatform(Platform.WINDOWS);
		                
		                driver = new RemoteWebDriver(new URL(nodeURL),capabilities1);  
		                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		                
		                driver.get("https://automationexercise.com/");
		                driver.manage().window().maximize();
		               
		            }
		        
		       
		    
		 return driver;
		    }

	}

