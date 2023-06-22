package RemovefromCart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login2 {
		WebDriver driver;

		  public Login2 (WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		 
		// Click on sign up/login button 
		@FindBy(xpath="//a[normalize-space()='Signup / Login']")
		public WebElement clickbutton4;
		
		// verify "Login to your account" visible
		@FindBy(xpath="//h2[normalize-space()='Login to your account']")
		public WebElement loginvisible4;

		
	// Enter correct email address and password [that was used for creating the registration flow]
		@FindBy(xpath="//input[@name='email']")
		public WebElement Enteremail4;
		
		@FindBy(xpath="//input[@placeholder='Password']")
		public WebElement Enterpass4;

		
	// Click 'login' button
		@FindBy(xpath= "//button[normalize-space()='Login']")
		public WebElement Clickloginbutton4;
		 
		
	public void Loginusers4()
		{
		  
		clickbutton4.click();
		
		System.out.println(loginvisible4.isDisplayed());
		Assert.assertTrue(loginvisible4.isDisplayed(),("Login to your account"));

		Enteremail4.sendKeys("swaruppatil@gmail.com");
		Enterpass4.sendKeys("Xyz@123");

		Clickloginbutton4.click();
	}

}

