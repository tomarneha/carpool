package Pages;

import java.util.List;

import io.appium.java_client.AppiumDriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Update MyVehicle information
 */
public class MyVehiclePage extends BasePage {
	final static Logger logger = Logger.getLogger(MyVehiclePage.class);
	

	public MyVehiclePage(AppiumDriver driver) {

		super(driver);
	}

	public List<WebElement> getWebElementList(By by) {

		return driver.findElements(by);
	}

	public void updateinfo() throws InterruptedException {
		logger.trace("--------Update Vehicle Info Test Case Started------\n\n\n\n");

		driver.findElement(By.xpath("//android.widget.ImageButton")).click();

		driver.findElement(By.xpath("//android.widget.TextView[@text='My Vehicle']")).click();
		Thread.sleep(5000);

		List<WebElement> weList = null;
		weList = getWebElementList(By.className("android.widget.EditText"));
		 int i=0;
		for (WebElement we : weList) {
			i++;
			logger.trace("i:"+i);

		if (we.getText().contains("Ex: HR-26-CK-9876.")) {
				logger.trace("found" + we.getText());
				we.clear();
				we.sendKeys("HR-26-CK-9876");
			}else 	if (we.getText().contains("UP-16-AR-2880. Editing.")) {
				logger.trace("found" + we.getText());
				we.clear();
				we.sendKeys("UP-16-AR-2880");
			}  
	/*	  if (we.getText().contains("Ex: BMW, AUDI. Honda City. Double tap to edit.")) {
				logger.trace("found" + we.getText());
				we.clear();
				we.sendKeys("i10");
			}  
			 else 	if (we.getText().contains("Double tap to edit.")) {
					logger.trace("found" + we.getText());
					we.clear();
					we.sendKeys("Honda City"); 
			 }  
			if (we.getText().contains("Ex: RED, BLACK. Red. Double tap to edit.")) {
					logger.trace("found" + we.getText());
					we.clear();
					we.sendKeys("White");
			 }  
			 else 	if (we.getText().contains("Double tap to edit.")) {
					logger.trace("found" + we.getText());
					we.clear();
					we.sendKeys("Red");
				}  
            
*/
		}
		// driver.hideKeyboard();
		Thread.sleep(5000);

		// if(we.getText().contains("Ex: BMW, AUDI.")){

		driver.hideKeyboard();

		driver.findElement(
				By.xpath("//android.widget.Button[contains(@resource-id,'btn_update')and @text='Update Info']"))
				.click();

	}

}
