package AssignmentObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtheAddresses1 {
	public AddtheAddresses1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[3]/a")
	private WebElement  addresses;

	@FindBy(id = "Address_FirstName")
	private WebElement firstnametextfield;
	
	@FindBy(id = "Address_LastName")
	private WebElement lastnametextfield;
	
	@FindBy(id = "Address_Email")
	private WebElement emailtextfield;
	
	@FindBy(id = "Address_CountryId")
	private WebElement SelectDropDown;
	
	@FindBy(xpath="//*[@id=\"Address_CountryId\"]/option[99]")
	private WebElement selectingCountry;
	
	@FindBy(id = "Address_City")
	private WebElement city;
	
	@FindBy(id = "Address_Address1")
	private WebElement Address1;
	
	@FindBy(id = "Address_Address2")
	private WebElement Address2;
	
	@FindBy(id = "Address_ZipPostalCode")
	private WebElement Zipcode;
	
	@FindBy(id = "Address_PhoneNumber")
	private WebElement phonenumber ;
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement savebutton ;

	public WebElement getAddresses() {
		return addresses;
	}

	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}

	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getSelectDropDown() {
		return SelectDropDown;
	}

	public WebElement getSelectingCountry() {
		return selectingCountry;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress1() {
		return Address1;
	}

	public WebElement getAddress2() {
		return Address2;
	}

	public WebElement getZipcode() {
		return Zipcode;
	}

	public WebElement getPhonenumber() {
		return phonenumber;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	
	
	
	
	
	
	
	
}
