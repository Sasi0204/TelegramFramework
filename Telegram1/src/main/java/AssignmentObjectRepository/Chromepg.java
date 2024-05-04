package AssignmentObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chromepg {
	public Chromepg  (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "www.google.com")
	private WebElement Browser;
	
	@FindBy(name = "https://www.shoppersstack.com/")
	private WebElement URL;

	public WebElement getBrowser() {
		return Browser;
	}

	public WebElement getURL() {
		return URL;
	}
	
	
}
