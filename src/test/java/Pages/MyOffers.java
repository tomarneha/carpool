package Pages;

import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 * Home page
 */
public class MyOffers extends BasePage {
	final static Logger logger = Logger.getLogger(MyOffers.class);


   
    public MyOffers(AppiumDriver driver) {
    	
        super(driver);
    }
    	
		 public void updateprofile() throws InterruptedException {
				logger.trace("--------My Offers Test Case Started------\n\n\n\n");

				driver.findElement(By.xpath("//android.widget.ImageButton")).click();

				driver.findElement(By.xpath("//android.widget.TextView[@text='My Offers']")).click();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//android.widget.ImageButton")).click();
		
		}
    

}
