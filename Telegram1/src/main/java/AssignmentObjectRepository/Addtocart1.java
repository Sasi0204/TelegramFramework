package AssignmentObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart1 {
	public Addtocart1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//*[@id=\"women\"]")
	private WebElement women;
	@FindBy(id= "searchBtn")
	private WebElement search;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[1]/span[1]")
	private WebElement Sleeves;
	@FindBy(xpath = "//*[@id=\"Add To Cart\"]/span")
	private WebElement Addtocart;
	public WebElement getWomen() {
		return women;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getSleeves() {
		return Sleeves;
	}
	public WebElement getAddtocart() {
		return Addtocart;
	}
	
}
