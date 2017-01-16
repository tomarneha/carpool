package Pages;

import java.util.Iterator;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * A login page
 */
public class OfferRidePage extends BasePage {
	final static Logger logger = Logger.getLogger(MyVehiclePage.class);

    
   
    public OfferRidePage(AppiumDriver driver) {
    	
        super(driver);
    }
    
    public List<WebElement> getWebElementList(By by) {

        return driver.findElements(by);
    }
    
    public void offeraride(){
    	logger.trace("--------Offer Ride Test Case Started------\n\n\n\n");
    	
    	
    	 	List<WebElement> weList = null;
    	    weList = getWebElementList(By.className("android.widget.ImageView"));
	        weList.get(1).click();
	        
	        
	        logger.trace("SOURCE"+driver.getPageSource());
	        List<WebElement> buttonList = null;
	        buttonList = getWebElementList(By.className("android.widget.Button"));
	        for (WebElement we : buttonList) {
	        	logger.trace("text"+we.getTagName());
	        }
	        buttonList.get(0).click();
	        
	        
    	
    	// driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'iv_offer_ride']")) .click();
			
		// driver.findElement(By.xpath("//android.widget.TextView[@text='My Profile']")).click();
		// Thread.sleep(10000);
	//	driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'editText')and @text='Enter Number. 9893398378. Double tap to edit.']")).clear();
					
		//driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'editText')and @text='Enter Number. Editing.']")).sendKeys("9893398378");
		
	//	 driver.hideKeyboard();
	//	driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btn_update')and @text='Update Profile']")).click();
    }
    

}
