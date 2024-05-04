package com.TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ObjectRepository.BooksPage;
import ObjectRepository.WelcomePage;

public class BookTest {
	
	@Test(groups = "Regression")
	
	public void Book_001() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcomepage=new WelcomePage(driver);
		BooksPage bookspage=new BooksPage(driver);
		//click on Books link
		welcomepage.getBooksLink().click();
		
		String actualresult= bookspage.getBooks().getText();
		//HardAssert
		//Assert.assertEquals(actualresult, "Books");

		//softAssert
		SoftAssert soft=new SoftAssert();
		//soft.assertEquals(actualresult, "Computers");
		//soft.assertEquals(bookPage.getBookslist().isDisplayed());

		soft.fail();

		soft.assertTrue(bookspage.getBooks().isDisplayed());
		//soft.assertFalse(bookPage.getBookslist().isDisplayed());
		driver.quit();
		System.out.println("Test Case Completed");
		soft.assertAll();
		
		
		//verify books is displayed
		if(bookspage.getBooks().getText().equals("Books")) 
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		driver.quit();
		}
	}


