package genericLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ObjectRepository.homePage;
import ObjectRepository.loginPage;
import ObjectRepository.logoutPage;
import fileUtility.UtilityMethods;

public class baseClass extends UtilityMethods{
   public WebDriver driver;
	@BeforeClass

	public void launchbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	@BeforeMethod
	
	public void login () {
		homePage hp = new homePage(driver);
		loginPage login = new loginPage(driver);
		hp.getLoginLink().click();
		login.getEmailTextfield().sendKeys("ravishankar1001@gmail.com");
		login.getPwdTextfield().sendKeys("ravi@1234");
		login.getLoginButton().click();	
	}
	
	@AfterMethod
	
	public void logout () {
		logoutPage logout = new logoutPage(driver);
		logout.getLogoutLink().click();	
	}
	
	@AfterClass
	
	public void closeBrowser() {
		driver.quit();
	}
	
}
