package salesTestCases;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
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
		
		Thread.sleep(200);
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
			//orderdata.put("RetailerName", OrderDetails.Excelread("RetailerData", n, 0));
			//orderdata.put("ProductName",OrderDetails.Excelread("OrderData", n, 0));
			//orderdata.put("Qty",OrderDetails.Excelread("OrderData", n, 1));
			Thread.sleep(100);
			//order.enterRetailerName(orderdata.get("AND 7"));
			order.enterRetailerName("AND 7");
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
			
			int x=0;
			int y=0;
			List<MobileElement>	MSL=driver.findElements(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
					+ "android.widget.TableLayout/android.widget.TableRow[1]/android.widget.TextView"));
			
			
			for(MobileElement e:MSL){
				int productcount=MSL.size();
				System.out.println(productcount);
				String productname=e.getText();
				//System.out.println(e.getAttribute("text"));
				System.out.println(productname);
				System.out.println("Coordinates of X ="+ e.getLocation().getX() +" and Y =" +e.getLocation().getY());
				
				if(e.getText().equalsIgnoreCase("CANOE FAB SOAP 130G WRAP EXC A/VERAX48")){
					x=e.getLocation().getX();
					y=e.getLocation().getY();
					break;
					
				}
				swipe_left_to_right(driver, x+97, y, x+1000, y);
			}
			//swipe_left_to_right(driver, 50, 400, 1000, y);
			
			
			/*order.clickonPlusBtntoAddSKU();
			Thread.sleep(600);
			int rowcount=OrderDetails.getlastrownum("OrderData");
			System.out.println(rowcount);
			for(int i=0;i<=rowcount;rowcount++){
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
			order.clickonOKBtn();*/
			
			int productcount=MSL.size();
			order.clickonPlusBtntoAddSKU();
			Thread.sleep(600);
			int rowcount=OrderDetails.getlastrownum("OrderData");
			
				for (int i = 0; i <= rowcount+1; i++) {
					orderdata.put("ProductName",OrderDetails.Excelread("OrderData", n, 0));
					orderdata.put("Qty",OrderDetails.Excelread("OrderData", n, 1));
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
	

	

