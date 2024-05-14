package almosafer;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SearchResultsPage extends Setup{


	@Test()
   public void CheakSearchResults() throws InterruptedException {

		 test=  extent.createTest("Test Search Results", "Verify Search Results");
		Random random = new Random();

		Thread.sleep(3000);
	    WebElement locateHoteal=	driver.findElement(By.xpath("//a[@id='uncontrolled-tab-example-tab-hotels']"));
	    javaScript(locateHoteal);
	    locateHoteal.click();
		Thread.sleep(8000);

		WebElement locatInput= driver.findElement(By.xpath("//input[@placeholder='Search for hotels or places']"));
		javaScript(locatInput);
		locatInput.sendKeys("Dubai"+Keys.ENTER);



		WebElement locateSelect2=driver.findElement(By.xpath("//select[@class='sc-tln3e3-1 gvrkTi']"));

		locateSelect2.click();
		Thread.sleep(3000);
		Select locateSelect = new Select( driver.findElement(By.xpath("//select[@class='sc-tln3e3-1 gvrkTi']")));

		List <WebElement> elementCount = locateSelect.getOptions();

		int numberRand = random.nextInt(elementCount.size()-1);

		  javaScript(elementCount.get(numberRand));

		locateSelect.selectByIndex(numberRand);


		Thread.sleep(3000);





	WebElement locateButtonSearch = 	driver.findElement(By.xpath("//button[@class='sc-jTzLTM hQpNle sc-1vkdpp9-6 iKBWgG js-HotelSearchBox__SearchButton btn btn-primary btn-block']"));

	javaScript(locateButtonSearch);
	locateButtonSearch.click();
	Thread.sleep(30000);

		List<WebElement> locateTest = driver.findElements(By.cssSelector("div>div.sc-fvLVrH >span "));
		//javaScript(locateTest.get(1));
        Thread.sleep(3000);

		for (WebElement element : locateTest) {

			javaScript(element);
			Boolean acualText=(element.getText()).contains("Dubai");

			  myassert.assertEquals(acualText, true);



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
