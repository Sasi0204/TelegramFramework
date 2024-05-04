package com.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElectronicsTest1 {
	@Test (groups = "smoke")//(invocationCount = 3,threadPoolSize = 4,enabled = true)//(priority = 0)
	public void register() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.out.println("smoke");
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test(groups = "fi")//(dependsOnMethods = "register") //(priority = 1)
	public void Login() {
		WebDriver driver=new ChromeDriver();
		System.out.println("fi");
		driver.quit();
	}
	
	@Test (groups = "system")//(dependsOnMethods = "Login")//(priority = 2)
	public void Addtocart() {
		WebDriver driver=new ChromeDriver();
		System.out.println("system");
		driver.quit();
	}
	@Test(groups = "smoke")// (dependsOnMethods = "Addtocart")//(priority = 3)
	public void Payment() {
		WebDriver driver=new ChromeDriver();
		System.out.println("smoke");
		driver.quit();
	}
	@Test (groups = "fi")//(dependsOnMethods = "Payment")//(priority = 4)
	public void Confirmorder() {
		WebDriver driver=new ChromeDriver();
		System.out.println("fi");
		driver.quit();
	}

}
