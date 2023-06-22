package ProductReview;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login3 {
	
		WebDriver driver;

		  public Login3  (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		 
		// Click on sign up/login button 
		@FindBy(xpath="//a[normalize-space()='Signup / Login']")
		public WebElement clickbutton6;
		
		// verify "Login to your account" visible
		@FindBy(xpath="//h2[normalize-space()='Login to your account']")
		public WebElement loginvisible6;

		
	//Enter correct email address and password [that was used for creating the registration flow]
		@FindBy(xpath="//input[@name='email']")
		public WebElement Enteremail6;
		
		@FindBy(xpath="//input[@placeholder='Password']")
		public WebElement Enterpass6;

		
	//Click 'login' button
		@FindBy(xpath= "//button[normalize-space()='Login']")
		public WebElement Clickloginbutton6;
		 
		
	public void Loginuserss6()
		{
		  
		clickbutton6.click();
		
		System.out.println(loginvisible6.isDisplayed());
		Assert.assertTrue(loginvisible6.isDisplayed(),("Login to your account"));

		Enteremail6.sendKeys("swaruppatil@gmail.com");
		Enterpass6.sendKeys("Xyz@123");

		Clickloginbutton6.click();
	}


}


