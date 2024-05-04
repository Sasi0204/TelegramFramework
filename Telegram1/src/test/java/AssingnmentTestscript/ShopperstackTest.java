package AssingnmentTestscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import AssignmentObjectRepository.AccountSettings1;
import AssignmentObjectRepository.EditProfile2;
import AssignmentObjectRepository.LoginP5;
import AssignmentObjectRepository.LoginPage3;
import AssignmentObjectRepository.WelcomePage4;


public class ShopperstackTest {
	@Test (invocationCount = 1,threadPoolSize = 1,enabled = true,priority = 0)
	public void ChromePage() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("ChromeBrowser");
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(5000);
	}
	@Test (priority = 1)
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
		createaccount.getEmailaddress().sendKeys("sampath@gmail.com");
		createaccount.getPassword().sendKeys("Password@123");
		createaccount.getConfirmpwd().sendKeys("Password@123");
		createaccount.getIagree().click();
		createaccount.getRegister().click();
		driver.quit();
		}
	@Test 
	public void Login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("Login");
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(15000);
		
		WelcomePage4 welcomePage=new WelcomePage4(driver);
		welcomePage.getLoginLink().click();	
		
	    LoginP5 login=new LoginP5(driver);
		login.getEmail().sendKeys("rekhasasi.sampath@gmail.com");
		login.getPassword().sendKeys("Password@123");
		//click on login button
		login.getLoginbutton().click();
		driver.quit();
	}
	@Test 
	
	public void AddtheAddresses() throws InterruptedException {
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
		
		AccountSettings1 address=new AccountSettings1(driver);
		address.getAccountsetting().click();
		address.getMyprofile().click();
		address.getMyaddresses().click();
		address.getAddaddress().click();
		address.getAddresstype().sendKeys("Home");
		address.getName().sendKeys("Sasi");
		address.getHouseinfo().sendKeys("15 A");
		address.getStreetinfo().sendKeys("Mgr nagar");
		address.getLandmark().sendKeys("Data udpi Hotel");
		address.getCountry().sendKeys("India");
		address.getIndia().click();
		address.getState().sendKeys("Tamil Nadu");
		address.getTamilnadu().click();
		address.getCity().sendKeys("Chennai");
		address.getPincode().sendKeys("600078");
		address.getPhonenumber().sendKeys("9876543210");
		address.getAddresssumbit().click();
		driver.quit();
	}
	
	@Test 
	public void EditProfile() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("AddtheAddresses");
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(25000);
		
		WelcomePage4 welcomePage=new WelcomePage4(driver);
		welcomePage.getLoginLink().click();
		Thread.sleep(5000);
		
	    LoginP5 login=new LoginP5(driver);	
		login.getEmail().sendKeys("rekhasasi.sampath@gmail.com");
		login.getPassword().sendKeys("Password@123");
		//click on login button
		login.getLoginbutton().click();
		Thread.sleep(5000);
		
		EditProfile2 profile=new EditProfile2(driver);
		profile.getAccountsetting().click();
		profile.getMyprofile().click();
		Thread.sleep(7000);
		profile.getEditProfile().click();
		profile.getFirstname().clear();
		Thread.sleep(3000);
		
		profile.getFirstname().sendKeys("Sampath");
		profile.getLastname().clear();
		Thread.sleep(3000);
		
		profile.getLastname().sendKeys("Raja");
		profile.getDateofbirth().clear();
		Thread.sleep(3000);
		
		profile.getDateofbirth().sendKeys("17/10/1991");
		profile.getDateofbirth1().click();
		profile.getPhonenumber().clear();
		Thread.sleep(3000);
		
		profile.getPhonenumber().sendKeys("1234567890");
		profile.getCountry().clear();
		Thread.sleep(3000);
		
		profile.getCountry().sendKeys("India");
		profile.getCountry1().click();
		profile.getState().clear();
		Thread.sleep(3000);
		
		profile.getState().sendKeys("Tamil Nadu");
		profile.getState1().click();
		profile.getCity().clear();
		Thread.sleep(3000);
		
		profile.getCity().sendKeys("Chennai");
		profile.getCity1().click();
		profile.getSubmitbutton().click();
		driver.quit();
	}	
}
