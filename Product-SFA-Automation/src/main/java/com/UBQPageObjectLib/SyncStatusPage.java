package com.UBQPageObjectLib;

import org.openqa.selenium.By;

import com.UBQGenericLib.WebDriverCommonLib;

public class SyncStatusPage extends WebDriverCommonLib{

	// ----------------------UI Elements----------------------//

		// ---For getMainText---//
		public String getMainText() {
			return getText(driver.findElement(By.xpath(
					"//android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]")));

		}
}
