package com.UBQPageObjectLib;

import com.UBQGenericLib.WebDriverCommonLib;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MerchandisingActivityPage extends WebDriverCommonLib
{
	// -----Mobile Elements-----//
		// ---For ClickonMerchandisingActivityBtn---//
		public void ClickonMerchandisingActivityBtn() {
			buttonClick(driver.findElementByAndroidUIAutomator("text(\"Merchandising Activity\")"));
		}
		

		// ----For enterRetailerName----//
		public void enterRetailerName(String RetName) {
			driver.hideKeyboard();
			buttonClick(driver.findElementById("ubq.mobi.and.product:id/es_entity_name_search"));
			entervalue(RetName, driver.findElementById("ubq.mobi.and.product:id/es_entity_name_search"));
			
		}

		// ----For clickonenteredRetailer----//
		public void ClickonenteredRetailer() {
			driver.pressKey(new KeyEvent(AndroidKey.ENTER));
			driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
			driver.pressKey(new KeyEvent(AndroidKey.ENTER));
			//driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		}
		
		// ----For check_in_check_box----//
		public void clickoncheckincheckbox() {
			buttonClick(driver.findElementById("ubq.mobi.and.product:id/check_in_check_box"));
		}

		// ----For ClickonStartTranscationBtn----//
		public void clickonStartTranscationBtn() {
			buttonClick(driver.findElementById("ubq.mobi.and.product:id/sed_start_transaction"));
		}
		
		// ----For clickoncameraBtn---//
		public void clickoncaptureImage() throws InterruptedException {
			for (int i = 1; i <= 3; i++) {
				buttonClick(driver.findElementById("ubq.mobi.and.product:id/merchandising_camera"));
				Thread.sleep(500);
				buttonClick(driver.findElementById("com.android.camera2:id/shutter_button"));
				Thread.sleep(500);
				buttonClick(driver.findElementById("com.android.camera2:id/done_button"));
				Thread.sleep(200);
			}

		}

		// ----enterNoofDisplaystands----//
		public void enterNoofDisplaystands(String stands) {
			entervalue(stands, driver.findElementByAndroidUIAutomator("text(\"Display Stands\")"));
		}

		// ----enterNoofRollUpBanners----//
		public void enterNoofRollUpBanners(String Banners) {
			entervalue(Banners, driver.findElementByAndroidUIAutomator("text(\"Roll Up Banners\")"));
		}

		// ----enterNoofShelftalkers----//
		public void enterNoofShelftalkers(String Shelf) {
			entervalue(Shelf, driver.findElementByAndroidUIAutomator("text(\"Shelf talkers\")"));
		}

		// ----enterBeachumbrella----//
		public void enterBeachumbrella(String umbrella) {
			entervalue(umbrella, driver.findElementByAndroidUIAutomator("text(\"Beach umbrella\")"));
		}
		
		// ----For clickonMerchandisingsaveBtn----//
		public void clickonMerchandisingsaveBtn() {
			buttonClick(driver.findElementByAndroidUIAutomator("text(\"Save\")"));
		}

		// ----For clickonMerchandisingskipBtn----//
		public void clickonMerchandisingskipBtn() {
			buttonClick(driver.findElementByAndroidUIAutomator("text(\"Skip\")"));
		}

		// ----For clickonyesBtn----//
		public void clickonOKBtn() {
			buttonClick(driver.findElementById("android:id/button1"));
		}
		
		
}
