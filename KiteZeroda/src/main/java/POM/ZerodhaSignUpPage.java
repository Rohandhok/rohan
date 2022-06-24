package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {
	@FindBy(xpath="//a[@class='text-light']") private WebElement ClickonSign;
	@FindBy(xpath="//input[@id='user_mobile']") private WebElement mobile;
    @FindBy(xpath="//button[@type='submit']") private WebElement Submit;
    
    public ZerodhaSignUpPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    public void clickonSign() {
    	ClickonSign.click();
    }
    public void EmterMoblieNum( String sign) {
    	mobile.sendKeys(sign);
    }
    public void ClickOnSubmit() {
    	Submit.click();
    	
    	
    	
    	
    }
}
