import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SearchResultsPage extends Setup{
	
	/*
	@Test()
   public void CheakSearchResults() throws InterruptedException {
		
		
		Random random = new Random();

		Thread.sleep(3000);
	    WebElement locateHoteal=	driver.findElement(By.xpath("//a[@id='uncontrolled-tab-example-tab-hotels']"));
	    javaScript(locateHoteal);
	    locateHoteal.click();
		Thread.sleep(4000);
		
		WebElement locatInput= driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[4]/div/div/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/input"));
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
		
		
		
		
		
	WebElement locateButtonSearch = 	driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[4]/div/div/div/div[2]/div/div/div/div[4]/button"));
		
	javaScript(locateButtonSearch);
	locateButtonSearch.click();
	Thread.sleep(30000);
		
		List<WebElement> locateTest = driver.findElements(By.cssSelector("div>div.sc-fvLVrH >span "));
		//javaScript(locateTest.get(1));
        Thread.sleep(3000);
		
		for(int i = 0; i<locateTest.size();i++) {
			
			javaScript(locateTest.get(i));
			Boolean acualText=(locateTest.get(i).getText()).contains("Dubai");
			
			  myassert.assertEquals(acualText, true);
			
			
		
		}
		
	
		myassert.assertAll();
		
	}


*/

	

}
