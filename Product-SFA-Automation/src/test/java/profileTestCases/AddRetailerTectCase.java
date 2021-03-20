package profileTestCases;


import java.util.HashMap;
import org.testng.annotations.Test;
import com.UBQGenericLib.BaseClassLoader;
import com.UBQPageObjectLib.AddRetailerPage;

/**
 * @author Praneeth
 *
 */

public class AddRetailerTectCase extends BaseClassLoader{
	HashMap<String, String> retailerdata = new HashMap<String, String>();
	
	@Test
	public void AddRetailerVerification() throws InterruptedException
	{
		
		
		/*// This below code is for specific for Britannia Product SFA //
		 * 
		 * 
		retailerdata.put("RetailerName", "Naveen Stores");
		retailerdata.put("OwnerName", "Naveen");
		retailerdata.put("Shopbuildingnumber", "10B");
		retailerdata.put("Street", "BTM 2nd stage");
		retailerdata.put("PhoneNumber",+98+AutoNumericvalue(8));
		retailerdata.put("Checkboxselect","Bingo Rack - L");
		retailerdata.put("FSU", "2");
		retailerdata.put("Counterdispenser", "5");
		retailerdata.put("NoOfStaffs", "3");
		retailerdata.put("Chain", "D Mart");
		retailerdata.put("GSTType", "GST");
		retailerdata.put("PostalCode", AutoNumericvalue(5));
		retailerdata.put("AltPn", +87+AutoNumericvalue(8));
		retailerdata.put("FAX", AutoNumericvalue(5));
		retailerdata.put("BankName", "SBI");
		retailerdata.put("AccountName", "Savings");
		retailerdata.put("AccountN0", AutoNumericvalue(10));
		retailerdata.put("BankBranch",Autoalphavalue(5));
		retailerdata.put("Email","pani8000@gmail.com");
		
		AddRet =new AddRetailerPage();
		Thread.sleep(200);
		Stk.ClickonMainMenu();
		Thread.sleep(100);
		AddRet.clickonProfileDropdowm();
		Thread.sleep(100);
		AddRet.ClickonAddRetailerBtn();
		AddRet.ClickonBeatNameDropdownBtn();
		Thread.sleep(100);
		AddRet.selecBeat();
		Thread.sleep(100);
		AddRet.EnterRetailerName(retailerdata.get("RetailerName"));
		AddRet.EnterOwnerName(retailerdata.get("OwnerName"));		
		AddRet.Entershopbuildingnumber(retailerdata.get("Shopbuildingnumber"));
		AddRet.EnterStreet(retailerdata.get("Street"));
		AddRet.clickonLandMarkDropdown();
		Thread.sleep(100);
		AddRet.selectLandmark();
		Thread.sleep(100);
		//AddRet.clickonStateDropdown();
		//Thread.sleep(100);
		//AddRet.selectState();
		//Thread.sleep(100);
		//AddRet.clickonDistrictDropdown();
		//Thread.sleep(100);
		//AddRet.selectDistrict();
		AddRet.clickonSubDistrictDropdown();
		Thread.sleep(100);
		AddRet.selectSubDistrict();
		Thread.sleep(100);
		AddRet.clickonVillageDropdown();
		Thread.sleep(100);
		AddRet.selectVillage();
		Thread.sleep(100);
		//scrollup();
		scrollupDyn();
		//AddRet.scroll("Channel *");
		Thread.sleep(500);
		AddRet.EnterphoneNo(retailerdata.get("PhoneNumber"));
		Thread.sleep(100);
		AddRet.clickonchannelDropdown();
		Thread.sleep(100);
		AddRet.selectchannel();
		Thread.sleep(200);
		scrollupDyn();
		Thread.sleep(100);
		AddRet.clickonsizeDropdown();
		Thread.sleep(100);
		AddRet.selectSize();
		Thread.sleep(100);
		AddRet.clickonshapeDropdown();
		Thread.sleep(100);
		AddRet.selectShape();
		Thread.sleep(100);
		scrollupDyn();
		Thread.sleep(100);
		AddRet.SelectBingoRackLCheckBox();
		Thread.sleep(100);
		AddRet.clickonFSUDropdown();
		Thread.sleep(100);
		AddRet.selectFSU(retailerdata.get("FSU"));
		Thread.sleep(100);
		AddRet.clickonCounterdispenserDropdown();
		Thread.sleep(100);
		AddRet.selectCounterdispenser(retailerdata.get("Counterdispenser"));
		Thread.sleep(100);
		AddRet.clickonNoOfStaffsDropdown();
		Thread.sleep(100);
		AddRet.selectNoOfStaffs(retailerdata.get("NoOfStaffs"));
		Thread.sleep(100);
		scrollupDyn();
		//AddRet.clickonTaxtypeDropdown();
		//Thread.sleep(100);
		//AddRet.selectTaxtype(retailerdata.get("GSTType"));
		//Thread.sleep(100);
		AddRet.clickonAdditionalInfolink();
		Thread.sleep(100);
		scrollupDyn();
		Thread.sleep(100);
		AddRet.EnterPostalCode(retailerdata.get("PostalCode"));
		Thread.sleep(100);
		AddRet.EnterAlternatePhNo(retailerdata.get("AltPn"));
		Thread.sleep(100);
		AddRet.EnterFaxNo(retailerdata.get("FAX"));	
		Thread.sleep(100);
		AddRet.Enteremail(retailerdata.get("Email"));
		Thread.sleep(100);
		scrollupDyn();
		AddRet.EnterBankName(retailerdata.get("BankName"));
		Thread.sleep(100);
		AddRet.EnterAccountName(retailerdata.get("AccountName"));
		Thread.sleep(100);
		AddRet.EnterAccountNo(retailerdata.get("AccountN0"));
		Thread.sleep(100);
		//AddRet.clickonAccountstatusDropDown();
		//Thread.sleep(100);
		//AddRet.selectAccStatus();
		Thread.sleep(100);
		AddRet.EnterBankBranch(retailerdata.get("BankBranch"));	
		Thread.sleep(100);
		AddRet.clickonTickBtn();
		Thread.sleep(200);
		AddRet.clickonCameraBtn();
		Thread.sleep(500);
		AddRet.clickonshutterBtn();
		Thread.sleep(800);
		AddRet.clickonCameraTickBtn();
		Thread.sleep(500);
		AddRet.clickonretailerSaveBtn();
		Thread.sleep(100);
		AddRet.clickonPopupYesBtn();
		Thread.sleep(100);
		AddRet.clickonPopupOKBtn();
		Thread.sleep(100);
		
		*/
	
		//This code is specific for PZC Product SFA//
		
		retailerdata.put("RetailerName", "Naveen Stores");
		retailerdata.put("OwnerName", "Naveen");
		retailerdata.put("Shopbuildingnumber", "10B");
		retailerdata.put("Street", "BTM 2nd stage");
		retailerdata.put("PhoneNumber",+9+AutoNumericvalue(10));
		retailerdata.put("Landmark", Autoalphavalue(10));
		retailerdata.put("Channel", "Open Market");
		retailerdata.put("PostalCode", AutoNumericvalue(5));
		retailerdata.put("AltPn", +9+AutoNumericvalue(10));
		retailerdata.put("FAX", AutoNumericvalue(5));
		retailerdata.put("BankName", "SBI");
		retailerdata.put("AccountName", "Savings");
		retailerdata.put("AccountN0", AutoNumericvalue(16));
		retailerdata.put("BankBranch",Autoalphavalue(5));
		retailerdata.put("Email","pani8000@gmail.com");
		
		
		AddRet =new AddRetailerPage();
		Thread.sleep(300);
		Stk.ClickonMainMenu();
		Thread.sleep(100);
		AddRet.clickonProfileDropdowm();
		Thread.sleep(100);
		AddRet.ClickonAddRetailerBtn();
		Thread.sleep(100);
		AddRet.ClickonBeatNameDropdownBtn();
		Thread.sleep(100);
		AddRet.selecBeat();
		Thread.sleep(100);
		AddRet.EnterRetailerName(retailerdata.get("RetailerName"));
		AddRet.EnterOwnerName(retailerdata.get("OwnerName"));		
		AddRet.Entershopbuildingnumber(retailerdata.get("Shopbuildingnumber"));
		AddRet.EnterStreet(retailerdata.get("Street"));
		AddRet.EnterLandMark(retailerdata.get("Landmark"));
		Thread.sleep(100);
		AddRet.EnterphoneNo(retailerdata.get("PhoneNumber"));
		Thread.sleep(100);
		AddRet.clickonchannelDropdown();
		Thread.sleep(100);
		//AddRet.selectchannel(retailerdata.get("Channel"));
		AddRet.selectchannel1();
		Thread.sleep(100);
		scrollupDyn();
		Thread.sleep(100);
		AddRet.clickonAdditionalInfolink();
		scrollupDyn();
		Thread.sleep(100);
		AddRet.EnterPostalCode(retailerdata.get("PostalCode"));
		Thread.sleep(100);
		AddRet.EnterAlternatePhNo(retailerdata.get("AltPn"));
		Thread.sleep(100);
		AddRet.EnterFaxNo(retailerdata.get("FAX"));	
		Thread.sleep(100);
		AddRet.Enteremail(retailerdata.get("Email"));
		Thread.sleep(100);
		scrollupDyn();
		AddRet.EnterBankName(retailerdata.get("BankName"));
		Thread.sleep(100);
		AddRet.EnterAccountName(retailerdata.get("AccountName"));
		Thread.sleep(100);
		AddRet.EnterAccountNo(retailerdata.get("AccountN0"));
		Thread.sleep(100);
		//AddRet.clickonAccountstatusDropDown();
		//Thread.sleep(100);
		//AddRet.selectAccStatus();
		Thread.sleep(100);
		AddRet.EnterBankBranch(retailerdata.get("BankBranch"));	
		Thread.sleep(100);
		AddRet.clickonTickBtn();
		Thread.sleep(200);
		AddRet.clickonCameraBtn();
		Thread.sleep(500);
		AddRet.clickonshutterBtn();
		Thread.sleep(800);
		AddRet.clickonCameraTickBtn();
		Thread.sleep(500);
		
		
		
		
		
		
		
	}

}
