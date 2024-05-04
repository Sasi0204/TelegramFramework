package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	public Loginpage1(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(id="Email")
	private WebElement emailTf;
	
	@FindBy(id="Password")
	private WebElement passwordTf;
	
	public WebElement getEmailTf() {
		return emailTf;
	}

	public WebElement getPasswordTf() {
		return passwordTf;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginbutton;
	
	

}
