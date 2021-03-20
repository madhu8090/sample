package com.UBQGenericLib;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;

public class WebDriverCommonLib extends APKConfiguration {
	
	public static String data;
	protected static Select s;
	public static String parentWindow = null;
	public Alert alt;
	static Random random = new Random();
	public static String output;
	public static String value;
	public static SoftAssert ast ;
	
	// --- Wait Statements------------//

	// Wait Statement to wait still page to be loaded
	public void waitforpageload() {
		logger.info("Waiting for page to load");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		logger.info("page to load completed");
	}

	// Wait Statement to wait still Element to be loaded
	public static void waitForElementToBePresent(MobileElement element) {
		if (IsElementPresent(element)) {
			logger.info("Waiting for Element Present");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
			logger.info("Completed Waiting for Element Present");
		} else {
			// TODO Auto-generated catch block
			Assert.assertTrue(false, "Element Not Found");
			logger.error("Element Not found");
		}
	}

	/*
	 * // Wait Statement to wait still Elements Text to be loaded public static
	 * String waitForTextToAppear(String textToAppear, MobileElement element) {
	 * if (IsElementPresent(element)) { logger.info(
	 * "Waiting for Text to be present"); WebDriverWait wait = new
	 * WebDriverWait(driver, 100);
	 * wait.until(ExpectedConditions.attributeContains(element, "value",
	 * textToAppear)); logger.info("Completed Waiting for Text to be present");
	 * } else { // TODO Auto-generated catch block Assert.assertTrue(false,
	 * "Element Not Found"); logger.error("Element Not found"); } return
	 * element.getAttribute("value");
	 * 
	 * }
	 */
	// --------Highlight elements---------------------//

	/*
	 * public static void highLightElement(AndroidDriver<MobileElement> driver,
	 * MobileElement element) {
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor) driver; js.executeScript(
	 * "arguments[0].setAttribute('style', 'border: 2px solid black;');",
	 * element); if (IsElementPresent(element)) { try { Thread.sleep(800); }
	 * catch (InterruptedException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } js.executeScript(
	 * "arguments[0].setAttribute('style','border: solid 2px white')", element);
	 * } else { Assert.assertTrue(false, "Element Not Found"); logger.error(
	 * "Element Not found"); } }
	 */

	// -----Alert Handling------------------------//
	// ---Accept alert-----//
	public void acceptAlert() {
		try {
			alt = driver.switchTo().alert();
			if (alt != null) {
				alt.accept();
				logger.info("Alert Accepted");
			} else {
				Assert.assertTrue(false, "Unable to accept Alert Message");
				logger.error("Unable to accept Alert Message");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Unable to accept alert Message" + e.getMessage());
		}

	}

	// ---Alert Message-----//
	public String getAlertmsg() {
		try {
			alt = driver.switchTo().alert();
			if (alt != null) {
				alt.getText();
				logger.info("Alert Message " + alt.getText());
			} else {
				logger.error("Unable to Retrive Alert Message");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Unable to read the alert message " + e.getMessage());
		}
		return alt.getText();
	}

	// ---Dismiss alert-----//
	public void dismissAlert() {
		try {
			alt = driver.switchTo().alert();
			if (alt != null) {
				alt.dismiss();
				logger.info("Alert Dismissed");
			} else {
				Assert.assertTrue(false, "Unable to Dismiss Alert Message");
				logger.error("Unable to Dismiss Alert Message");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}
	}

	// ----------Capture Image----------------------//

	// ---Capture Full Screen image----//
	public static void Capture(ITestResult result, String filename) {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./" + filename + "/" + result.getName() + ".png"));
			logger.info("Testcase failed and screenshot taken");
		} catch (Exception e) {
			Assert.assertTrue(false, "Unable to Take Element ScreenShot");
			logger.error("Unable to Take ScreenShot " + e.getMessage());
		}

	}

	// ---Capture Element image----//
	public static void Captureelement(MobileElement element) {
		Screenshot screenshot = new AShot().takeScreenshot(driver, element);
		try {
			ImageIO.write(screenshot.getImage(), "PNG",
					new File(System.getProperty("user.dir") + "\\ErrorScreenshots\\ElementScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Assert.assertTrue(false, "Unable to Take Element ScreenShot");
			logger.error("Unable to Take ScreenShot " + e.getMessage());
		}
	}

	public static void selectByTxt(MobileElement element, String text) {
		try {
			waitForElementToBePresent(element);
			s = new Select(element);
			s.selectByVisibleText(text);
			logger.info("Selected Dropdown by Text " + text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertTrue(false, "Unable to Select Dropdown " + text);
			logger.error("Unable to Select Dropdown " + e.getMessage());
		}
	}

	/*
	 * public static void selectDrpdwnByTxt(MobileElement element, String text)
	 * { try { waitForElementToBePresent(element); Select sel = new
	 * Select(element); List<MobileElement> dropdown = sel.getOptions();
	 * List<MobileElement> for (int i = 0; i < dropdown.size(); i++) { String
	 * drop_down_values = dropdown.get(i).getText().trim(); if
	 * (drop_down_values.contains(text)) { sel.selectByVisibleText(text); break;
	 * }
	 * 
	 * } } catch (Exception e) { // TODO Auto-generated catch block
	 * Assert.assertTrue(false, "Unable to Select Dropdown " + text);
	 * logger.error("Unable to Select Dropdown " + e.getMessage()); } }
	 */
	/*
	 * public void selectDrpdwnRamdomly(MobileElement element) { try { int index
	 * = Integer.parseInt(AutoNumericvalue(1));
	 * waitForElementToBePresent(element); Select sel = new Select(element);
	 * List<MobileElement> dropdown = sel.getOptions();
	 * 
	 * for (int i = 0; i < dropdown.size(); i++) { if (index < i || index == i)
	 * { sel.selectByIndex(i); break; } else { index = index - 1; } } } catch
	 * (Exception e) { // TODO Auto-generated catch block
	 * Assert.assertTrue(false, "Unable to Select Dropdown " + value);
	 * logger.error("Unable to Select Dropdown " + e.getMessage()); } }
	 */

	public static void selectDrpdwnByIndex(MobileElement element, int index) {
		try {
			waitForElementToBePresent(element);
			s = new Select(element);
			s.selectByIndex(index);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertTrue(false, "Unable to Select Dropdown " + index);
			logger.error("Unable to Select Dropdown " + e.getMessage());
		}
	}

	/*
	 * public void selectDrpdwnByValue(MobileElement element, String value) {
	 * try { waitForElementToBePresent(element); Select sel = new
	 * Select(element); List<MobileElement> dropdown = sel.getOptions(); for
	 * (int i = 0; i < dropdown.size(); i++) { String drop_down_values =
	 * dropdown.get(i).getText().trim(); if (drop_down_values.contains(value)) {
	 * sel.selectByVisibleText(value); break; } else { Assert.assertTrue(false,
	 * value + " Not Found"); }
	 * 
	 * } } catch (Exception e) { // TODO Auto-generated catch block
	 * Assert.assertTrue(false, "Unable to Select Dropdown " + value);
	 * logger.error("Unable to Select Dropdown " + e.getMessage()); } }
	 */

	public String getselectDrpdwnValue(MobileElement element) {
		try {
			// highLightElement(driver, element);
			Select sel = new Select(element);
			sel.getFirstSelectedOption();
			value = sel.getFirstSelectedOption().getText();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertTrue(false, "Unable to get Selected Dropdown Value " + value);
			logger.error("Unable to get Selected Dropdown Value " + e.getMessage());
		}
		return value;

	}

	public void switchToWindow(WebDriver driver) {
		parentWindow = driver.getWindowHandle();
		// System.out.println(parentWindow);
		Iterator<String> it = driver.getWindowHandles().iterator();
		while (it.hasNext()) {
			String popup = it.next().toString();
			// System.out.println(popup);
			if (!popup.contains("parentWindow")) {
				logger.info("switched to new window");
				driver.switchTo().window(popup);
				waitforpageload();
			} else {
				Assert.assertTrue(false, "Unable to switch to new window");
				logger.error("Unable to switch to new window");
			}
		}
	}

	public void switchToMainWindow(WebDriver driver) {
		try {
			driver.close();
			driver.switchTo().window(parentWindow);

			logger.info("switched to Main window");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertTrue(false, "Unable to switch to Parent window");
			logger.error("Unable to switch to Parent window " + e.getMessage());

		}
	}

	// For Entering Value
	public static void entervalue(String value, MobileElement element) {
		if (IsElementPresent(element)) {
			//// highLightElement(driver, element);
			element.clear();
			element.sendKeys(value);
			//element.setValue(value);
			logger.info("Entered value is " + value);
		} else {
			Assert.assertTrue(false, "Unable to enter value on element ");
			logger.error("Unable to enter value on element ");
		}

	}

	// For Entering Value
	public static void enterNumvalue(String value, MobileElement element, AndroidDriver<MobileElement> driver) {
		if (IsElementPresent(element)) {
			// highLightElement(driver, element);
			element.clear();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].value=" + value + ";", element);
			logger.info("Entered value is " + value);
		} else {
			Assert.assertTrue(false, "Unable to enter value on element ");
			logger.error("Unable to enter value on element ");
		}

	}

	// ---For Selecting value---//
	/*
	 * public static void selectvalue(String value, MobileElement element) { if
	 * (IsElementPresent(element)) { //highLightElement(driver, element);
	 * selectDrpdwnByTxt(element, value); logger.info("selected value is " +
	 * value); } else { Assert.assertTrue(false,
	 * "Unable to select value of element "); logger.info(
	 * "Unable to select value of element "); } }
	 */

	// ---For Selecting---//
	public static void selectvalue(int index, MobileElement element) {
		if (IsElementPresent(element)) {
			// highLightElement(driver, element);
			selectDrpdwnByIndex(element, index);
			logger.info("selected value is " + element.getText());
		} else {
			Assert.assertTrue(false, "Unable to select value of element ");
			logger.info("Unable to select value of element ");
		}
	}

	// For CheckBox Select
	public static void checkboxselect(MobileElement element) {
		try {
			if (!element.isSelected()) {
				// highLightElement(driver, element);
				element.click();
				logger.info("Clicked on checkbox");
			} else {
				logger.info("Checkbox already selected");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertTrue(false, "Unable to Select CheckBox");
			logger.error("Unable to Select CheckBox " + e.getMessage());
		}

	}

	// For CheckBox DeSelect
	public static void checkboxdeselect(MobileElement element) {
		try {
			if (element.isSelected()) {
				// highLightElement(driver, element);
				element.click();
				logger.info("checkbox Deselected");
			} else {
				logger.info("Checkbox already Deselected");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertTrue(false, "Unable to Select CheckBox");
			logger.error("Unable to Select CheckBox " + e.getMessage());
		}

	}

	// For Button Click
	public static void buttonClick(MobileElement element) {
		if (element.isEnabled()) {
			//highLightElement(driver, element);
			element.click();
			//logger.info("Clicked on" +element);
		} else {
			Assert.assertTrue(false, "Unable to Click on element");
			logger.error("Unable to Click on element");
		}

	}

	// For Button Click
	public static void selectRadioButton(MobileElement element) {
		try {
			if (!element.isSelected()) {
				element.click();
				logger.info("Radio Button selected");
			} else {
				logger.info("Radio Button already selected");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.assertTrue(false, "Unable to Radio Button");
			logger.error("Unable to Select Radio Button " + e.getMessage());
		}

	}

	// For Get Value
	public static String getvalue(MobileElement element) {
		if (IsElementPresent(element)) {
		//highLightElement(driver, element);
			logger.info("Value of element is " + element.getAttribute("value"));
		} else {
			Assert.assertTrue(false, "Unable to get value of element ");
			logger.error("Unable to get value of element ");
		}

		value = element.getAttribute("value").trim();
		return value;
	}

	// For Get Value
	public static int getintvalue(MobileElement element) {
		if (IsElementPresent(element)) {
			// highLightElement(driver, element);
			logger.info("Value of element is " + element.getAttribute("value"));
		} else {
			Assert.assertTrue(false, "Unable to get integer type value of element ");
			logger.error("Unable to get value of element ");
		}

		value = element.getAttribute("value");
		int result = Integer.parseInt(value);
		return result;
	}
	
	// For Get Value
		public static double getdoublevalue(MobileElement element) {
			if (IsElementPresent(element)) {
				// highLightElement(driver, element);
				logger.info("Value of element is " + element.getAttribute("value"));
			} else {
				Assert.assertTrue(false, "Unable to get integer type value of element ");
				logger.error("Unable to get value of element ");
			}

			value = element.getAttribute("value");
			Double result=Double.parseDouble(value);
			return result;
		}
	

	// For Get Text
	public static String getText(MobileElement element) {
		/*if (IsElementPresent(element)) {
			// highLightElement(driver, element)
			logger.info("Value of element is " + element.getAttribute("name"));

		} else {
			Assert.assertTrue(false, "Unable to get value of element");
			logger.error("Unable to get value of element");
		}*/
		logger.info("Value of element is " + element.getAttribute("name"));
		value = element.getAttribute("name").trim();
		return value;
	}

	// For Get Text
	public static String getvisibleText(MobileElement element) {
		if (IsElementPresent(element)) {
			// highLightElement(driver, element);
			logger.info("Value of element is " + element.getText().trim());

		} else {
			Assert.assertTrue(false, "Unable to get value of element");
			logger.error("Unable to get value of element");
		}
		value = element.getText().trim();
		return value;
	}

	public static boolean IsElementPresent(MobileElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			Assert.assertTrue(false, "Element not found" + e.getMessage());
			return false;
		}

	}

	public static String AutoalphaNumericvalue(int range) {
		if (range > 1) {
			StringBuilder sb1 = new StringBuilder();
			char[] chars = "OoredooOutReach1234567890".toCharArray();
			for (int i = 0; i < range; i++) {
				char c = chars[random.nextInt(chars.length)];
				sb1.append(c);
			}
			output = sb1.toString();

		} else {
			Assert.assertTrue(false, "Input Range should be >0");
		}
		return output;
	}

	public static String AutoNumericvalue(int range) {
		if (range > 0) {
			StringBuilder sb1 = new StringBuilder();
			char[] chars = "123456789".toCharArray();
			for (int i = 0; i < range; i++) {
				char c = chars[random.nextInt(chars.length)];
				sb1.append(c);
			}
			output = sb1.toString();
		} else {
			Assert.assertTrue(false, "Input Range should be >0");
		}
		return output;
	}

	public static String Autoalphavalue(int range) {
		if (range > 0) {
			StringBuilder sb1 = new StringBuilder();
			char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
			for (int i = 0; i < range; i++) {
				char c = chars[random.nextInt(chars.length)];
				sb1.append(c);
			}
			output = sb1.toString();
		} else {
			Assert.assertTrue(false, "Input Range should be >0");
		}
		return output;
	}

	public static String autoVehiclenum() {
		StringBuilder sb1 = new StringBuilder();
		char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		for (int i = 0; i < 2; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb1.append(c);
		}

		StringBuilder sb2 = new StringBuilder();
		char[] num = "1234567890".toCharArray();
		for (int i = 0; i < 2; i++) {
			char c = num[random.nextInt(num.length)];
			sb2.append(c);
		}
		StringBuilder sb3 = new StringBuilder();
		char[] chars1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		for (int i = 0; i < 2; i++) {
			char c = chars1[random.nextInt(chars1.length)];
			sb3.append(c);
		}

		StringBuilder sb4 = new StringBuilder();
		char[] num1 = "1234567890".toCharArray();
		for (int i = 0; i < 4; i++) {
			char c = num1[random.nextInt(num1.length)];
			sb4.append(c);
		}
		output = sb1.toString() + "-" + sb2.toString() + "-" + sb3.toString() + "-" + sb4.toString();
		// System.out.println("WareHouse Name: "+output+"\n");
		return output;
	}


	// Date Selection
	public static String Today() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}

	// Date Selection
	public static String monthyear() {
		Date date = new Date();
		SimpleDateFormat df2 = new SimpleDateFormat("MMM,yyyy");
		String dateText = df2.format(date);
		return dateText;
	}

	// Time Selection
	public static String currenttme() {
		DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		return timeFormat.format(date);
	}

	// Date Selection
	public String day() {
		DateFormat dateFormat = new SimpleDateFormat("dd");
		Date date = new Date();
		return dateFormat.format(date);
	}

	// Date Selection
	public String month() {
		DateFormat dateFormat = new SimpleDateFormat("MM");
		Date date = new Date();
		return dateFormat.format(date);
	}

	// Date Selection
	public String year() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}

	// Date Selection
	public static String getModifieddate(int d, int m, int y) throws Exception {
		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		@SuppressWarnings("unused")
		Date date = new Date();
		cal.add(Calendar.YEAR, y);
		cal.add(Calendar.MONTH, m);
		cal.add(Calendar.DATE, d);
		String var = dateFormat.format(cal.getTime());
		return var;

	}

	public static void sliderleft(MobileElement slider) {
		int x = 10;
		int width = slider.getSize().getWidth();
		Actions move = new Actions(driver);
		move.moveToElement(slider, ((width * x) / 100), 0).click();
		move.build().perform();
	}

	public static void sliderright(MobileElement slider) {
		int x = 10;
		int width = slider.getSize().getWidth();
		Actions move = new Actions(driver);
		move.moveToElement(slider, 0, ((width * x) / 100)).click();
		move.build().perform();
	}
	
	/*// ---For scrollup---//
	public static void scrollDown() {
		 Dimension size = driver.manage().window().getSize();
		  int starty = (int) (size.getHeight() * 0.50);
		  int endy = (int) (size.getHeight() * 0.20);
		  //driver.swipe(XCoordinates/2,starty,XCoordinates/2,endy, 1000);
		  
		  System.out.println(starty);
		  System.out.println(endy);
		  
		  TouchAction action = new TouchAction(driver);
		 //action.press(0, starty).waitAction(Duration.ofSeconds(1)).moveTo(0,endy).release().perform();
	}*/
	
	public static void scrollup(){
		TouchAction scrollaction =new TouchAction(driver);
		//scrollaction.tap(fromX,fromY).waitAction(1000).moveTo(toX,toY).release().perform();
		//scrollaction.longPress(fromX,fromY).waitAction(1000).moveTo(toX,toY).release().perform();
		//scrollaction.tap(PointOption.point(100,2000)).waitAction(waitOptions(Duration.ofSeconds(4))).moveTo(PointOption.point(100,900)).release().perform();
		scrollaction.press(PointOption.point(100,2000)).waitAction(waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(100,900)).release().perform();
		
		
		
		
	}
	
	public static void scrollup1(){
		TouchAction scrollaction =new TouchAction(driver);
		//scrollaction.tap(fromX,fromY).waitAction(1000).moveTo(toX,toY).release().perform();
		//scrollaction.longPress(fromX,fromY).waitAction(1000).moveTo(toX,toY).release().perform();
		//scrollaction.tap(PointOption.point(100,2000)).waitAction(waitOptions(Duration.ofSeconds(4))).moveTo(PointOption.point(100,900)).release().perform();
		scrollaction.press(PointOption.point(100,800)).waitAction(waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(100,900)).release().perform();
		
		
		
		
	}
	
	public void scrollupDyn(){
		Dimension size = driver.manage().window().getSize();
		int startscroll =(int) (size.getHeight()* 0.5);
		int Endscroll =(int) (size.getHeight()* 0.2);
		
		TouchAction scroll =new TouchAction(driver);
		scroll.press(PointOption.point(0,startscroll)).waitAction(waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(0,Endscroll)).release().perform();
		
	}
	
	public void scrollup(MobileElement el){
		int scrollagain=0;
		while(scrollagain <=10){
			try{
				el.click();
				break;
			}
			catch(NoSuchElementException e){
				scrollupDyn();
				scrollagain++;
				
			}
			
		}
		
	}
	
	public void swipe_left_to_right(AppiumDriver<MobileElement> driver, int start_x,int start_y,int end_x,int end_y) throws InterruptedException{
		Dimension dimension=driver.manage().window().getSize();
		TouchAction touch = new TouchAction(driver);
		//touch.press(PointOption.point(start_x,start_y)).waitAction(waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(end_x,end_y)).release().perform();
		//Thread.sleep(2000);
		
		touch.longPress(PointOption.point(start_x,start_y)).waitAction(waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(end_x,end_y)).release().perform();
		Thread.sleep(2000);
	}
		
	

	
	


}
