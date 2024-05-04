package GenericLibrary;

import org.testng.annotations.Test;
 
import ObjectRepository.Jewerlypage;
import ObjectRepository.WelcomePage;

public class JewerlyTest extends Baseclass {
	@Test
	public void jewelry_001() throws InterruptedException {
		WelcomePage welcome=new WelcomePage(driver);
		Jewerlypage jewelry=new Jewerlypage(driver);
		welcome.getJewelrylink().click();
		
		// Get the jewelry page screenshot
		getWebPageScreenshot(driver);
		
		//Get the screenshot of add to cart button
		getWebElementScreenshot(jewelry.getAddtoCart());
		
		//Get the screenshot of Sort by dropdown
		getWebPageScreenshot(jewelry.getSortbydropdown());
		
		selectOptionByIndex(jewelry.getSortbydropdown(), 2);
		
		Thread.sleep(2000);
		
//		//selectOptionbyValue(jewelry.getViewAsDropdown(),"https://demowebshop.tricentis.com/jewelry?viewmode=list");
//		Thread.sleep(2000);
		
		
		selectOptionByVisibleText(jewelry.getDisplay(), "12");
		Thread.sleep(2000);
//		switchToWindowByTitle(driver, "filpkart");
//		`
//		switchToWindowByUrl(driver, "https:flipakart.com");
	}
	

}
