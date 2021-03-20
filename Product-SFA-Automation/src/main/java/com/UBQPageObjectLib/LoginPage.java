package com.UBQPageObjectLib;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.UBQGenericLib.Constants;
import com.UBQGenericLib.WebDriverCommonLib;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

/**
 * @author Praneeth
 *
 */

public class LoginPage extends WebDriverCommonLib {
	// ---For EnterUserName---//
		public void enterUserName(String uname) {
			entervalue(uname, driver.findElementById("ubq.mobi.and.product:id/userName"));
		}

		// ---For EnterPassword---//
		public void enterPassword(String pass) {
			entervalue(pass, driver.findElementById("ubq.mobi.and.product:id/password"));
		}

		// ---For ClickLoginBtn---//
		public void clickLoginBtn() {
			buttonClick(driver.findElement(By.id("ubq.mobi.and.product:id/login_button")));

		}
		
		// ---ForclickShowAndroidId---//
		public void clickShowIMEIAndroidIdBtn() {
			

		}
		
		
		// Login Function
		public void login(String uname, String pass) {
			try {
				
				waitforpageload();
				buttonClick(driver.findElement(By.id("ubq.mobi.and.product:id/login_button")));
				if (getAlertmsg().contains("User name must have a value")) {
					Thread.sleep(1000);
					acceptAlert();
				} else {
					Assert.assertEquals(getAlertmsg(), "User name must have a value");
				}
				entervalue(uname, driver.findElementById("ubq.mobi.and.product:id/userName"));
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Assert.assertTrue(false, "Unable to Login");
				logger.error("Login Failed " + e.getMessage());
			}
		}

		// Login Function
		public void login() {
			try {
				logger.info("Accepting Permissions");
				App_Permissions();
				logger.info("Completed Accepting Permissions");
				entervalue(Constants.UserName, driver.findElementById("ubq.mobi.and.product:id/userName"));
				entervalue(Constants.Password, driver.findElementById("ubq.mobi.and.product:id/password"));
				driver.hideKeyboard();
				Thread.sleep(200);
				buttonClick(driver.findElement(By.id("ubq.mobi.and.product:id/login_button")));
				//Thread.sleep(60000);
				//driver.manage().timeouts().implicitlyWait(13000, TimeUnit.MILLISECONDS);
				driver.manage().timeouts().implicitlyWait(280, TimeUnit.SECONDS);
				driver.findElement(By.id("ubq.mobi.and.product:id/done_sync_button")).click();
				Thread.sleep(500);
				//buttonClick(driver.findElement(By.id("ubq.mobi.and.product:id/done_sync_button")));
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Assert.assertTrue(false, "Unable to Login");
				logger.error("Login Failed " + e.getMessage());
			}

		}
		
		public void allowAppPermission() {
			MobileElement Allow = driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]"));
			for (int i = 1; i <= 5; i++) {
				//MobileElement text = driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][0]"));
				//String permisioncount = getText(text);
				//System.out.println(permisioncount);
				buttonClick(Allow);
			}

		}
		public void App_Permissions() {

			MobileElement Allow = driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][1]"));
			// WebElement allow=driver.findElementByAndroidUIAutomator("text(\"Allow\")");
			for (int i = 0; i < 5; i++) {
				TouchAction t = new TouchAction(driver);
				t.tap(tapOptions().withElement(element(Allow))).perform();

			}

		}


}
