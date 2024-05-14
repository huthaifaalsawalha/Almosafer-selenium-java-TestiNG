package almosafer;

import java.util.Random;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class NavigateURL extends Setup {


	@Test
	public void CheakNavigateURL() throws InterruptedException {

		 test=  extent.createTest("Test Navigate URL", "Verify Navigate URL");
		Thread.sleep(4000);
            
		String acualUrl = driver.getCurrentUrl();
    

		String expectedUrl = "https://www.almosafer.com/en?ncr=1";
		myassert.assertEquals(acualUrl, expectedUrl);
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
