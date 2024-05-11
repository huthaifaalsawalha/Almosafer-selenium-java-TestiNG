import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.math.NumberUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class SortingByLowestPrice extends Setup {
/*
	@Test
	public void CheskSortingByLowestPrice() throws InterruptedException {
		
	
		
		
		Random random = new Random();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='uncontrolled-tab-example-tab-hotels']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[4]/div/div/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/input")).sendKeys("Dubai"+Keys.ENTER);
		
		
		Select locateSelect = new Select( driver.findElement(By.xpath("//select[@class='sc-tln3e3-1 gvrkTi']")));
		List <WebElement> elementCount = locateSelect.getOptions();
		int numberRand = random.nextInt(elementCount.size());
		locateSelect.selectByIndex(numberRand);
		
		Thread.sleep(3000);
		
		
		
		
		
		driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[4]/div/div/div/div[2]/div/div/div/div[4]/button")).click();
		
		Thread.sleep(30000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Lowest price']")).click();
		Thread.sleep(3000);
		// WebElement div = driver.findElement(By.cssSelector("HotelSearchResult__Hotel1__PriceLabel"));
		List <WebElement> price = driver.findElements(By.cssSelector("div[class='sc-aewfc eJTLyF sc-htpNat KtFsv col-3'] div [class='Price__Wrapper PriceDisplay__FinalRate sc-dRCTWM GFIG'] span[class='Price__Value']"));
		for(int i=0 ; i<(price.size())-1;i++) {
		
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
	
	*/
	
}
