package Pages;

import java.util.List;

import io.appium.java_client.AppiumDriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * A Update MyVehicle information
 */
public class MyInterestsPage extends BasePage {
	final static Logger logger = Logger.getLogger(MyInterestsPage.class);

	public MyInterestsPage(AppiumDriver driver) {

		super(driver);
	}

	public List<WebElement> getWebElementList(By by) {

		return driver.findElements(by);
	}

	public void updateinfo() throws InterruptedException {
		logger.trace("--------My Interests Test Case Started------\n\n\n\n");

		driver.findElement(By.xpath("//android.widget.ImageButton")).click();

		driver.findElement(By.xpath("//android.widget.TextView[@text='My Interests']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//android.widget.ImageButton")).click();

	}

}
