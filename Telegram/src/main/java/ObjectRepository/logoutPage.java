package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutPage {
	public logoutPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//a[@class='ico-logout']")
	private WebElement logoutLink;
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	

}
