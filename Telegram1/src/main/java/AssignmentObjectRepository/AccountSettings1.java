package AssignmentObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettings1 {
	public AccountSettings1 (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section[1]/article/div[3]/div[1]/button/span[1]/span")
	private WebElement accountsetting;
	
	@FindBy(xpath = "//*[@id=\"account-menu\"]/div[3]/ul/li[1]")
	private WebElement myprofile;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section[2]/div/div/div[3]/a[2]/div")
	private WebElement myaddresses;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section[2]/div/section/div/div/a/button")
	private WebElement addaddress;
	
	@FindBy(id = "Home")
	private WebElement addresstype;
	
	@FindBy(id = "Name")
	private WebElement name;
	@FindBy(id = "House/Office Info")
	private WebElement houseinfo;
	@FindBy(id = "Street Info")
	private WebElement Streetinfo;
	@FindBy(id = "Landmark")
	private WebElement landmark;
	@FindBy(id = "Country")
	private WebElement country;
	
	@FindBy(id = "India")
	private WebElement India;
	@FindBy(id = "State")
	private WebElement state;
	@FindBy(id = "Tamil Nadu")
	private WebElement Tamilnadu ;
	@FindBy(id = "City")
	private WebElement city ;
	@FindBy(id = "Chennai")
	private WebElement chennai;
	
	@FindBy(id = "Pincode")
	private WebElement pincode;
	@FindBy(id = "Phone Number")
	private WebElement phonenumber;
	@FindBy(id = "addAddress")
	private WebElement Addresssumbit;
	public WebElement getAccountsetting() {
		return accountsetting;
	}
	public WebElement getMyprofile() {
		return myprofile;
	}
	public WebElement getMyaddresses() {
		return myaddresses;
	}
	public WebElement getAddaddress() {
		return addaddress;
	}
	public WebElement getAddresstype() {
		return addresstype;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getHouseinfo() {
		return houseinfo;
	}
	public WebElement getStreetinfo() {
		return Streetinfo;
	}
	public WebElement getLandmark() {
		return landmark;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getIndia() {
		return India;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getTamilnadu() {
		return Tamilnadu;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getChennai() {
		return chennai;
	}
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getPhonenumber() {
		return phonenumber;
	}
	public WebElement getAddresssumbit() {
		return Addresssumbit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
