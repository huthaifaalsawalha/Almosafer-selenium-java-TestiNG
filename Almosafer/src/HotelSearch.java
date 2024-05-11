import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HotelSearch extends Setup

{
	/*
	@Test()
	public void CheakHotelSearch() throws InterruptedException {
		
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
     Random random =  new Random();
     int numberEn = random.nextInt(3);
     int numberAr = random.nextInt(2);
     
     int numberLang = random.nextInt(2);
		
		String [] cityEn  = {"Dubai","Jeddah","Riyadh"}; 
		String [] cityAr  = {"دبي","جدة"}; 
		
		if(numberLang == 0) {
			
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//a[normalize-space()='English']")).click();
			
			driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[4]/div/div/nav/a[2]/div")).click();
			Thread.sleep(3000);
		WebElement locateCity = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[4]/div/div/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/input"));
		
		     locateCity.sendKeys(cityEn[numberEn]);;
			driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[4]/div/div/div/div[2]/div/div/div/div[1]/div/div/div/ul/li[2]")).click();
			
			String acualCity = locateCity.getAttribute("value");
			
			myassert.assertEquals(acualCity, cityEn[numberEn]);
			myassert.assertAll();
			
			
			
		}else
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'العربية')]")).click();
			
	       driver.findElement(By.xpath("//a[@id='uncontrolled-tab-example-tab-hotels']")).click();
			
			
		
			WebElement locateCity = driver.findElement(By.xpath("//input[@placeholder='البحث عن فنادق أو وجهات']"));
			
			locateCity.sendKeys(cityAr[numberAr]);
			
			driver.findElement(By.xpath("//li[@class='sc-phbroq-5 dxuHWJ AutoComplete__ListItem AutoComplete__ListItem--highlighted AutoComplete__ListItem ']")).click();
			
			String acualCity = locateCity.getAttribute("value");
			
			myassert.assertEquals(acualCity, cityAr[numberAr]);
			myassert.assertAll();
			
		}
		

		
	}
*/
}
