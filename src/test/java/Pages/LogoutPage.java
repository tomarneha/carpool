package Pages;


import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

import utilities.Propertyutil;


/**
 * A login page
 */
public class LogoutPage extends BasePage {
	final static Logger logger = Logger.getLogger(LogoutPage.class);
    /**
     * The login button
     */
     
   
	public LogoutPage(AppiumDriver driver) {

		super(driver);
	}

	public List<WebElement> getWebElementList(By by) {

		return driver.findElements(by);
	}

	public void logout() throws InterruptedException {
		logger.trace("--------Logout Test Case Started------\n\n\n\n");

		driver.findElement(By.xpath("//android.widget.ImageButton")).click();

		driver.findElement(By.xpath("//android.widget.TextView[@text='Logout']")).click();
		Thread.sleep(5000);

	logger.trace("Logout confirmation modal is displayed");

		driver.findElement(
				By.xpath("//android.widget.Button[contains(@resource-id,'button1')and @text='YES']")).click();

	}

}
