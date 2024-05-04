package com.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElectronicsTest {
	
	@Test (groups = "smoke")//(priority = 0)
	public void register() {
		WebDriver driver=new ChromeDriver();
		System.out.println("smoke");
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();
	}
	
	@Test (groups = "regression")//(priority = 1)
	public void Login() {
		WebDriver driver=new ChromeDriver();
		System.out.println("regression");
		driver.quit();
	}
	
	@Test(groups = "Fi")//(priority = 2)
	public void Addtocart() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Fi");
		driver.quit();
	}
	@Test (groups = "system")//(priority = 3)
	public void Payment() {
		WebDriver driver=new ChromeDriver();
		System.out.println("system");
		driver.quit();
	}
	@Test(groups = "Fi")//(priority = 4)
	public void Confirmorder() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Fi");
		driver.quit();
	}
}