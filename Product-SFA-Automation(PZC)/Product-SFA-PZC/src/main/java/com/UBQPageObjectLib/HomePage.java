package com.UBQPageObjectLib;

import org.openqa.selenium.By;

import com.UBQGenericLib.WebDriverCommonLib;

/**
 * @author Praneeth
 *
 */

public class HomePage extends WebDriverCommonLib {

	// ---------------------------Mobile Elements---------------------------//

	// ---For ClickonMainMenu---//
	public void clickonMainMenu() {
		buttonClick(driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open']")));
		// android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.TextView[1]
	}

	// ---For ClickonStockView---//
	public void clickonStockViewBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Stock View\")"));
	}

	// ----For ClickonSalesBtn---//
	public void clickonSalesBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Sales\")"));
	}

	// ----For ClickonOrderEntry---//
	public void clickonOrderEntryBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Order Entry\")"));
	}

	// ----For ClickonSOrder Review---//
	public void clickonOrderReviewBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Order Review\")"));
	}

	// ----For ClickonBilling---//
	public void clickonBillingBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Billing\")"));
	}

	// ----For ClickonBillReview---//
	public void clickonBillReviewBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Bill Review\")"));
	}

	// ----For ClickPayment---//
	public void clickonPaymentBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Payment\")"));
	}

	// ----For ClickonSalenReturn---//
	public void clickonSalesReturnBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Sales Return\")"));
	}

	// ----For ClickonSales Return Review---//
	public void clickonSalesReturnReviewBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Sales Return Review\")"));
	}

	// ----For clickonNosalesReasonBtn---//
	public void clickonNosalesReasonBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"No-sales Reason\")"));
	}

	// ----For clickonViewPromotionBtn---//
	public void clickonViewPromotionBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"View Promotion\")"));
	}

	// ----For clickonReportsBtn---//
	public void clickonReportsBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Reports\")"));
	}

	// ----For clickonKPISnapshotBtn---//
	public void clickonKPISnapshotBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"KPI Snapshot\")"));
	}

	// ----For clickonDailyDashboardBtn---//
	public void clickonDailyDashboardBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Daily Dashboard\")"));
	}

	// ----For clickonMarketIntelligenceBtn---//
	public void clickonMarketIntelligenceBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Market Intelligence\")"));
	}

	// ----For clickonMerchandisingActivityBtn---//
	public void clickonMerchandisingActivityBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Merchandising Activity\")"));
	}

	// ----For clickonCompetitorProductInfoBtn---//
	public void clickonCompetitorProductInfoBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Competitors Product Info.\")"));
	}

	// ----For clickonSyncBtn---//
	public void clickonSyncBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Sync\")"));
	}

	// ----For clickonDaEndActivityBtn---//
	public void clickonDaEndActivityBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Day End Activity\")"));
	}

	// ---For ClickonProfileDropdowm---//
	public void clickonProfileDropdowm() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Profile\")"));
	}

	// ---For ClickonAddRetailerBtn---//
	public void ClickonAddRetailerBtn() {

		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Add Retailer\")"));
	}

	// ---For clickonCaptureKYCImagesBtn---//
	public void clickonCaptureKYCImagesBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Capture KYC Images\")"));
	}

	// ---For clickonEditRetailerBtn---//
	public void clickonEditRetailerBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Edit Retailer\")"));
	}

	// ---For clickonVisitTrackingBtn---//
	public void clickonVisitTrackingBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Visit Tracking\")"));
	}
	
	// ---For clickonPlannedVsActualBtn---//
	public void clickonPlannedVsActualBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Planned Vs Actual\")"));
	}
	
	// ---For clickonViewPlanBtn---//
	public void clickonViewPlanBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"View Plan\")"));
	}
	
	// ---For clickonVisitProgramBtn---//
	public void clickonVisitProgramBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Visit Program\")"));
	}
	
	// ---For clickonUserDBBtn---//
	public void clickonUserDBBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"User DB\")"));
	}
	
	// ---For clickonAttendanceBtn---//
	public void clickonAttendanceBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Attendance\")"));
	}

	// ---For clickonTopSalesmenBtn---//
	public void clickonTopSalesmenBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Top Salesmen\")"));
	}

	// ---For clickonLogoutBtn---//
	public void clickonLogoutBtn() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Logout\")"));
	}
	
	

	
}
