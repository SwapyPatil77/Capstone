package correctlogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DeleteAccount2 {
		WebDriver driver;

		  public DeleteAccount2(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		// Verify that 'Logged in as user name' is visible
		@FindBy(xpath="//b[normalize-space()='Swarup Patil']")
		public WebElement verifyusername1;
		
		// Click 'Delete Account' button
		@FindBy(xpath="//a[normalize-space()='Delete Account']")
		public WebElement deleteAccButtton1;

		// Verify that 'ACCOUNT DELETED!' is visible
		@FindBy(xpath="//b[normalize-space()='Account Deleted!']")
		public WebElement verifyAccDelete1;
		
		// click 'Continue' button
		@FindBy(xpath="//a[@class='btn btn-primary']")
		public WebElement clickContinue1;
		
		

		public void AccountButtonVerify() 
		{
			System.out.println(verifyusername1.isDisplayed());
	    	Assert.assertTrue(verifyusername1.isDisplayed(),("Logged in as Swarup Patil"));
	    	
	    	deleteAccButtton1.click();
	    	
	    	System.out.println(verifyusername1.isDisplayed());
	    	Assert.assertTrue(verifyusername1.isDisplayed(),("ACCOUNT DELETED!"));  
	    	
	    	clickContinue1.click();
	    	
		}

	}

