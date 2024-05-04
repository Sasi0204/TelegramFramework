package AssignmentObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage1 {
	public RegisterPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-male")
	private WebElement maleGenderButton;
	
	@FindBy(id = "gender-female")
	private WebElement femaleGenderButton;
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;

	@FindBy(id = "LastName")
	private WebElement lastnameTextField;
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordtextField;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement cpwdTextField;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordtextField() {
		return passwordtextField;
	}

	public WebElement getCpwdTextField() {
		return cpwdTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getMaleGenderButton() {
		return maleGenderButton;
	}

	public WebElement getFemaleGenderButton() {
		return femaleGenderButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;

}

}
