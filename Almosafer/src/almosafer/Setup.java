package almosafer;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Setup {

	WebDriver driver = new ChromeDriver();
	SoftAssert myassert=new SoftAssert();
	public	static ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\alsaw\\OneDrive\\Desktop\\New folder (5)\\") ;
	public	static ExtentReports extent= new ExtentReports();
	public ExtentTest test;

	@BeforeClass
	public void GoWebsite() {

		driver.get("https://www.almosafer.com/en");
	     driver.manage().window().maximize();

	     
	     extent.attachReporter(spark);


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

	
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}
	
	

/*
	@AfterMethod
	public void EndTest() {
		 
		driver.quit();
	}
*/
	@AfterClass
	public void EndReport() {
		 
		  extent.flush();
			driver.quit();
	}


}
