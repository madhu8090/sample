package com.UBQGenericLib;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.UBQPageObjectLib.AddRetailerPage;
import com.UBQPageObjectLib.AttendancePage;
import com.UBQPageObjectLib.BillingPage;
import com.UBQPageObjectLib.CompetitorsProductInfoPage;
import com.UBQPageObjectLib.HomePage;
import com.UBQPageObjectLib.LoginPage;
import com.UBQPageObjectLib.MerchandisingActivityPage;
import com.UBQPageObjectLib.OrderEntryPage;
import com.UBQPageObjectLib.POS_ActivityPage;
import com.UBQPageObjectLib.Stock_View_Page;



/**
 * @author Praneeth
 *
 */
public class BaseClassLoader extends WebDriverCommonLib {

	public LoginPage login;
	public Stock_View_Page Stk;
	public AddRetailerPage AddRet;
	public WebDriverCommonLib wcl;
	public HomePage home;
	public OrderEntryPage order;
	public BillingPage Bill;
	public AttendancePage MarkAtt;
	public POS_ActivityPage Pos;
	public MerchandisingActivityPage merchAct;
	public CompetitorsProductInfoPage compInfo;
	

	@BeforeClass
	public void LoadMethods() throws Exception {
		try {
			logger.info("Started Loading Methods");
			login = PageFactory.initElements(driver, LoginPage.class);
			AddRet =PageFactory.initElements(driver, AddRetailerPage.class);
			Stk = PageFactory.initElements(driver, Stock_View_Page.class);
			home= PageFactory.initElements(driver, HomePage.class);
			order= PageFactory.initElements(driver,OrderEntryPage.class);
			Bill= PageFactory.initElements(driver,BillingPage.class);
			MarkAtt = PageFactory.initElements(driver,AttendancePage.class);
			Pos = PageFactory.initElements(driver,POS_ActivityPage.class);
			merchAct = PageFactory.initElements(driver,MerchandisingActivityPage.class);
			compInfo = PageFactory.initElements(driver,CompetitorsProductInfoPage.class);
			wcl = new WebDriverCommonLib();
			 logger.info("Completed Loading Methods");
			 waitforpageload();
			

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
