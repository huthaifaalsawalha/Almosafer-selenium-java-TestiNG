import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class Setup {

	WebDriver driver = new ChromeDriver();
	SoftAssert myassert=new SoftAssert();
	
	@BeforeTest
	public void GoWebsite() {
		
		driver.get("https://www.almosafer.com/en");
	     driver.manage().window().maximize();
	     
		
		
	}
	
	public void javaScript(WebElement element) throws InterruptedException {
		
		
	/*	JavascriptExecutor executor = (JavascriptExecutor)driver;
          executor.executeScript("arguments[0].setAttribute('style' , 'background: blue !important')", element);
          //executor.ExecuteScript("arguments[0].scrollIntoView(true);", element);
          Thread.sleep(1000);

          executor.executeScript("arguments[0].setAttribute('style' , 'background: none !important')", element);
          Thread.sleep(1000);*/
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.backgroundColor = 'Gold';", element);
	      Thread.sleep(1000);
	      jse.executeScript("arguments[0].setAttribute('style' , 'background: none !important')", element);
	      Thread.sleep(1000);
		
	}
	

	@AfterTest()
	public void EndTest() {
		
		driver.quit();
	}
	
	
	
}
