package AssignmentObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage3 {
	public LoginPage3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"Create Account\"]/span[1]")
	private WebElement createaccount;
	@FindBy(id = "First Name")
	private WebElement firstname;
	@FindBy(id = "Last Name")
	private WebElement lastname;
	@FindBy(id = "Male")
	private WebElement gender;
	@FindBy(id = "Phone Number")
	private WebElement phonenumber;
	@FindBy(id = "Email Address")
	private WebElement emailaddress;
	@FindBy(id = "Password")
	private WebElement password;
	@FindBy(id = "Confirm Password")
	private WebElement confirmpwd;
	@FindBy(id = "Terms and Conditions")
	private WebElement Iagree;
	@FindBy(id = "btnDisabled")
	private WebElement Register;
	
	

	public WebElement getCreateaccount() {
		return createaccount;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getPhonenumber() {
		return phonenumber;
	}

	public WebElement getEmailaddress() {
		return emailaddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpwd() {
		return confirmpwd;
	}

	public WebElement getIagree() {
		return Iagree;
	}

	public WebElement getRegister() {
		return Register;
	}

	

	
	
	
	

	
	
	
}
