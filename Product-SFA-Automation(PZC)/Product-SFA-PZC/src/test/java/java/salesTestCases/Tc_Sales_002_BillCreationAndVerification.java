package salesTestCases;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.UBQGenericLib.BaseClassLoader;
import com.UBQGenericLib.ExcelLib;

@Listeners(com.UBQGenericLib.SampleListner.class)
public class Tc_Sales_002_BillCreationAndVerification extends BaseClassLoader {
	HashMap<String, String> BillData = new HashMap<String, String>();

	@Test(priority=0)
	public void StockVerification() throws InterruptedException {

		ExcelLib StockDetails = new ExcelLib("./TestData/MobileData.xlsx");
		int rowcount = StockDetails.getlastrownum("Stockview");
		// Bill.put("ProductName", BillDetails.Excelread("", i, 1));
		
		Thread.sleep(200);
		home.clickonMainMenu();
		Thread.sleep(100);
		Stk.ClickonStockViewBtn();
		Thread.sleep(200);
		
		  int prodlist = Stk.getCountOfProductDetails();
		  
		  if (rowcount > 1 && rowcount == prodlist) 
		  { for (int i = 1; i <= rowcount; i++) { 
			  Stk.getproductNameFromList(i);
		 //Stk.enterProductName("BOURBON 20G 450PK 15JAR CBB NL");
		  System.out.println(StockDetails.Excelread("BillData", i, 0)); 
		  if(StockDetails.Excelread("Stockview", i, 0).equalsIgnoreCase(Stk.getproductNameFromList(i))) {
		  Assert.assertEquals(Stk.getproductNameFromList(i), StockDetails.Excelread("Stockview", i, 0));
		  Assert.assertEquals(Stk.getproductPriceFromList(i), "NGN " + StockDetails.Excelread("Stockview", i, 1));
		 Assert.assertEquals(Stk.getproductQtyFromList(i), StockDetails.Excelread("Stockview", i, 3));
		 break; 
		 }
		  
		  }
		  
		  } else { Assert.assertTrue(false, "Stock details not available"); }
		  
		  System.out.println("StockVerificationCompleted");
		  Bill.clickonbackarrowBtn();
		  
		  
		  
		  }
	@Test(priority=1,dependsOnMethods="StockVerification")
	public void BillCreation() throws InterruptedException{
		
		ExcelLib BillDetails = new ExcelLib("./TestData/MobileData.xlsx");
		Thread.sleep(100);
		home.clickonMainMenu();
		Thread.sleep(100);
		home.clickonSalesBtn();
		Thread.sleep(100);
		home.clickonBillingBtn();
		Thread.sleep(100);
		
		for (int n = 1; n <= 1; n++) {
			BillData.put("RetailerName",BillDetails.Excelread("RetailerData", n, 0));
			BillData.put("ProductName",BillDetails.Excelread("BillData", n, 0));
			BillData.put("ProductQty",BillDetails.Excelread("BillData", n, 1));
			Thread.sleep(100);
			Bill.enterRetailerName(BillData.get("RetailerName"));
			Thread.sleep(100);
			Bill.ClickonenteredRetailer();
			Thread.sleep(100);
			Bill.clickoncheckincheckbox();
			Thread.sleep(100);
			Bill.clickonStartTranscationBtn();
			Thread.sleep(100);
			Bill.clickonPlusBtntoAddSKU();
			Thread.sleep(200);
			int rowcount=BillDetails.getlastrownum("BillData");
			System.out.println("No of Prpducts:"+rowcount);
			for(int i=1;i<=rowcount+1;i++){
				Bill.enterProductName(BillData.get("ProductName"));
				Thread.sleep(100);
				Bill.enterQty(BillData.get("ProductQty"));
				
			}
			Thread.sleep(100);
			Bill.clickonDoneBtn();
			Thread.sleep(100);
			Bill.clickonBillsaveBtn();
			Thread.sleep(100);
			//Bill.clickonYesBtn();
			Bill.clickonNoBtn();
			Thread.sleep(100);
			//Bill.clickonOKBtn();
			Thread.sleep(100);
			//Bill.clickonbackarrowBtn();
			
			
		}
		
		
	}
	
	
	

		  
	/*	  
		  for (int n = 1; n <= 2;) { Bill.put("ProductName",
		  BillDetails.Excelread("BillData", n, 0)); Bill.put("ProductMrp",
		  BillDetails.Excelread("BillData", n, 1)); Thread.sleep(200);
		  home.clickonMainMenu(); Thread.sleep(100); Stk.ClickonStockViewBtn();
		  Stk.enterProductName(Bill.get("ProductName");
		  
		  Thread.sleep(200); int prodlist = Stk.getCountOfProductDetails();
		  
		  System.out.println("No of products:"+prodlist);
		  if(Stk.getCountOfProductDetails() >=1){ for(int i=0;i<=Stk.getCountOfProductDetails();){
			  Thread.sleep(500); 
			  String  getProducName=Stk.getproductNameFromList(i); 
			  String getProductMrp=Stk.getproductPriceFromList(i); 
			  String getProductQty=Stk.getproductQtyFromList(i);
		  if(getProducName.contains(Bill.get("ProductName")) &&
		  getProductMrp.contains(Bill.get("ProductName"))){
		  Bill.put("ProductName", Stk.getproductNameFromList(i));
		  Bill.put("ProductMrp", Stk.getproductPriceFromList(i)); 
		  break;
		 
		  } else { if (i < Stk.getCountOfProductDetails()) { i++; } else {
		  ast.assertEquals(false, "Product Details not found for given BillEntrys"); }
		  
		  } } } }
		  */
		 

	/*	for (int n = 1; n <= rows; n++) {
			String producName = BillDetails.Excelread("Stockview", n, 0);
			String productMrp = BillDetails.Excelread("Stockview", n, 1);
			String productQty = BillDetails.Excelread("Stockview", n, 3);
			
			Bill.put("Product", BillDetails.Excelread("Stockview", n, 0));
			Bill.put("ProductName", "producName");
			Bill.put("ProductMrp", "productMrp");
			Bill.put("ProductQty", "productQty");
			Stk.enterProductName(Bill.get("Product"));

			if (Stk.getCountOfProductDetails() >= 1) {
				for (int i = 1; i <= Stk.getCountOfProductDetails();) {
					Thread.sleep(500);
					if (Stk.getproductNameFromList(i).contains(Bill.get("ProductName"))
							&& Stk.getproductPriceFromList(i).contains(Bill.get("ProductMrp"))
							&& Stk.getproductQtyFromList(i).contains(Bill.get("ProductQty"))) {
						Bill.put("ProductName", Stk.getproductNameFromList(i));
						Bill.put("ProductMrp", Stk.getproductPriceFromList(i));
						Bill.put("productQty", Stk.getproductQtyFromList(i));
						break;
					} else {
						if (i < Stk.getCountOfProductDetails()) {
							i++;
						} else {
							ast.assertEquals(false, "Product Details not found for given BillEntrys");
						}

					}

				}
			}

		}*/
	
	
	
	}

