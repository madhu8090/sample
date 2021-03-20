package com.UBQPageObjectLib;

/**
 * @author Praneeth
 *
 */


import com.UBQGenericLib.WebDriverCommonLib;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class CompetitorsProductInfoPage extends WebDriverCommonLib {

	// -----Mobile Elements-----//

	// ---For clickonCompetitorsProductInfoBtn---//
	public void clickonCompetitorsProductInfoBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Competitors Product Info.\")"));
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
		// driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}

	// ----For check_in_check_box----//
	public void clickoncheckincheckbox() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/check_in_check_box"));
	}

	// ----For ClickonStartTranscationBtn----//
	public void clickonStartTranscationBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/sed_start_transaction"));
	}

	// ubq.mobi.and.product:id/competitor_add_sku

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
		// buttonClick(driver.findElementByClassName("android.widget.ImageView"));
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

	// ------For selectCompetitor-----//
	public void selectCompetitorfromList() {
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
