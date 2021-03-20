package salesTestCases;

import java.util.HashMap;


import org.testng.annotations.Test;

import com.UBQGenericLib.BaseClassLoader;
import com.UBQGenericLib.ExcelLib;
import com.UBQPageObjectLib.AddRetailerPage;
import com.UBQPageObjectLib.HomePage;

import io.appium.java_client.MobileElement;

/**
 * @author Praneeth
 *
 */
public class Tc_Sales_001_OrderEntryCreationAndVerification extends BaseClassLoader {
	HashMap<String, String> orderdata = new HashMap<String, String>();

	@Test
	public void OrderCreationAndVerification() throws InterruptedException {

		ExcelLib OrderDetails = new ExcelLib("./TestData/MobileData.xlsx");

		/*home.clickonMainMenu();
		Thread.sleep(100);
		home.clickonProfileDropdowm();
		Thread.sleep(100);
		home.clickonCaptureKYCImagesBtn();
		Thread.sleep(100);
		driver.hideKeyboard();
		order.enterRetailerName("DANY");
		Thread.sleep(100);
		order.ClickonenteredRetailer();
		Thread.sleep(100);
		order.clickoncheckincheckbox();
		Thread.sleep(100);
		order.clickonStartTranscationBtn();
		Thread.sleep(100);
		order.clickonupdatelatlongcheck();
		Thread.sleep(100);
		order.clickonOKBtn();
		Thread.sleep(100);
		order.clickonsaveBtn();
		Thread.sleep(100);
		order.clickonYesBtn();
		Thread.sleep(100);
		order.clickonOKBtn();
		Thread.sleep(200);
		order.clickonbackarrowBtn();
		Thread.sleep(200);
		*/
		home.clickonMainMenu();
		Thread.sleep(100);
		home.clickonSalesBtn();
		Thread.sleep(100);
		home.clickonOrderEntryBtn();
		Thread.sleep(100);
		// order.clickonClusterDwn();
		// Thread.sleep(100);
		// order.selectBeatvalue();
		// order.enterRetailerName("RetailerName");
		for (int n = 1; n <= 1; n++) {
			orderdata.put("RetailerName", OrderDetails.Excelread("RetailerData", n, 0));
			orderdata.put("ProductName",OrderDetails.Excelread("OrderData", n, 0));
			orderdata.put("Qty",OrderDetails.Excelread("OrderData", n, 1));
			Thread.sleep(100);
			order.enterRetailerName(orderdata.get("RetailerName"));
			Thread.sleep(100);
			/*MobileElement Dis = driver.findElementById("ubq.mobi.and.product:id/eli_distance_away");
			String Distance = Dis.getText();
			System.out.println(Distance);*/
			// System.out.println(order.getDistance());
			//order.getDistance();
			Thread.sleep(100);
			order.ClickonenteredRetailer();
			Thread.sleep(100);
			order.clickoncheckincheckbox();
			Thread.sleep(100);
			order.clickonStartTranscationBtn();
			Thread.sleep(100);
			order.clickonPlusBtntoAddSKU();
			Thread.sleep(600);
			int rowcount=OrderDetails.getlastrownum("OrderData");
			for(int i=1;i<=2;i++){
			order.enterProductName(orderdata.get("ProductName"));
			Thread.sleep(100);
			order.enterQty(orderdata.get("Qty"));
			}
			Thread.sleep(100);
			order.clickonDoneBtn();
			Thread.sleep(100);
			order.clickonordersaveBtn();
			Thread.sleep(100);
			order.clickonYesBtn();
			Thread.sleep(100);
			order.clickonOKBtn();
			
			
			
		}

	}
}
