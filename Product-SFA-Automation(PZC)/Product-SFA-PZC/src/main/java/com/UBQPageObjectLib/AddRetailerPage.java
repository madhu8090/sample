package com.UBQPageObjectLib;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.awt.Button;
import java.util.List;

import javax.swing.ButtonModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.UBQGenericLib.WebDriverCommonLib;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * @author Praneeth
 *
 */
public class AddRetailerPage extends WebDriverCommonLib {

	// ---Mobile Elements---//

	// ---For ClickonProfileDropdowm---//
	public void clickonProfileDropdowm() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Profile\")"));
	}

	// ---For ClickonAddRetailerBtn---//
	public void ClickonAddRetailerBtn() {

		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Add Retailer\")"));
	}

	//

	// -----DistributorCode-----//
	public String getDistributorCode() {
		return getText(driver.findElementById("ubq.mobi.and.product:id/dist_code"));
	}

	// -----DistributorName-----//
	public String getDistributorName() {
		return getText(driver.findElementById("ubq.mobi.and.product:id/dist_name"));
	}

	// -----StaffName-----//
	public String getStaffName() {
		return getText(driver.findElementById("ubq.mobi.and.product:id/salesman_name"));
	}

	/*
	 * @AndroidFindBy(id="ubq.mobi.and.product:id/beat_spinner") public
	 * MobileElement BeatNameDropdownBtn;
	 */

	// ---For ClickonBeatNameDropdownBtn---//
	public void ClickonBeatNameDropdownBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/beat_spinner"));
	}

	public void selectDropdownvalue() throws InterruptedException {
		// MobileElement
		// Bn=driver.findElementByXPath("//android.widget.TextView[@Text='S.VIHAR']
		// and @index='1'");
		// WebElement
		// allow=driver.findElementByAndroidUIAutomator("text(\"Allow\")");
		// MobileElement topCharts =
		// ((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new
		// UiSelector().text(\"ACHARYA VIHAR KIOSK\")");
		// MobileElement we=driver.findElement(By.xpath("//*[@text='ACHARYA
		// VIHAR KIOSK']"));
		// TouchAction t = new TouchAction(driver);

		// driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new
		// UiSelector().scrollable(true).instance(0)).scrollIntoView(new
		// UiSelector().textMatches(\" ACHARYA VIHAR KIOSK"\).instance(0))"));
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"ACHARYA VIHAR KIOSK\"));").click();
		// t.tap(tapOptions().withElement(element(we))).perform();

		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollable(true).instance(0)).scrollIntoView(new
		// UiSelector().textMatches(\" ACHARYA VIHAR KIOSK"\).instance(0)");
		// Thread.sleep(100);
		driver.findElement(By.xpath("//*[@text='ACHARYA VIHAR KIOSK' and @index='1']")).click();

		// buttonClick(driver.findElementByXPath("//android.widget.TextView[@Text='S.VIHAR']
		// and @index='1'"));

		// MobileElement d= driver.findElementByAndroidUIAutomator(" new
		// UiSelector().text("\S.VIHAR\")");
		// driver.findElements(MobileBy.AndroidUIAutomator(" new
		// UiSelector().text("\S.VIHAR\")");
	}

	public void selecBeat() {

		// buttonClick(driver.findElementByXPath(
		// "//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[@text='ACHARYA
		// VIHAR KIOSK' and @index='0']"));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}

	// ----EnterRetailerName----//
	public void EnterRetailerName(String Retname) {
		entervalue(Retname, driver.findElementById("ubq.mobi.and.product:id/retailer_name_txt"));
	}

	// ----EnterOwnerName----//
	public void EnterOwnerName(String Ownername) {
		entervalue(Ownername, driver.findElementById("ubq.mobi.and.product:id/owner_name_txt"));
	}

	// ----EntershopBuildingNumber----//
	public void Entershopbuildingnumber(String shopBuildingNumber) {
		entervalue(shopBuildingNumber, driver.findElementById("ubq.mobi.and.product:id/shop_building_name_txt"));
	}

	// ----EnterStreet----//
	public void EnterStreet(String Street) {
		entervalue(Street, driver.findElementById("ubq.mobi.and.product:id/street_txt"));
	}

	/*
	 * //----Clickonlocation----// public void Clickonlocation(){
	 * buttonClick(element); }
	 */

	// ----Landmark----//

	public void clickonLandMarkDropdown() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/landmark_spinner"));
	}

	public void selectLandmark() {
		buttonClick(driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Near Bus Stand\"));"));
		// driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]").click();
	}

	// -----clickonStateDropdown----//
	public void clickonStateDropdown() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/state_spinner"));
	}

	// ----selectState----//
	public void selectState() {
		buttonClick(driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"ODISHA\"));"));
	}

	// ----clickonDistrictDropdown----//
	public void clickonDistrictDropdown() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/city_spinner"));
	}

	// ----selectDistrict----//
	public void selectDistrict() {
		buttonClick(driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Khordha\"));"));
	}

	// ----clickonSubDistrictDropdown----//
	public void clickonSubDistrictDropdown() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/sub_district_spinner"));
	}

	// -----selectSubDistrict----/
	public void selectSubDistrict() {
		buttonClick(driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tangi\"));"));
	}

	// ----clickonVillageDropdown----//
	public void clickonVillageDropdown() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/village_spinner"));
	}

	// ----selectVillage----//
	public void selectVillage() {
		buttonClick(driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Balia\"));"));
	}

	// ----Enter phoneno----//
	public void EnterphoneNo(String Phoneno) {
		entervalue(Phoneno, driver.findElementById("ubq.mobi.and.product:id/retailer_contact_num_txt"));
	}

	// ----EnterAppointmentdate----//
	public void EnterAppointmentdate(String Appointmentdate) {
		entervalue(Appointmentdate, driver.findElementById("ubq.mobi.and.product:id/retailer_appointment_date_txt"));
	}

	// ----ClickoncalenderBtn----//
	public void ClickoncalenderBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/date_icon"));
	}

	// ----clickonchannelDropdown----//
	public void clickonchannelDropdown() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/channel_spinner"));

	}

	// ----select channel----//
	public void selectchannel() {
		buttonClick(driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Food Store / Bakery\"));"));
	}

	// ----Size----//
	public void clickonsizeDropdown() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/attr_spinner"));
		// driver.findElementByXPath("//android:id/text1[@text='Size *' and
		// @index='0']").click();
		// buttonClick(driver.findElementByXPath("//ubq.mobi.and.product:id/attr_spinner/android:id/text1[@text='Size
		// *' and @index='0']"));
	}

	// ----selectSize----//
	public void selectSize() {
		// buttonClick(driver.findElementByAndroidUIAutomator("new
		// UiScrollable(new UiSelector()).scrollIntoView(text(\"Small\"));"));
		// buttonClick(driver.findElementByAndroidUIAutomator("new
		// UiSelector().textContains(\"Small\")"));
		// List<MobileElement> size=driver.findElementsByAndroidUIAutomator("new
		// UiSelector().textContains(\"Small\")");
		// size.get(1).click();
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollable(true).instance(0)).scrollIntoView(new
		// UiSelector().textMatches(\" ACHARYA VIHAR KIOSK"\).instance(0)");");
		driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
		driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

	}

	// ----clickonshapeDropdown----//
	public void clickonshapeDropdown() {
		buttonClick(driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"shape\")"));

	}

	// ----selectShape----//
	public void selectShape() {
		// buttonClick(driver.findElementByAndroidUIAutomator("new
		// UiScrollable(new UiSelector()).scrollIntoView(text(\"D\"));"));
		driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
		driver.pressKey(new KeyEvent(AndroidKey.PAGE_DOWN));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));

	}

	// ----scrollup----//
	public void scroll(String visibletext) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\" +visibletext+ \"));");
	}

	// ----scrollup----//
	public void scroll1() {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"No. of staff \"));").click();
	}

	// ----SelectBingo Rack - LCheckBox
	public void SelectBingoRackLCheckBox() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Bingo Rack - L\")"));
		// buttonClick(driver.findElementByAndroidUIAutomator("text(\"
		// VisibleText \")"));

	}

	// ----selectBingoRackSCheckBox
	public void selectBingoRackSCheckBox() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Bingo Rack - S\")"));
	}

	// ----selectHomeDeliveryCheckBox
	public void selectHomeDeliveryCheckBox() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Home Delivery\")"));
	}

	// ----SelectLaysRackLCheckBox
	public void selectLaysRackLCheckBox() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Lays Rack - L\")"));
	}

	// ----selectLaysRackSLCheckBox
	public void selectLaysRackSLCheckBox() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Lays Rack - S\")"));
	}

	// ----selectNoRackCheckBox
	public void selectNoRackCheckBox() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"No Rack\")"));
	}

	// ----selectRefrigerationCheckBox
	public void selectRefrigerationCheckBox() {
		buttonClick(driver.findElementByAndroidUIAutomator("text(\"Refrigeration\")"));
	}

	// ----clickFSUDropdown----//
	public void clickonFSUDropdown() {
		buttonClick(driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"FSU *\")"));

	}

	// ----selectFSU----//
	public void selectFSU(String visibleText) {
		buttonClick(driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + visibleText + "\" ));"));

	}

	// ----clickonCounterdispenserDropdown----//
	public void clickonCounterdispenserDropdown() {
		buttonClick(driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"Counter dispenser\")"));

	}

	// ----selectFSU----//
	public void selectCounterdispenser(String visibleText) {
		buttonClick(driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + visibleText + "\" ));"));

	}

	// ----clickonCounterdispenserDropdown----//
	public void clickonNoOfStaffsDropdown() {
		buttonClick(driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"No. of staff\")"));

	}

	// ----selectFSU----//
	public void selectNoOfStaffs(String visibleText) {
		buttonClick(driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + visibleText + "\" ));"));

	}

	// ----clickonCounterdispenserDropdown----//
	public void clickonChainDropdown() {
		buttonClick(driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"Chain\")"));

	}

	// ----selectFSU----//
	public void selectChain(String visibleText) {
		buttonClick(driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + visibleText + "\" ));"));

	}

	// ----clickonTaxtypeDropdown----//
	public void clickonTaxtypeDropdown() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/tax_type_spinner"));

	}

	// ----selectTaxtype----//
	public void selectTaxtype(String visibleText) {
		buttonClick(driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + visibleText + "\" ));"));

	}

	// ----clickonGSTNotRegisteredradioBtn----//
	public void clickonGSTNotRegisteredradioBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/ret_gst_not_reg"));

	}

	// ----clickonGSTRegisteredradioBtn----//
	public void clickonGSTRegisteredradioBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/ret_gst_reg"));

	}

	// ----clickonGSTRegisteredradioBtn----//
	public void clickonAdditionalInfolink() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/other_fields_txt"));

	}

	// ----EnterPostalCode----//
	public void EnterPostalCode(String Pc) {
		entervalue(Pc, driver.findElementById("ubq.mobi.and.product:id/postal_code"));
	}

	// ----EnterPostalCode----//
	public void EnterAlternatePhNo(String AltNo) {
		entervalue(AltNo, driver.findElementById("ubq.mobi.and.product:id/alt_phone_number"));
	}

	// ----EnterFaxNo----//
	public void EnterFaxNo(String FaxNo) {
		entervalue(FaxNo, driver.findElementById("ubq.mobi.and.product:id/fax_number"));
	}

	// ----Enteremail----//
	public void Enteremail(String email) {
		entervalue(email, driver.findElementById("ubq.mobi.and.product:id/email_txt"));
	}

	// ----EnterBankName----//
	public void EnterBankName(String Bn) {
		entervalue(Bn, driver.findElementById("ubq.mobi.and.product:id/bank_name_txt"));
	}

	// ----EnterAccountName----//
	public void EnterAccountName(String accname) {
		entervalue(accname, driver.findElementById("ubq.mobi.and.product:id/acc_name_txt"));
	}

	// ----EnterAccountNo----//
	public void EnterAccountNo(String accNo) {
		entervalue(accNo, driver.findElementById("ubq.mobi.and.product:id/acc_num_txt"));
	}

	// ----EnterBankBranch----//
	public void EnterBankBranch(String branch) {
		entervalue(branch, driver.findElementById("ubq.mobi.and.product:id/bank_branch_town_txt"));
	}

	// ----clickonAccountstatusDropDown----//
	public void clickonAccountstatusDropDown() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/acc_type_spinner"));

	}

	// ----clickonAccountstatusDropDown----//
	public void selectAccStatus() {
		buttonClick(driver.findElementById("android:id/text1"));

	}

	// ----clickonTickBtn----//
	public void clickonTickBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/save_retailer_button"));

	}

	// ----clickonCameraBtn----//
	public void clickonCameraBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/merchandising_camera"));

	}

	// ----clickonshutterBtn----//
	public void clickonshutterBtn() {
		MobileElement shutter = driver.findElementById("com.android.camera2:id/shutter_button");
		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(shutter))).perform();
		// driver.pressKey(new KeyEvent(AndroidKey.CAMERA));
	}

	// ----clickonDoneBtn----//
	public void clickonCameraTickBtn() {
		MobileElement shutter = driver.findElementById("com.android.camera2:id/done_button");
		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(shutter))).perform();
		// driver.pressKey(new KeyEvent(AndroidKey.CAMERA));
	}

	// ----clickonCameracancelBtn----//
	public void clickonCameracancelBtn() {
		MobileElement shutter = driver.findElementById("com.android.camera2:id/cancel_button");
		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(shutter))).perform();
		// driver.pressKey(new KeyEvent(AndroidKey.CAMERA));
	}

	// ----clickonCameraretakeBtn----//
	public void clickonCameraretakeBtn() {
		MobileElement shutter = driver.findElementById("com.android.camera2:id/retake_button");
		TouchAction t = new TouchAction(driver);
		t.tap(tapOptions().withElement(element(shutter))).perform();
		// driver.pressKey(new KeyEvent(AndroidKey.CAMERA));
	}

	// ----clickonretailerSaveBtn----//
	public void clickonretailerSaveBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/save_button"));

	}

	// ----clickonDownloadBtn----//
	public void clickonDownloadBtn() {
		buttonClick(driver.findElementById("ubq.mobi.and.product:id/download_button"));

	}
	
	// ----clickonPopupYesBtn----//
	public void clickonPopupYesBtn() {
		buttonClick(driver.findElementById("android:id/button1"));

	}
	
	// ----clickonPopupNoBtn----//
	public void clickonPopupNoBtn() {
		buttonClick(driver.findElementById("android:id/button2"));

	}

	// ----clickonPopupOKBtn----//
	public void clickonPopupOKBtn() {
		buttonClick(driver.findElementById("android:id/button1"));

	}


}
