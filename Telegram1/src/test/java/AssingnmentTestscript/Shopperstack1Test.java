package AssingnmentTestscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import AssignmentObjectRepository.Addtocart1;
import AssignmentObjectRepository.LoginP5;
import AssignmentObjectRepository.WelcomePage4;



public class Shopperstack1Test {
	@Test (invocationCount = 1,threadPoolSize = 1,enabled = true,priority = 0)
	public void Addtocarttest()throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("AddtheAddresses");
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(30000);
		
		WelcomePage4 welcomePage=new WelcomePage4(driver);
		welcomePage.getLoginLink().click();
		Thread.sleep(15000);
	    LoginP5 login=new LoginP5(driver);	
		login.getEmail().sendKeys("rekhasasi.sampath@gmail.com");
		login.getPassword().sendKeys("Password@123");
		//click on login button
		login.getLoginbutton().click();
		Thread.sleep(15000);
		
		Addtocart1 cart=new Addtocart1(driver);
		cart.getWomen().click();
		cart.getSearch().click();
		Thread.sleep(3000);
		cart.getSleeves().sendKeys("forever21");
		cart.getAddtocart().click();
		driver.quit();
		
		
	}

}
