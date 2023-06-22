package ProductReview;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Products {
	
		WebDriver driver;

		  public Products(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		  @FindBy(xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
		   public WebElement Button6;
		  
		  
		  @FindBy(xpath="//*[text()=' Products'][@style='color: orange;']")
		   public WebElement AllProduct;
		  
		  @FindBy(xpath="//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")
		  public WebElement ClickViewProduct;
		  
		  public void PerformReview()
		  {
			  Button6.click();  
			  Assert.assertEquals(AllProduct.isDisplayed(), true);
			  ClickViewProduct.click();
			  
		  }
		  

	}


