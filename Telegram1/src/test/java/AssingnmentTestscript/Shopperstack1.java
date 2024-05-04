package AssingnmentTestscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import AssignmentObjectRepository.LoginP5;
import AssignmentObjectRepository.LoginPage3;
import AssignmentObjectRepository.WelcomePage4;




public class Shopperstack1 {
	@Test (invocationCount = 1,threadPoolSize = 1,enabled = true,priority = 0)
	public void ChromePage() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("ChromeBrowser");
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
	}
	 @Test(priority = 1)
	  public void register() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(3000);
		
		WelcomePage4 welcomePage=new WelcomePage4(driver);
		welcomePage.getLoginLink().click();

		LoginPage3 createaccount=new LoginPage3(driver);
		createaccount.getCreateaccount().click();
		
		createaccount.getFirstname().sendKeys("Sampath");
		createaccount.getLastname().sendKeys("Raja");
		createaccount.getGender().sendKeys("Male");
		createaccount.getPhonenumber().sendKeys("9876543210");
		createaccount.getEmailaddress().sendKeys("asdfghj@gmail.com");
		createaccount.getPassword().sendKeys("Password@123");
		createaccount.getConfirmpwd().sendKeys("Password@123");
		createaccount.getIagree().click();
		createaccount.getRegister().click();
		driver.quit();
		}
	 @Test (priority = 2)
		public void Login() throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			System.out.println("Login");
			driver.get("https://www.shoppersstack.com/");
			Thread.sleep(5000);
			
			WelcomePage4 welcomePage=new WelcomePage4(driver);
			welcomePage.getLoginLink().click();
			
		    LoginP5 login=new LoginP5(driver);
		    
			
			login.getEmail().sendKeys("sampath01@gmail.com");
			login.getPassword().sendKeys("Password@123");
			//click on login button
			login.getLoginbutton().click();
			driver.quit();
		}
	
}
