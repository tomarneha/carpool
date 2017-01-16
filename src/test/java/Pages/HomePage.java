

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
public class HomePage extends BasePage {
	final static Logger logger = Logger.getLogger(HomePage.class);
    /**
     * The Welcome Message 
     */
 
    
		 
	
    
   
    public HomePage(AppiumDriver driver) {
    	
        super(driver);
    }
    
    public List<WebElement> getWebElementList(By by) {

        return driver.findElements(by);
    }
 /*   
    public void updateprofilewithblank(){
    	logger.trace("--------Update profile Test Case Started------");
    		
    	 driver.findElement(By.xpath("//android.widget.ImageButton")) .click();
			
		 driver.findElement(By.xpath("//android.widget.TextView[@text='My Profile']")).click();
		 try {
			Thread.sleep(10000);
		
		 
		 
		 
		 List<WebElement> weList = null;
	        weList = getWebElementList(By.className("android.widget.EditText"));
	        for (WebElement we : weList) {
	        	
	            if(we.getText().contains("Enter Number. 78919")){
	            	logger.trace("found"+we.getText());
	            	we.clear();
	            	we.sendKeys("9711222123");
	            }else if(we.getText().contains("Enter Number. 97112")){
	            	logger.trace("found"+we.getText());
		               we.clear();
		            	we.sendKeys("7891991919");
		            }
	        }           
		 
		 
		 
		 
		//driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'editText')and @text='Enter Number. 9893398378. Double tap to edit.']")).clear();
					
		
		 driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btn_update')and @text='Update Profile']")).click();
		
		
		
		
		//driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'editText')and @text='Enter Number. Editing.']")).sendKeys("9893398379");
		
		
		 //driver.hideKeyboard();
		//driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btn_update')and @text='Update Profile']")).click();
		 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	*/	 
		
	
    
    
    public void updateprofile(){
    	logger.trace("--------Update profile Test Case Started------");
    
    	    	
    	 
    	 driver.findElement(By.xpath("//android.widget.ImageButton")) .click();
    	
			
		 driver.findElement(By.xpath("//android.widget.TextView[@text='My Profile']")).click();
		// Thread.sleep(10000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'editText')and @text='Enter Number. 9893398378. Double tap to edit.']")).clear();
					
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'editText')and @text='Enter Number. Editing.']")).sendKeys("9893398378");
		
		 driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'btn_update')and @text='Update Profile']")).click();
		
    }
    

}
