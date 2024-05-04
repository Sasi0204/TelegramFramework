package com.TestScripts;

import org.testng.annotations.Test;

import GenericLibrary.Baseclass;
import ObjectRepository.ApparelPage;
import ObjectRepository.WelcomePage;

public class ApparelTest extends Baseclass {

		@Test
		public void apparel_001() {
			WelcomePage welcome=new WelcomePage(driver);
			
			ApparelPage apparel=new ApparelPage(driver);
			
			//Click on Apparels link
			welcome.getApparellink().click();
			test.log(LogStatus.INFO, "Clicked on Apparels link");
			//Verify Apparel page is displayed
			Assert.assertEquals(apparel.getPageTitle().getText(), "Apparel & Shoes");
			test.log(LogStatus.PASS, "Apparels page is displayed");
			
//			Reporter.log("jnojcbsoaclj",true);
		}

}
