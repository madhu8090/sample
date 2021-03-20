package com.UBQPageObjectLib;

import java.util.List;

import org.openqa.selenium.By;

import com.UBQGenericLib.WebDriverCommonLib;

import io.appium.java_client.MobileElement;

/**
 * @author Praneeth
 *
 */

public class Stock_View_Page extends WebDriverCommonLib {

	// ------------UI Elements-------------//

	/*
	 * // ---For getMainText---// public MobileElement getMainText() { // return
	 * // getText(driver.findElement(By.xpath(
	 * "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView"
	 * )));
	 * 
	 * //return getText(driver.findElementByAndroidUIAutomator(
	 * "text(\"Stock View\")")); MobileElement txt
	 * =driver.findElementByAndroidUIAutomator("text(\"Stock View\")"); return
	 * txt;
	 * 
	 * }
	 */

	// ---For ClickonMainMenu---//
	public void ClickonMainMenu() {
		buttonClick(driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open']")));
		// android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TextView[1]
	}

	// ---For ClickonStockView---//
	public void ClickonStockViewBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Stock View\")"));

	}

	// ---For getMainText---//
	public String getMainText() {
		return getText(driver.findElement(By.xpath(
				"//android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TextView[1]")));
	}

	// ---For ClickOnBackIcon---//
	public void ClickOnBackIcon() {
		buttonClick(driver.findElement(By.xpath(
				"//android.widget.FrameLayout[@index='0']/androidx.drawerlayout.widget.DrawerLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.ImageButton[@index='0']")));
	}

	//----getCountOfProductDetails----//
	public int getCountOfProductDetails() {
		List<MobileElement> NumOfprod = driver.findElements(By.xpath(
				"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout"));
		return NumOfprod.size();

	}
	
	// ---For getproductNameFromList---//
	public String getproductNameFromList(int i) {
		
	return getText(driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout["+ i +"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[1]/android.widget.TextView"));
	}

	// ---For getproductPriceFromList---//
	public String getproductPriceFromList(int i) {
		return getText(driver.findElement(By
				.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout["+ i +"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[2]/android.widget.TextView[2]")));
	}

	// ---For getproductBatchFromList---//
	public String getproductBatchFromList(int i) {
		return getText(driver.findElement(By
				.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout["+ i +"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TableLayout/android.widget.TableRow[2]/android.widget.TextView[3]")));
	}

	// ---For getproductQtyFromList---//
	public String getproductQtyFromList(int i) {
		return getText(driver.findElement(By
				.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout["+ i +"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")));
	}
	
	// ----For enterProductName----//
		public void enterProductName(String Prodname) {
			entervalue(Prodname, driver.findElementById("ubq.mobi.and.product:id/stock_sku_search"));

		}


}
