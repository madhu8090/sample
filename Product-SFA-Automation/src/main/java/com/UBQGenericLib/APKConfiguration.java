package com.UBQGenericLib;

import java.io.File;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.UBQPageObjectLib.AttendancePage;
import com.UBQPageObjectLib.LoginPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

/**
 * @author Praneeth
 *
 */

public class APKConfiguration implements Constants
{
public static AndroidDriver<MobileElement> driver;
	
	 LoginPage login;
	 AttendancePage Attendance;
	 

	public static Logger logger = Logger.getLogger("LoggerCreation");

	@BeforeSuite
	public AndroidDriver<MobileElement> APKConfig() throws InterruptedException {
		PropertyConfigurator.configure(System.getProperty("user.dir") + "/Resources/log4j.properties");
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		try {
			File apkdir = new File(APKPATH);
			File App = new File(apkdir,APKNAME );

			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Praneeth");
			cap.setCapability(MobileCapabilityType.APP, App.getAbsolutePath());
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
			//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
			// cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"200");
			cap.setCapability("appPackage", "ubq.mobi.and.product");
			cap.setCapability("appActivity", "ubq.mobi.and.base.UContainerActivity");
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		}

		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to Configure APK, Please Check the settings " + e.getMessage());
		}
		
		login = new LoginPage();
		login.login();
		Thread.sleep(200);
		//Attendance = new AttendancePage();
		//Attendance.Mark_Attendance();
		
		return driver;

	}

/*	@AfterSuite
	public void Logout() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open']")).click();
		Thread.sleep(100);
		driver.findElementByAndroidUIAutomator("text(\"Logout\")").click();
		driver.
		Thread.sleep(100);
		driver.findElementById("android:id/button1").click();

	}
*/	

}
