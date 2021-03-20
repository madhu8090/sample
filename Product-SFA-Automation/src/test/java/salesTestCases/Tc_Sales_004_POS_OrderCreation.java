package salesTestCases;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.UBQGenericLib.BaseClassLoader;
import com.UBQGenericLib.ExcelLib;
/**
 * @author Praneeth
 *
 */
public class Tc_Sales_004_POS_OrderCreation extends BaseClassLoader {
	HashMap<String, String> POSorderdata = new HashMap<String, String>();
	
	@Test
	public void OrderCreationAndVerification() throws InterruptedException {

		ExcelLib POSOrderDetails = new ExcelLib("./TestData/MobileData.xlsx");
		POSorderdata.put("RetailerName", "AUNTY EASTER");
		Thread.sleep(200);
		home.clickonMainMenu();
		Thread.sleep(100);
		home.clickonPosActivityBtn();
		Thread.sleep(100);
		//int rowcount=POSOrderDetails.getlastrownum("BillData");
		for (int n = 1; n <= 1; n++) {
			POSorderdata.put("RetailerName",POSOrderDetails.Excelread("RetailerData", n, 0));
			POSorderdata.put("ProductName",POSOrderDetails.Excelread("BillData", n, 1));
			POSorderdata.put("ProductQty",POSOrderDetails.Excelread("BillData", n, 2));
			Thread.sleep(100);
			order.enterRetailerName(POSorderdata.get("RetailerName"));
			Thread.sleep(100);
			order.ClickonenteredRetailer();
			Thread.sleep(100);
			order.clickoncheckincheckbox();
			Thread.sleep(100);
			order.clickonStartTranscationBtn();
			Thread.sleep(100);
			Pos.ClickonOrderEntryRadioBtn();
			Thread.sleep(100);
			order.clickonPlusBtntoAddSKU();
			Thread.sleep(500);
			int rowcount=POSOrderDetails.getlastrownum("BillData");
			System.out.println("No of Prpducts:"+rowcount);
			for(int i=1;i<=rowcount;i++){
				order.enterProductName(POSorderdata.get("ProductName"));
				Thread.sleep(100);
				order.enterQty(POSorderdata.get("ProductQty"));
			}
			order.clickonDoneBtn();
			Thread.sleep(100);
			order.clickonsaveBtn();
			Thread.sleep(100);
			
			
			
}
	
}
}
