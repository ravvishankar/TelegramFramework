package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	public loginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id = "Email")
	private WebElement emailTextfield;
	
	@FindBy (id = "Password")
	private WebElement pwdTextfield;
	
	@FindBy (className = "login-button")
	private WebElement loginButton;

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getPwdTextfield() {
		return pwdTextfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	

}
