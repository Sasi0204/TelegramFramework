package AssignmentObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginP5 {
	public  LoginP5(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement Email;
	@FindBy(id = "Password")
	private WebElement password ;
	@FindBy(xpath = "//*[@id=\"Login\"]/span[1]")
	private WebElement loginbutton ;
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	

}
