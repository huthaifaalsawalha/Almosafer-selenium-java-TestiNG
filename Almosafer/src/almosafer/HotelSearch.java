package almosafer;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HotelSearch extends Setup

{

	@Test
	public void CheakHotelSearch() throws InterruptedException {

     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     test=  extent.createTest("Test HotelSearch", "Verify Hotel Search");
     Random random =  new Random();
     int numberEn = random.nextInt(3);
     int numberAr = random.nextInt(2);

     int numberLang = random.nextInt(2);

		String [] cityEn  = {"Dubai","Jeddah","Riyadh"};
		String [] cityAr  = {"دبي","جدة"};

		if(numberLang == 0) {

			Thread.sleep(3000);
			//driver.findElement(By.xpath("//a[normalize-space()='English']")).click();

		WebElement locateHotle=	driver.findElement(By.xpath("//a[@id='uncontrolled-tab-example-tab-hotels']"));
			javaScript(locateHotle);
			locateHotle.click();
		Thread.sleep(3000);
		WebElement locateCity = driver.findElement(By.xpath("//input[@placeholder='Search for hotels or places']"));
		javaScript(locateCity);
		     locateCity.sendKeys(cityEn[numberEn]);
			driver.findElement(By.xpath("//li[@class='sc-phbroq-5 iNcvxX AutoComplete__ListItem AutoComplete__ListItem--highlighted AutoComplete__ListItem ']")).click();

			String acualCity = locateCity.getAttribute("value");

			myassert.assertEquals(acualCity, cityEn[numberEn]);
			myassert.assertAll();



		}else
		{
			Thread.sleep(3000);
		WebElement locateLang=	driver.findElement(By.xpath("//a[contains(text(),'العربية')]"));
			javaScript(locateLang);
			locateLang.click();
	    WebElement locateHotel=   driver.findElement(By.xpath("//a[@id='uncontrolled-tab-example-tab-hotels']"));
	     javaScript(locateHotel);
	     locateHotel.click();



			WebElement locateCity = driver.findElement(By.xpath("//input[@placeholder='البحث عن فنادق أو وجهات']"));
			javaScript(locateCity);
			locateCity.sendKeys(cityAr[numberAr]);

			driver.findElement(By.xpath("//li[@class='sc-phbroq-5 dxuHWJ AutoComplete__ListItem AutoComplete__ListItem--highlighted AutoComplete__ListItem ']")).click();

			String acualCity = locateCity.getAttribute("value");

			myassert.assertEquals(acualCity, cityAr[numberAr]);
			myassert.assertAll();

		}

		


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
