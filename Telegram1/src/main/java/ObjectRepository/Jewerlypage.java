package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jewerlypage {
	
		public Jewerlypage(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}
		
		@FindBy(linkText ="Jewelry")
		private WebElement jewerlylink;
		
		@FindBy(id ="products-orderby")
		private WebElement sortbydropdown;
		
		@FindBy(id ="products-pagesize")
		private WebElement Display;
		
		@FindBy(id ="products-viewmode")
		private WebElement Viewas;
		
		@FindBy(xpath ="//input[@class='button-2 product-box-add-to-cart-button']")
		private WebElement AddtoCart;

		public WebElement getAddtoCart() {
			return AddtoCart;
		}

		public WebElement getJewerlylink() {
			return jewerlylink;
		}

		public WebElement getSortbydropdown() {
			return sortbydropdown;
		}

		public WebElement getDisplay() {
			return Display;
		}

		public WebElement getViewas() {
			return Viewas;
		}
		
		
		
		
		
	}

