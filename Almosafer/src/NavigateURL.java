import org.testng.annotations.Test;

public class NavigateURL extends Setup {

	
	@Test(priority = 8)
	public void CheakNavigateURL() throws InterruptedException {
		
		
		String acualUrl = driver.getCurrentUrl();
		
	
		String expectedUrl = "https://global.almosafer.com/en";
		myassert.assertEquals(acualUrl, expectedUrl);
		myassert.assertAll();
		
	
	}
	
	
}
