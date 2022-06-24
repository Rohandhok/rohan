package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaShereByPage {
    @FindBy(xpath="//input[@type='text']") private WebElement Search;
    
    @FindBy(xpath="//span[@class='tradingsymbol']") private WebElement AshokLey;
    
    @FindBy(xpath="//button[@data-balloon='Buy']") private WebElement Buy;
    @FindBy(xpath="//button[@data-balloon='Sell']") private WebElement Sell;
    @FindBy(xpath="//button[@class='submit']") private WebElement BuyShere;
    @FindBy(xpath="//input[@label='Qty.']") private WebElement Qty;
    @FindBy(xpath="//button[@class='submit']") private WebElement SellShere;
    @FindBy(xpath="//button[@class='button-outline cancel']") private WebElement Cancelpage;
    
    
    public ZerodhaShereByPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    public void EnterSearch(String search ) {
         Search.click();
    	Search.sendKeys(search);
      }
    public void buy(WebDriver driver) {
    	Actions act =new Actions(driver);
    	act.moveToElement(AshokLey).perform();
    	act.moveToElement(Buy);
    	act.click();
    	act.perform();
    }
    public void sell(WebDriver driver) {
    	Actions act=new Actions(driver);
    	act.moveToElement(AshokLey).perform();
    	act.moveToElement(Sell);
    	act.click();
    	act.perform();
    	
    	
    }
    
    
    public void buyshere() {
    	BuyShere.click();
    }
    public void sellshere() {
    	SellShere.click();
    }
    public void Cancel() {
    	Cancelpage.click();
    }
   
    

    	
  
    
    }
  

