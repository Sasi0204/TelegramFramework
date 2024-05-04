package AssignmentObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage4 {
	public WelcomePage4(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	@FindBy(id ="loginBtn")
	private WebElement loginLink;
	@FindBy(xpath ="//*[@id=\"Create Account\"]/span[1]")
	private WebElement createAccount;
	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getCreateAccount() {
		return createAccount;
	}
	
	
	
	

}
