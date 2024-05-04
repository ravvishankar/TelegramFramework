package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	public homePage (WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	@FindBy (linkText = "BOOKS")
	private WebElement booksLink;
	
	@FindBy (linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy (linkText = "Register")
	private WebElement registerLink;
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}
	
	

}
