package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import POM.ZerodhaforgetPage;
import Utility.Parameterization;
@Listeners(TestListeners.class)

public class ForgotPageTest extends BaseTest {
//     WebDriver driver;
     
     @BeforeMethod
     public void browser() {
    	 driver=Browser.openBrowser();
     }
     @Test
     public void ForgotPassword() throws EncryptedDocumentException, IOException, InterruptedException {
    	ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
 		String username=Parameterization.getData(0, 1);
 		String password=Parameterization.getData(1, 1);
 		zerodhaLoginPage.enterUserId(username);
 		zerodhaLoginPage.enterPassword(password);
 		zerodhaLoginPage.ClickOnLogin();
 		Thread.sleep(3000);
 		
 		ZerodhaPinPage zerodhapinpage=new ZerodhaPinPage(driver);
 		zerodhapinpage.ClickOnForget();
     
    	 
    	 ZerodhaforgetPage zerodhaforgotpage=new  ZerodhaforgetPage(driver);
    	 
    	 Thread.sleep(2000);
    	
    	 String UserId=Parameterization.getData(3, 1);
    	  String Pan=Parameterization.getData(4, 1);
    	  zerodhaforgotpage.EnterUserId(UserId);
    	  
    	 zerodhaforgotpage.EnterPanNumber(Pan);
    	 
    	 String Email=Parameterization.getData(5, 1);
    	 zerodhaforgotpage.EnterEmailId(Email);
    	 
    	 Thread.sleep(1000);
    	 
    	 zerodhaforgotpage.ClickOnReset();
     }
    	 @Test
    	 public void newtest() {
    	 System.out.println("Hooo");
    	 }
    	 
    
    	 @Test
    	 public void classtest() {
    		 System.out.println("good morning");
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    			 
    	 
    	 
    	
    	 
     
    	 
     
}
