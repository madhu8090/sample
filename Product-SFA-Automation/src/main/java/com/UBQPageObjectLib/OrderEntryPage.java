package com.UBQPageObjectLib;

import com.UBQGenericLib.WebDriverCommonLib;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

/**
 * @author Praneeth
 *
 */

public class OrderEntryPage extends WebDriverCommonLib {

	// ----For SelectBeat----//
	public void clickonClusterDwn() {
		driver.findElementById("ubq.mobi.and.product:id/es_beat_spinner");
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/es_beat_spinner"));

	}

	// ----For selectBeatValue----//
	public void selectBeatvalue() {
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

	}

	// ----For enterRetailerName----//
	public void enterRetailerName(String RetName) {
		driver.hideKeyboard();
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/es_entity_name_search"));
		entervalue(RetName, driver.findElementById("ubq.mobi.and.product:id/es_entity_name_search"));
		
	}

	// ----For ClickonenteredRetailer----//
	public void ClickonenteredRetailer() {
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		//driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}

	/*
	 * // ----For getDistance----// public String getDistance() {
	 * 
	 * MobileElement Dis =
	 * driver.findElementById("ubq.mobi.and.product:id/eli_distance_away");
	 * String value = Dis.getText(); return value;
	 * 
	 * }
	 */

	// ----For check_in_check_box----//
	public void clickoncheckincheckbox() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/check_in_check_box"));
	}

	// ----For ClickonStartTranscationBtn----//
	public void clickonStartTranscationBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/sed_start_transaction"));
	}

	// ----For updatelatlongcheck---//
	public void clickonupdatelatlongcheck() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/update_lat_long_check"));
	}

	// ---For clickonOkbtn----//
	public void clickonOKBtn() {
		buttonClick(driver.findElementById("android:id/button1"));

	}

	// ---For clickonCancelBtn----//
	public void clickonCancelBtn() {
		buttonClick(driver.findElementById("android:id/button2"));

	}

	// ----For ClickonSaveBtn----//
	public void clickonsaveBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/save_button"));
	}

	// ----For clickonYesBtn----//
	public void clickonYesBtn() {
		buttonClick(driver.findElementById("android:id/button1"));
	}

	// ----For clickonNoBtn----//
	public void clickonNoBtn() {
		buttonClick(driver.findElementById("android:id/button2"));
	}

	// ---- For click on back arrow btn()----//
	public void clickonbackarrowBtn() {
		buttonClick(driver.findElementByClassName("android.widget.ImageButton"));
		getvalue(driver.findElementByClassName("android.widget.ImageButton"));

	}

	// ---For getDistance----//
	public double getDistance() {

		return getdoublevalue(driver.findElementById("ubq.mobi.and.product:id/eli_distance_away"));

	}

	// ----For getselectedRetailer----//
	public String getselectedRetailer() {
		return getText(driver.findElementById("ubq.mobi.and.product:id/selectedRetailer"));
	}

	// ----For getselectedBeat----//
	public String getselectedBeat() {
		return getText(driver.findElementById("ubq.mobi.and.product:id/selectedBeat"));
	}

	// ---- For ClickonPlusBtntoAddSKU----//
	public void clickonPlusBtntoAddSKU() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/add_sku_order_button"));
	}

	//----For clickonsaveBtn----//
	public void clickonordersaveBtn(){
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/save_order_button"));
	}
	
	//----For clickonslideupamountdetails----//0
	public void slideupamountdetails(){
		driver.findElementById("ubq.mobi.and.product:id/slide_img");
		//x and y coordinates [463,1923] [617,1981]
	}
	
	// ----For enterProductName----//
	public void enterProductName(String Prodname) {
		entervalue(Prodname, driver.findElementById("ubq.mobi.and.product:id/sku_search"));

	}
	
	//----For enterQty----//
	public void enterQty(String qty){
		for(int i=1;i<=3;i++){
			buttonClick(driver.findElementById("ubq.mobi.and.product:id/sd_uom_tv"));
		}
		/*//-----OR------//
		driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
		for(int i=1;i<=3;i++){
			driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		}*/
		entervalue(qty, driver.findElementById("ubq.mobi.and.product:id/sd_qty_txt"));
		
	}
	
	//----For clickonDoneButton----//
	public void clickonDoneBtn(){
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/sku_done_button"));
	}
	
	//---For searchProductfromlist----//
	public void searchproductfromlist(){
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"ubq.mobi.and.product:id/order_recycler_view\")).scrollIntoView(new UiSelector().textMatches(\"GD CHUNKY COOKIES 120G 40PK CBB NL\").instance(0))"));
	}
	
	
	
	
}
