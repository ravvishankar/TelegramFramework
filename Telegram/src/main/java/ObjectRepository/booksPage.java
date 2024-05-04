package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class booksPage {
	public booksPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//div[@class='page-title']/h1")
	private WebElement PageTitle;
	public WebElement getPageTitle() {
		return PageTitle;
	}
	

}
