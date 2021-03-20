package com.UBQPageObjectLib;

import com.UBQGenericLib.WebDriverCommonLib;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class POS_ActivityPage extends WebDriverCommonLib {

	// -----Mobile Elements-----//
	// ---For ClickonOrderEntryRadioBtn---//
	public void ClickonOrderEntryRadioBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Order Entry\")"));
	}

	// ---For ClickonBillingRadioBtn---//
	public void ClickonBillingRadioBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Billing\")"));
	}

	// ---For ClickonNosalesReasonRadioBtn---//
	public void ClickonNosalesReasonRadioBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"No-sales Reason\")"));
	}

	// ---- For ClickonPlusBtntoAddSKU----//
	public void clickonPlusBtntoAddSKU() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/add_sku_order_button"));
	}

	// ----For clickonsaveBtn----//
	public void clickonordersaveBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/save_order_button"));
	}

	// ----For clickonskipBtn----//
	public void clickonskipBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/skip_order_button"));
	}

	// ----For enterProductName----//
	public void enterProductName(String Prodname) {
		entervalue(Prodname, driver.findElementById("ubq.mobi.and.product:id/sku_search"));

	}

	// ----For enterQty----//
	public void enterQty(String qty) {
		for (int i = 1; i <= 3; i++) {
			buttonClick(driver.findElementById("ubq.mobi.and.product:id/sd_uom_tv"));
		}
		/*
		 * //-----OR------// driver.pressKey(new
		 * KeyEvent(AndroidKey.PAGE_DOWN)); for(int i=1;i<=3;i++){
		 * driver.pressKey(new KeyEvent(AndroidKey.ENTER)); }
		 */
		entervalue(qty, driver.findElementById("ubq.mobi.and.product:id/sd_qty_txt"));

	}

	// ----For clickonyesBtn----//
	public void clickonyesBtn() {
		buttonClick(driver.findElementById("android:id/button1"));
	}

	// ----For clickonyesBtn----//
	public void clickonNoBtn() {
		buttonClick(driver.findElementById("android:id/button2"));
	}

	// ----getprivOsAmtTxt----//
	public void privOsAmtTxt() {
		getText(driver.findElementById("ubq.mobi.and.product:id/privOsAmtTxt"));
	}

	// ----getbillAmtTxt----//
	public void getbillAmtTxt() {
		getText(driver.findElementById("ubq.mobi.and.product:id/billAmtTxt"));
	}

	// ----gettodayCollAmtTxt----//
	public void gettodayCollAmtTxt() {
		getText(driver.findElementById("ubq.mobi.and.product:id/todayCollAmtTxt"));
	}

	// ----getosAmtTxt----//
	public void getosAmtTxt() {
		getText(driver.findElementById("ubq.mobi.and.product:id/osAmtTxt"));
	}

	// ---For ClickonCashPaymodeRadioBtn---//
	public void ClickonCashPaymodeRadioBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Cash\")"));
	}

	// ---For ClickonchequePaymodeRadioBtn---//
	public void ClickonchequePaymodeRadioBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Cheque\")"));
	}

	// ---For ClickonCashPaymodeRadioBtn---//
	public void ClickonETransferPaymodeRadioBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"E-Transfer\")"));
	}

	// ----For enterCollectorName----//
	public void enterCollectorName(String CollName) {
		entervalue(CollName, driver.findElementById("ubq.mobi.and.product:id/collectorName"));

	}

	// ----For enterCollectionAmt----//
	public void enterCollectionAmt(String CollAmt) {
		entervalue(CollAmt, driver.findElementById("ubq.mobi.and.product:id/collAmtTxt"));

	}

	// ----ClickonCollectionsaveBtn----//
	public void ClickonCollectionsaveBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/save_collection_button"));
	}

	// ----ClickonCollectionskipBtn----//
	public void ClickonCollectionskipBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/collection_skip_button"));
	}

	// ----For clickoncameraBtn----//
	public void clickoncameraBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/merchandising_camera"));
	}

	// ----For clickoncameraBtn----//
	public void clickoncapturecameraBtn() {
		buttonClick(driver.findElementById("com.android.camera2:id/shutter_button"));
	}

	// ----For clickonTickBtn----//
	public void clickonTickBtn() {
		buttonClick(driver.findElementById("com.android.camera2:id/done_button"));
	}

	// ----For clickocancelBtn----//
	public void clickocancelBtn() {
		buttonClick(driver.findElementById("com.android.camera2:id/cancel_button"));
	}

	// ----For clickoretakeBtn----//
	public void clickoretakeBtn() {
		buttonClick(driver.findElementById("com.android.camera2:id/retake_button"));
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

	// ----For clickonplusBtntoaddcompProduct----//
	public void clickonplusBtntoaddcompProduct() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/competitor_add_sku"));
	}

	// ----For clickoncompSaveBtn----//
	public void clickoncompSaveBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/save_button"));
	}

	// ----For clickonskipBtn----//
	public void clickoncompSkipBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/skip_button"));
	}

	// ----For selectthecheckbox----//
	public void selectcheckbox() {
		//buttonClick(driver.findElementByClassName("android.widget.ImageView"));
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/sd_sku_check"));
		

	}

	// ----For clickonDoneBtn----//
	public void clickonDoneBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/sku_done_button"));
	}
	
	// ---For ClickonCompitetorDropdowm---//
		public void ClickonCompitetorDropdowm() {
			buttonClick(driver.findElementByAndroidUIAutomator("text(\"Competitor\")"));
		}
		
	//------For selectCompetitor-----//
		public void selectCompetitorfromList(){
			driver.pressKey(new KeyEvent(AndroidKey.ENTER));
			driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
			driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		}

	// ----For entercompProductName----//
	public void entercompProductName(String SKU) {
		entervalue(SKU, driver.findElementById("ubq.mobi.and.product:id/comp_sku_name_txt"));

	}

	// ----For entercompPrice----//
	public void entercompPrice(String SKU) {
		entervalue(SKU, driver.findElementById("ubq.mobi.and.product:id/comp_mrp_txt"));

	}

	// ----For entercompRate----//
	public void entercompRate(String rate) {
		entervalue(rate, driver.findElementById("ubq.mobi.and.product:id/comp_rate_txt"));

	}

	// ----For entercompPromotion----//
	public void entercompPromotion(String Promotion) {
		entervalue(Promotion, driver.findElementById("ubq.mobi.and.product:id/comp_promo_txt"));

	}

	// ----For entercompRetStock----//
	public void entercompRetStock(String RetStock) {
		entervalue(RetStock, driver.findElementById("ubq.mobi.and.product:id/comp_stock_txt"));

	}

	// ----For entercompMargin----//
	public void entercompMargin(String Margin) {
		entervalue(Margin, driver.findElementById("ubq.mobi.and.product:id/comp_margin_txt"));

	}
	
	// ----For entercompRemarks----//
	public void entercompRemarks(String remarks) {
		entervalue(remarks, driver.findElementById("ubq.mobi.and.product:id/comp_remark_txt"));

	}
	

	
	
	
	
	
	
	

}


 
