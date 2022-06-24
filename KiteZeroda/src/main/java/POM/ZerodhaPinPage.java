package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ZerodhaPinPage {
	
	@FindBy(xpath="//input[@id=\"pin\"]") private WebElement pin;
    @FindBy(xpath="//button[@type='submit']") private WebElement Submit;
	@FindBy(xpath="//a[text()='Forgot 2FA?']") private WebElement Forget;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement SignUp;
	@FindBy(xpath="//input[@type='text']]") private WebElement SearchTab;
	@FindBy(xpath="//span[@class='icon icon-trash']") private WebElement Trash;
	@FindBy(xpath="//span[@class='user-id']") private WebElement Menu;
	@FindBy(xpath="(//a[@href='/profile'])[2]") private WebElement MyProfile;
	@FindBy(xpath="//a[@href='/holdings']")private WebElement Holding;
	@FindBy(xpath="//div[@class='su-select holdings-selector']") private WebElement AllStock;

	
	
   
     public ZerodhaPinPage(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
    	 
     }
     public void Enterpin(String PinNumber) {
    	 pin.sendKeys(PinNumber);
    	  }
     public void ClickOnSubmit(){
    	 Submit.click(); 
     }
     public void ClickOnForget() {
    	 Forget.click();
     }
     public void ClickOnSignup() {
    	 SignUp.click();
     }
     public void ClickonSearch() {
    	 SearchTab.click();
     }
     public void Clickontrash() {
    	 Trash.click();
     }
     public void ClickonMenu() {
    	 Menu.click();
     }
     public void ClickonHolding() {
    	 Holding.click();
     }
     public void ClickOnMyProfile() {
    	 MyProfile.click();
     }
     public void ClickOnStock() {
    	 AllStock.click();
     }
     
     
     
}
