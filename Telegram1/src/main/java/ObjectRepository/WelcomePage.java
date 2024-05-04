package ObjectRepository;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class WelcomePage {

		public WelcomePage(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}
		
		@FindBy(linkText ="Books")
		private WebElement booksLink;
		
		@FindBy(linkText ="Log in")
		private WebElement LoginLink;
		
		@FindBy(id ="Email")
		private WebElement emailTF;
		
		@FindBy(id ="Password")
		private WebElement passwordTF;
		
		@FindBy(linkText ="Log out")
		private WebElement logoutlink;
		
		@FindBy(linkText ="Electronics")
		private WebElement electronicslink;
		
		@FindBy(linkText ="Jewelry")
		private WebElement jewelrylink;
		
        
		@FindBy(linkText ="Apparel & Shoes")
		private WebElement apparellink;
		
		
		public WebElement getApparellink() {
			return apparellink;
		}

		@FindBy(linkText ="Gift Cards")
		private WebElement giftcardlink;

		public WebElement getBooksLink() {
			return booksLink;
		}

		public WebElement getLoginLink() {
			return LoginLink;
		}

		public WebElement getEmailTF() {
			return emailTF;
		}

		public WebElement getPasswordTF() {
			return passwordTF;
		}

		public WebElement getLogoutlink() {
			return logoutlink;
		}

		public WebElement getElectronicslink() {
			return electronicslink;
		}

		public WebElement getJewelrylink() {
			return jewelrylink;
		}

		public WebElement getGiftcardlink() {
			return giftcardlink;
		}
		
		
		
		
		
		
		

}
