

package Pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import utilities.Propertyutil;

import java.util.concurrent.TimeUnit;

/**
 * A base for all the pages within the suite
 */
public abstract class BasePage {
	final static Logger logger = Logger.getLogger(BasePage.class);
	

    /**
     * The driver
     */
    protected final AppiumDriver driver;

    /**
     * A base constructor that sets the page's driver
     *
     * The page structure is being used within this test in order to separate the
     * page actions from the tests.
    
     * @param driver the appium driver created in the beforesuite method.
     */
    protected BasePage(AppiumDriver driver){
    	logger.trace(" Base Page Constructor:");
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
    }
}