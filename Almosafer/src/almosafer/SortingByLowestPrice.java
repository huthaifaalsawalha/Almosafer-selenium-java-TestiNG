package almosafer;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.math.NumberUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class SortingByLowestPrice extends Setup {

	@Test()
	public void CheskSortingByLowestPrice() throws InterruptedException {


		 test=  extent.createTest("Test Sorting By Lowest Price", "Verify Sorting By Lowest Price");

		Random random = new Random();

		Thread.sleep(3000);
	    WebElement locateHotel=	driver.findElement(By.xpath("//a[@id='uncontrolled-tab-example-tab-hotels']"));
		javaScript(locateHotel);
	    locateHotel.click();
		Thread.sleep(4000);

		WebElement locateInput=	driver.findElement(By.xpath("//input[@placeholder='Search for hotels or places']"));
		javaScript(locateInput);
		locateInput.sendKeys("Dubai"+Keys.ENTER);

		Select locateSelect = new Select( driver.findElement(By.xpath("//select[@class='sc-tln3e3-1 gvrkTi']")));
		List <WebElement> elementCount = locateSelect.getOptions();
		int numberRand = random.nextInt(elementCount.size());
		javaScript(elementCount.get(numberRand));
		locateSelect.selectByIndex(numberRand);

		Thread.sleep(3000);





	    WebElement locateButtonSearch =	driver.findElement(By.xpath("//button[@class='sc-jTzLTM hQpNle sc-1vkdpp9-6 iKBWgG js-HotelSearchBox__SearchButton btn btn-primary btn-block']"));
		javaScript(locateButtonSearch);
		locateButtonSearch.click();
		Thread.sleep(30000);

	    WebElement locateLowestPrice = 	driver.findElement(By.xpath("//button[normalize-space()='Lowest price']"));
	     javaScript(locateLowestPrice);
	     locateLowestPrice.click();
		Thread.sleep(3000);

		List <WebElement> price = driver.findElements(By.cssSelector("div[class='sc-aewfc eJTLyF sc-htpNat KtFsv col-3'] div [class='Price__Wrapper PriceDisplay__FinalRate sc-dRCTWM GFIG'] span[class='Price__Value']"));

		for(int i=0 ; i<(price.size())-1;i++) {
			  javaScript(price.get(i));


		int num1= NumberUtils.toInt(price.get(i).getText()) ;
		int num2= NumberUtils.toInt(price.get(i+1).getText()) ;
		if(num1 != num2) {
			myassert.assertEquals(Integer.compare(num1, num2), -1);

		}else {
			myassert.assertEquals(Integer.compare(num1, num2), 0);
		}


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
