package marketIntelligenceTestCases;

/**
 * @author Praneeth
 *
 */

import java.util.HashMap;

import org.testng.annotations.Test;

import com.UBQGenericLib.BaseClassLoader;

public class Tc_Merch_001_CompetitorSKU extends BaseClassLoader {
	
	HashMap<String, String> compdata = new HashMap<String, String>();
	
	@Test
	public void compinfo() throws InterruptedException{
	compdata.put("RetailerName","AUNTY EASTER");
	Thread.sleep(200);
	home.clickonMainMenu();
	Thread.sleep(200);
	home.clickonMarketIntelligenceBtn();
	Thread.sleep(200);
	home.clickonCompetitorProductInfoBtn();
	Thread.sleep(200);
	compInfo.enterRetailerName(compdata.get("RetailerName"));
	Thread.sleep(200);
	compInfo.ClickonenteredRetailer();
	Thread.sleep(200);
	driver.hideKeyboard();
	Thread.sleep(100);
	compInfo.clickoncheckincheckbox();
	Thread.sleep(100);
	compInfo.clickonStartTranscationBtn();
	Thread.sleep(100);
	compInfo.clickonplusBtntoaddcompProduct();
	Thread.sleep(100);
	
	
	
	
	
	
	

}
}
