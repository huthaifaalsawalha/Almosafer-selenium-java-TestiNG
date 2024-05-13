package almosafer;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Random_Language extends Setup
{

	@Test(priority = 10)
	public void CheakRandomlanguage() throws InterruptedException {

		Random random = new Random();
		int number=random.nextInt(2);
		System.out.println(number);

		if(number==0) {
			Thread.sleep(4000);

		WebElement locateLanguageAR	= driver.findElement(By.xpath("//a[contains(text(),'العربية')]"));
			javaScript(locateLanguageAR);
			locateLanguageAR.click();
			Thread.sleep(10000);
			WebElement locateaculText = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[4]/div/div/nav/a[1]/div"));
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
			WebElement locateaculText = driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[4]/div/div/nav/a[1]/div"));
		    String acualText = locateaculText.getText();
		    String expectText="Flights";
			myassert.assertEquals(acualText, expectText);


		}
		myassert.assertAll();

	}





}
