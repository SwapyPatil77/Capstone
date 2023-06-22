package capstonepageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class Deleteaccount {
	
		WebDriver driver;

		  public Deleteaccount(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		// Verify that 'Logged in as user name' is visible
		@FindBy(xpath="//b[normalize-space()='Swarup Patil']")
		public WebElement verifyusername;
		
		// Click 'Delete Account' button
		@FindBy(xpath="//a[normalize-space()='Delete Account']")
		public WebElement deleteAccButtton;

		// Verify that 'ACCOUNT DELETED!' is visible
		@FindBy(xpath="//b[normalize-space()='Account Deleted!']")
		public WebElement verifyAccDelete;
		
		// click 'Continue' button
		@FindBy(xpath="//a[@class='btn btn-primary']")
		public WebElement clickContinue;
		
		

		public void AccountButtonVerify() 
		{
			System.out.println(verifyusername.isDisplayed());
	    	Assert.assertTrue(verifyusername.isDisplayed(),("Logged in as Swarup Patil"));
	    	
	    	deleteAccButtton.click();
	    	
	    	System.out.println(verifyusername.isDisplayed());
	    	Assert.assertTrue(verifyusername.isDisplayed(),("ACCOUNT DELETED!"));  
	    	
	    	clickContinue.click();
	    	
		}

	}



