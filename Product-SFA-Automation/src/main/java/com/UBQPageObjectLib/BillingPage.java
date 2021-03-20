package com.UBQPageObjectLib;

import java.util.List;

import org.openqa.selenium.By;

import com.UBQGenericLib.WebDriverCommonLib;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

/**
 * @author Praneeth
 *
 */

public class BillingPage extends WebDriverCommonLib {

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

	// ---getselectedRetailer----//
	public String getselectedRetailer() {
		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));
	}

	// ----getselectedCluster----//
	public String getselectedCluster() {
		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]"));
	}

	// ---- For ClickonPlusBtntoAddSKU----//
	public void clickonPlusBtntoAddSKU() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/add_sku_bill_button"));
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

	// ----For clickonDoneButton----//
	public void clickonDoneBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/sku_done_button"));
	}

	// ----For clickonBillsaveBtn----//
	public void clickonBillsaveBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/save_bill_button"));
	}

	// ----For getDiscountamount----//
	public String getDiscountamount() {
		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"));
	}

	// ----For getgrossamount----//
	public String getgrossamount() {
		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.TextView[2]"));
	}

	// ----For getItemwiseDiscAmt----//
	public String getItemwiseDiscAmt() {
		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[2]/android.widget.TextView[2]"));
	}

	// ----For getTaxAmt----//
	public String getTaxAmt() {
		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.TextView[2]"));
	}

	// ----For getsplDisconbill----//
	public String getsplDisconbill() {
		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.TextView[2]"));
	}

	// ----For getpromotionAmount----//
	public String getpromotionAmount() {
		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[5]/android.widget.TextView[2]"));
	}

	// ----For getcreditNoteAmount----//
	public String getcreditNoteAmount() {
		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[6]/android.widget.TextView[2]"));
	}

	// ----For getPaymentAmount----//
	public String getPaymentAmount() {
		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[7]/android.widget.TextView[2]"));
	}

	// ----For getBillAmount----//
	public String getBillAmount() {
		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[8]/android.widget.TextView[2]"));
	}

	// ----For getBillscreenbillAmount----//
	public String getBillscreenbillAmount() {
		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow/android.widget.TextView[2]"));
	}

	// ----For clickonYesBtn----//
	public void clickonYesBtn() {
		buttonClick(driver.findElementById("android:id/button1"));
	}

	// ----For clickonNoBtn----//
	public void clickonNoBtn() {
		buttonClick(driver.findElementById("android:id/button2"));
	}

	// ---For clickonOkbtn----//
	public void clickonOKBtn() {
		buttonClick(driver.findElementById("android:id/button1"));

	}

	// ----getCountofBilledProduct----//
	public int getCountofBilledProduct() {
		List<MobileElement> NumOfprod = driver.findElements(By.xpath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView"));
		return NumOfprod.size();

	}

	// ---For getbilledproductNameFromList---//
	public String getbilledproductNameFromList(int i) {

		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout["
						+ i
						+ "]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.TextView"));
	}

	// ---For getbilledproductQtyFromList---//
	public String getbilledproductQtyFromList(int i) {
		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout["
						+ i
						+ "]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]"));
	}

	// ----For getbilledProductGrossAmtList----//
	public String getbilledProductGrossAmtList(int i) {
		return getText(driver.findElementByXPath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout["
						+ i
						+ "]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]"));

	}
	
	// ---- For click on back arrow btn()----//
		public void clickonbackarrowBtn() {
			buttonClick(driver.findElementByClassName("android.widget.ImageButton"));
			
		}
}
