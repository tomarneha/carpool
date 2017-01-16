
package Pages;

import java.util.Iterator;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Propertyutil;

/**
 * A login page
 */
public class FindRidePage extends BasePage {
	final static Logger logger = Logger.getLogger(FindRidePage.class);
	
	

    
   
    public FindRidePage(AppiumDriver driver) {
    	
        super(driver);
    }
    
    public List<WebElement> getWebElementList(By by) {

        return driver.findElements(by);
    }
    
    public void offeraride() throws InterruptedException{
    	logger.trace("--------Find Ride Test Case Started------\n\n\n\n");
    	
    	
    	driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'iv_find_ride')]")).click();
    	driver.findElement(By.xpath("//android.widget.CheckBox[@text='Include all active rides' and @index='6']")).click();

		driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btn_find') and @text='Find']")).click();
		Thread.sleep(5000);
		
		logger.trace("--------Search rides displayed------\n\n\n\n");

		driver.findElement(By.xpath("//android.widget.TextView[@text='Interested?' and @index='0']")).click();

		Thread.sleep(5000);

/**
 * Move back to Find Ride page
 */
		driver.findElement(By.xpath("//android.widget.ImageButton")).click();     
		     
		/**
		 * Move back to Home page
		 */
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']")).click(); 	   	
    	
    }
    

}
