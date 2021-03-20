package com.UBQPageObjectLib;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import org.openqa.selenium.By;

import com.UBQGenericLib.WebDriverCommonLib;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class AttendancePage extends WebDriverCommonLib {

	// -----Mobile elements-----//
	
	
	// ---For ClickonMainMenu---//
		public void ClickonMainMenu() {
			buttonClick(driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open']")));
			// android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TextView[1]
		}

		
	// ----EnterRemarks----//
	public void EnterRemarks(String remark) {
		entervalue(remark, driver.findElementById("ubq.mobi.and.product:id/remarksEditText"));
	}

	// ----clickonSubmitBtn----//
	public void clickonSubmitBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/submit"));

	}
	
	
	// ----clickonshutterBtn----//
		public void clickonshutterBtn() {
			MobileElement shutter = driver.findElementById("com.android.camera2:id/shutter_button");
			TouchAction t = new TouchAction(driver);
			t.tap(tapOptions().withElement(element(shutter))).perform();
			// driver.pressKey(new KeyEvent(AndroidKey.CAMERA));
		}
		
		// ----clickonCameraTickBtn----//
		public void clickonCameraTickBtn() {
			MobileElement shutter = driver.findElementById("com.android.camera2:id/done_button");
			TouchAction t = new TouchAction(driver);
			t.tap(tapOptions().withElement(element(shutter))).perform();
			// driver.pressKey(new KeyEvent(AndroidKey.CAMERA));
		}
		
		// ----clickonPopupOKBtn----//
		public void clickonPopupOKBtn() {
			buttonClick(driver.findElementById("android:id/button1"));

		}
		HomePage home=new HomePage();
		
		public void Mark_Attendance() throws InterruptedException{
			logger.info("Mark_Attendance_Started");
			ClickonMainMenu();
			home.clickonAttendanceBtn();
			Thread.sleep(200);
			EnterRemarks("Day Start");
			clickonSubmitBtn();
			Thread.sleep(600);
			clickonshutterBtn();
			Thread.sleep(800);
			clickonCameraTickBtn();
			Thread.sleep(300);
			clickonPopupOKBtn();
			Thread.sleep(300);
			
			
			
			
			
		}
		
		
		

}
