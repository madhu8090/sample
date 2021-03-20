package StockTestCases;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.UBQGenericLib.BaseClassLoader;
import com.UBQGenericLib.ExcelLib;
import com.UBQPageObjectLib.AddRetailerPage;
import com.UBQPageObjectLib.Stock_View_Page;

public class Tc_01_StockVerificationTestCase extends BaseClassLoader {
	
	HashMap<String, String> stockdata = new HashMap<String, String>();

	@Test
	public void verificationOfStockItems() throws InterruptedException {
		

		Stk = new Stock_View_Page();
		ExcelLib StockDetails = new ExcelLib("./TestData/MobileData.xlsx");
		//ExcelLib StockDetail = new ExcelLib("./TestData/MobileData.xlsx");
		int rowcount = StockDetails.getlastrownum("Stockview");
	
		Thread.sleep(200);
		home.clickonMainMenu();
		Thread.sleep(100);
		Stk.ClickonStockViewBtn();
		
		Thread.sleep(200);
		int prodlist = Stk.getCountOfProductDetails();

		if (rowcount > 1 && rowcount == prodlist) {
			for (int i = 1; i <= rowcount; i++) {
				Stk.getproductNameFromList(i);
				System.out.println(StockDetails.Excelread("Stockview", i, 0));
				if (StockDetails.Excelread("Stockview", i, 0).equalsIgnoreCase(Stk.getproductNameFromList(i))) {
					Assert.assertEquals(Stk.getproductNameFromList(i), StockDetails.Excelread("Stockview", i, 0));
					Assert.assertEquals(Stk.getproductPriceFromList(i),
							"NGN " + StockDetails.Excelread("Stockview", i, 1));
					Assert.assertEquals(Stk.getproductQtyFromList(i), StockDetails.Excelread("Stockview", i, 3));
					break;
				}

			}

		} else {
			Assert.assertTrue(false, "Stock details not available");
		}
	
	
	/*try {
		
		
		
		//Assert.assertEquals(stk.getMainText(), "Stock View", "Main Text Not Matching");
		
		//stk.searchbyProductName("HTC P3450");
		Stk.enterProductName("BOURBON 20G 450PK 15JAR CBB NL");
		
		
		
	
		
	} catch (Exception e) {
		Assert.assertTrue(false);
		logger.error("Error " + e.getMessage());
	}*/
	
}
		
		

}
