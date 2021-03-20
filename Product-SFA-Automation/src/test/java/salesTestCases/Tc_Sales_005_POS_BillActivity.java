package salesTestCases;
/**
 * @author Praneeth
 *
 */
import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import com.UBQGenericLib.BaseClassLoader;
import com.UBQGenericLib.ExcelLib;


public class Tc_Sales_005_POS_BillActivity extends BaseClassLoader{
	
	HashMap<String, String> POSBilldata = new HashMap<String, String>();
	
	@Test
	public void OrderCreationAndVerification() throws InterruptedException {

		ExcelLib POSOrderDetails = new ExcelLib("./TestData/MobileData.xlsx");
		POSBilldata.put("RetailerName", "AUNTY EASTER");
		POSBilldata.put("CollectionAmount", "100");
		POSBilldata.put("Collectorname","ABC");
		POSBilldata.put("DisplayStands","10");
		POSBilldata.put("RollUpBanners","5");
		POSBilldata.put("Shelftalkers","2");
		POSBilldata.put("BeachUmbrella","Good");
		POSBilldata.put("CompSKUName",Autoalphavalue(5) +" " + Autoalphavalue(6));
		POSBilldata.put("Price",AutoalphaNumericvalue(3));
		POSBilldata.put("Rate",AutoalphaNumericvalue(2));
		POSBilldata.put("Promotion","Buy 1 Get 1 Free");
		POSBilldata.put("RetailerStock",AutoalphaNumericvalue(2));
		POSBilldata.put("Margin","2.0");
		POSBilldata.put("Remarks",Autoalphavalue(10));
		
		Thread.sleep(200);
		home.clickonMainMenu();
		Thread.sleep(100);
		home.clickonPosActivityBtn();
		Thread.sleep(100);
		int rowcount=POSOrderDetails.getlastrownum("BillData");
		System.out.println(rowcount);
		ArrayList<PosActivity> list = new ArrayList();
		for (int n = 1; n <= rowcount; n++) {
			System.out.println("inside first for loop " + n);
//			POSBilldata.put("RetailerName",POSOrderDetails.Excelread("RetailerData", n, 0));
//			POSBilldata.put("ProductName",POSOrderDetails.Excelread("BillData", n, 0));
//			POSBilldata.put("ProductQty",POSOrderDetails.Excelread("BillData", n, 1));
			System.out.println(POSOrderDetails.Excelread("BillData", n, 0));
						
			PosActivity posAct = new PosActivity(POSOrderDetails.Excelread("BillData", n, 0), "", POSOrderDetails.Excelread("BillData", n, 1));
			list.add(posAct);
			
		}
			Thread.sleep(100);
			order.enterRetailerName(POSBilldata.get("RetailerName"));
			Thread.sleep(100);
			Bill.ClickonenteredRetailer();
			Thread.sleep(100);
			driver.hideKeyboard();
			Thread.sleep(100);
			Bill.clickoncheckincheckbox();
			Thread.sleep(100);
			Bill.clickonStartTranscationBtn();
			Thread.sleep(100);
			Pos.ClickonBillingRadioBtn();
			Thread.sleep(100);
			Bill.clickonPlusBtntoAddSKU();
			Thread.sleep(500);
			rowcount=POSOrderDetails.getlastrownum("BillData");
			System.out.println("No of Products:"+rowcount);
			
			for(int i=0; i<rowcount; i++){
				System.out.println("inside for loop " + i);
				PosActivity posAct = list.get(i);
				System.out.println(posAct.getProductName());
				Bill.enterProductName(posAct.getProductName());
				Thread.sleep(100);
				Bill.enterQty(posAct.getQuantity());
			}
			
			
			Bill.clickonDoneBtn();
			Thread.sleep(100);
			Bill.clickonBillsaveBtn();
			Thread.sleep(100);
			Bill.clickonYesBtn();
			Thread.sleep(100);
			Bill.clickonOKBtn();
			Thread.sleep(100);
			
			//------------------Page Navigates to PaymentPage-----------------//
			Pos.enterCollectionAmt(POSBilldata.get("CollectionAmount"));
			Thread.sleep(100);
			Pos.enterCollectorName(POSBilldata.get("Collectorname"));
			Thread.sleep(100);
			Pos.ClickonCollectionsaveBtn();
			Thread.sleep(100);
			Pos.clickonyesBtn();
			Thread.sleep(100);
			Pos.clickonOKBtn();
			Thread.sleep(100);
			//------------------Page Navigates to Merchandising Page-----------------//
			Pos.enterNoofDisplaystands(POSBilldata.get("DisplayStands"));
			Thread.sleep(100);
			Pos.enterNoofRollUpBanners(POSBilldata.get("RollUpBanners"));
			Thread.sleep(100);
			Pos.enterNoofShelftalkers(POSBilldata.get("Shelftalkers"));
			Thread.sleep(100);
			Pos.enterBeachumbrella(POSBilldata.get("BeachUmbrella"));
			Thread.sleep(100);
			Pos.clickonMerchandisingsaveBtn();
			Thread.sleep(100);
			Pos.clickonyesBtn();
			Thread.sleep(100);
			Pos.clickonOKBtn();
			Thread.sleep(100);
			
			//------------------Page Navigates to Competitor Page-----------------//
			Pos.ClickonCompitetorDropdowm();
			
			/*
			 
			
			Pos.clickonplusBtntoaddcompProduct();
			Thread.sleep(100);
			Pos.enterProductName(POSBilldata.get("ProductName"));
			Thread.sleep(100);
			Pos.selectcheckbox();
			Thread.sleep(100);
			Pos.clickonDoneBtn();
			Thread.sleep(100);
			Pos.ClickonCompitetorDropdowm();
			Thread.sleep(100);
			Pos.selectCompetitorfromList();
			Thread.sleep(100);
			Pos.entercompProductName(POSBilldata.get("CompSKUName"));
			Thread.sleep(100);
			Pos.entercompPrice(POSBilldata.get("Price"));
			Thread.sleep(100);
			Pos.entercompRate(POSBilldata.get("Rate"));
			Thread.sleep(100);
			Pos.clickonOKBtn();
			Thread.sleep(100);
			Pos.entercompPromotion(POSBilldata.get("Promotion"));
			Thread.sleep(100);
			Pos.entercompRemarks(POSBilldata.get("Remarks"));
			Thread.sleep(100);
			Pos.clickoncompSaveBtn();
			Thread.sleep(100);
			Pos.clickonyesBtn();
			Thread.sleep(100);
			Pos.clickonOKBtn();
			Thread.sleep(100);
			*/
			

		
	
}
}