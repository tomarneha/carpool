package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Keys;

/**
 * A page for a web view
 */
public class WebViewPage extends BasePage{
    /**
     * the web view input
     */
    @AndroidFindBy(id = "website_input")
    private MobileElement webViewInput;

    public WebViewPage(AppiumDriver driver) {
        super(driver);
    }

   
    public void gotoUrl(String url) throws InterruptedException {
        webViewInput.sendKeys(url+"\n");
        Thread.sleep(6000);
    }

    /**
     *
     * @return webview content description
     */
    public boolean getWebDescription(String accessibilityId){
        return ! (driver.findElementsByAccessibilityId(accessibilityId).isEmpty());
    }
}
