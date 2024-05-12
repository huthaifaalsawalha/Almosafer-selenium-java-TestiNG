import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.Converter;

public class HomePage extends Setup {

	



@Test(priority = 1)
public void FlightDepartureDate () throws InterruptedException {
	
	Thread.sleep(3000);
	WebElement locateDate = driver.findElement(By.xpath("//span[normalize-space()='13']"));
	javaScript(locateDate);
	String ValueDate= locateDate.getAttribute("innerText");
	int currentDay = LocalDate.now().getDayOfMonth()+1;
	String expictedDay =String.valueOf(currentDay) ;
	
	myassert.assertEquals(ValueDate, expictedDay);
	myassert.assertAll();
		
	
}
	
	
@Test(priority = 2)
public void FlightReturnDate () throws InterruptedException {
	
	Thread.sleep(3000);
	WebElement locateDate = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[4]/div/div/div/div[1]/div/div[2]/div[1]/div/div[3]/div/div/div/div[2]/span[2]"));
	javaScript(locateDate);
	String ValueDate= locateDate.getAttribute("innerText");
	int currentDay = LocalDate.now().getDayOfMonth()+2;
	String expictedDay =String.valueOf(currentDay) ;
	
	myassert.assertEquals(ValueDate, expictedDay);
	myassert.assertAll();
		
	
}

@Test(priority = 3)
public void CheckHotelsNOTSelected() throws InterruptedException {
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[normalize-space()='English']")).click();;
	Thread.sleep(3000);
	WebElement locateHotal= driver.findElement(By.xpath("//a[@id='uncontrolled-tab-example-tab-hotels']"));
	javaScript(locateHotal);
    boolean acualValue = Boolean.parseBoolean(locateHotal.getAttribute("aria-selected"));
    boolean expectedValue = false;
	myassert.assertEquals(acualValue, expectedValue);
	myassert.assertAll();
	
	}

@Test(priority = 4)
public void CheckDefaultlanguageEN() throws InterruptedException {
	
	WebElement textLocated = driver.findElement(By.xpath("//h1[contains(text(),'Let’s book your next trip!')]"));
	javaScript(textLocated);
	String acualText = textLocated.getAttribute("innerText");
	String expectText = "Let’s book your next trip!";
	myassert.assertEquals(acualText, expectText);
	myassert.assertAll();
		
}



@Test(priority = 5)
public void CheckDefaultCurrency() throws InterruptedException {
	
	
	WebElement locateCurrency = driver.findElement(By.xpath("//button[normalize-space()='SAR']"));
	javaScript(locateCurrency);
	String acualCurrency = locateCurrency.getText();
	String expectedCurrency = "SAR";
	myassert.assertEquals(acualCurrency, expectedCurrency);
	myassert.assertAll();
	
	
}

@Test(priority = 6)
public void CheckLogo() throws InterruptedException {
	Thread.sleep(3000);
	WebElement locatelogo= driver.findElement(By.xpath("//div[@class='sc-fihHvN eYrDjb']"));
	javaScript(locatelogo);
	List<WebElement> logo = locatelogo.findElements(By.tagName("svg"));
	javaScript(logo.get(0));
	String acuallogo = logo.get(0).getAttribute("data-testid");
	String expectLogo = "Footer__QitafLogo";
	myassert.assertEquals(acuallogo, expectLogo);
	myassert.assertAll();
	
	
}



@Test(priority = 7)
public void CheakContactNumbers() throws InterruptedException {
	Thread.sleep(3000);
	String expextNumber1= "920000997";
	String expextNumber2= "+966554400000";
	String expextNumber3= "+966 55 440 0000";
	
	
	WebElement locateNumber1= driver.findElement(By.xpath("//h4[normalize-space()='920000997']"));
    javaScript(locateNumber1);
	
	WebElement locateNumber2= driver.findElement(By.xpath("//strong[normalize-space()='+966554400000']"));
	  javaScript(locateNumber2);
	WebElement locateNumber3= driver.findElement(By.xpath("//a[normalize-space()='+966 55 440 0000']"));
	  javaScript(locateNumber3);
	String acualNumber1=locateNumber1.getAttribute("innerText");
	String acualNumber2=locateNumber2.getAttribute("innerText");
	String acualNumber3=locateNumber3.getAttribute("innerText");
	
	myassert.assertEquals(expextNumber1, acualNumber1);
	myassert.assertEquals(expextNumber2, acualNumber2);
	myassert.assertEquals(expextNumber3, acualNumber3);
	myassert.assertAll();
	
	
	
	
	
	
}


	
	
}
