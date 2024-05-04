package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage {
	
	public registerPage (WebDriver driver) {
	PageFactory.initElements(driver, this);
    }
	
	@FindBy (id = "gender-male")
	private WebElement genderButton;
	
	@FindBy(id = "FirstName")
	private WebElement firstnameTextfield;
	
	@FindBy(id = "LastName")
	private WebElement lastnameTextfield;
	
	@FindBy (id = "Email")
	private WebElement emailTextfield;
	
	@FindBy (id = "Password")
	private WebElement pwdTextfield;
	
	@FindBy (id = "ConfirmPassword")
	private WebElement confirmpwdTextfield;
	
	@FindBy (id = "register-button")
	private WebElement registerButton;
	
	@FindBy (xpath = "(//div[@class='page registration-result-page']/div/div)[1]")
	private WebElement registrationSuccess;
	
	@FindBy (xpath = "//li[contains(.,'The specified email already exists')]")
    private WebElement emailAlreadyexist;
	
	public WebElement getEmailAlreadyexist() {
		return emailAlreadyexist;
	}

	public WebElement getRegistrationSuccess() {
		return registrationSuccess;
	}

	public WebElement getGenderButton() {
		return genderButton;
	}

	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}

	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getPwdTextfield() {
		return pwdTextfield;
	}

	public WebElement getConfirmpwdTextfield() {
		return confirmpwdTextfield;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	


}
