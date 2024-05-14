package almosafer;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Random_Language extends Setup
{

	@Test()
	public void CheakRandomlanguage() throws InterruptedException {

		 test=  extent.createTest("Test Random language", "Verify Random language");
		Random random = new Random();
		int number=random.nextInt(2);
		
		System.out.println(number);

		if(number==0) {
			Thread.sleep(4000);

		WebElement locateLanguageAR	= driver.findElement(By.xpath("//a[contains(text(),'العربية')]"));
			javaScript(locateLanguageAR);
			locateLanguageAR.click();
			Thread.sleep(10000);
			WebElement locateaculText = driver.findElement(By.xpath("//span[contains(text(),'طيران')]"));
		    String acualText = locateaculText.getText();
		    System.out.println(acualText);
		    String expectText="طيران";
			myassert.assertEquals(acualText, expectText);

		}

		else {
			driver.get("https://www.almosafer.com/ar?ncr=1");
			Thread.sleep(4000);
			WebElement locateLanguageEN=	driver.findElement(By.cssSelector("a[data-testid=\"Header__LanguageSwitch\"]"));

			javaScript(locateLanguageEN);
			locateLanguageEN.click();
			Thread.sleep(10000);
			WebElement locateaculText = driver.findElement(By.xpath("//span[normalize-space()='Flights']"));
		    String acualText = locateaculText.getText();
		    String expectText="Flights";
			myassert.assertEquals(acualText, expectText);


		}
		myassert.assertAll();

	}



	@AfterMethod
	public void tearDown(ITestResult result) throws Exception {
		  Random random =new Random();
		  int num = random.nextInt();
		  String path="C:\\Users\\alsaw\\OneDrive\\Desktop\\New folder (5)\\test"+num+".png";
	 if(result.FAILURE==result.getStatus())
	 {
		   
			  test.fail(" Not Successfully");
			  //test.info(Status.FAIL, Status.INFO);
			  test.fail(result.getThrowable());
			//  test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
				takeSnapShot(driver,path) ;
			  test.addScreenCaptureFromPath(path);
			  
	 }else if(result.SUCCESS==result.getStatus()) {
		   test.pass("Successfully");
		 
		   
		   
		   
	}else {
		
		 test.skip("Skip Test");
		 test.skip(result.getThrowable());
		
	}
	}


}
