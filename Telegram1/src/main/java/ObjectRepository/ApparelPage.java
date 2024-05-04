package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelPage {
	public ApparelPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath ="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[1]/h1")
	private WebElement pagetitle;

	public WebElement getPagetitle() {
		return pagetitle;
	}
	
	

}
