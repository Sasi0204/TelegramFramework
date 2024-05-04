package AssignmentObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfile2 {
	public EditProfile2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section[1]/article/div[3]/div[1]/button/span[1]/span")
	private WebElement accountsetting;
	
	@FindBy(xpath = "//*[@id=\"account-menu\"]/div[3]/ul/li[1]")
	private WebElement myprofile;
	
	@FindBy(xpath= "//*[@id=\"root\"]/section[2]/div/section/section/div[1]/button")
	private WebElement EditProfile;
	
	@FindBy(id = "First Name")
	private WebElement Firstname;
	
	@FindBy(id = "Last Name")
	private WebElement Lastname;
	@FindBy(id = ":rd:")
	private WebElement Dateofbirth;
	@FindBy(xpath = "/html/body/div[3]/div[3]/div/form/div[2]/div[3]/div/div/div/button/svg")
	private WebElement Dateofbirth1;
	@FindBy(id = "Phone Number")
	private WebElement Phonenumber;
	@FindBy(id = "Country")
	private WebElement Country;
	@FindBy(id = "India")
	private WebElement Country1;
	@FindBy(id = "State")
	private WebElement State;
	@FindBy(id = "Tamil Nadu")
	private WebElement State1;
	@FindBy(id = "City")
	private WebElement City;
	@FindBy(id = "Chennai")
	private WebElement City1;
	@FindBy(id = "submit")
	private WebElement Submitbutton;
	public WebElement getAccountsetting() {
		return accountsetting;
	}
	public WebElement getMyprofile() {
		return myprofile;
	}
	public WebElement getEditProfile() {
		return EditProfile;
	}
	public WebElement getFirstname() {
		return Firstname;
	}
	public WebElement getLastname() {
		return Lastname;
	}
	public WebElement getDateofbirth() {
		return Dateofbirth;
	}
	public WebElement getDateofbirth1() {
		return Dateofbirth1;
	}
	public WebElement getPhonenumber() {
		return Phonenumber;
	}
	public WebElement getCountry() {
		return Country;
	}
	public WebElement getCountry1() {
		return Country1;
	}
	public WebElement getState() {
		return State;
	}
	public WebElement getState1() {
		return State1;
	}
	public WebElement getCity() {
		return City;
	}
	public WebElement getCity1() {
		return City1;
	}
	public WebElement getSubmitbutton() {
		return Submitbutton;
	}
	
	
	
}
