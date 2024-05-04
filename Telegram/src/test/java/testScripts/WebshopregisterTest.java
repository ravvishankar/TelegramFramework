package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ObjectRepository.homePage;
import ObjectRepository.registerPage;

public class WebshopregisterTest {
	@Test
	public void register() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePage hp = new homePage(driver);
		hp.getRegisterLink().click();
		registerPage rp = new registerPage(driver);
		rp.getGenderButton().click();
		rp.getFirstnameTextfield().sendKeys("Ravi");
		rp.getLastnameTextfield().sendKeys("Shankar");
		rp.getEmailTextfield().sendKeys("ravishankar1001@gmail.com");
		rp.getPwdTextfield().sendKeys("ravi@1234");
		rp.getConfirmpwdTextfield().sendKeys("ravi@1234");
		rp.getRegisterButton().click();
		Thread.sleep(2000);
	}

}
