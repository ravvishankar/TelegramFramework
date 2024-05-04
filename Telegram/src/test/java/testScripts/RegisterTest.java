package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {

@Test (groups = "smoke")//(invocationCount = 3,threadPoolSize = 2, enabled = true)//(priority = 0)
public void register() throws InterruptedException {
 WebDriver driver = new ChromeDriver();
 System.out.println("Registration Successfull-smoke");
 Thread.sleep(5000);
// driver.get("ggggg");
 driver.quit();
}

@Test (groups = {"smoke","regression"})//(dependsOnMethods = "register")//(priority = 1)
public void login() {
	 WebDriver driver = new ChromeDriver();
	 System.out.println("login Successfull-smoke,regression");
	 driver.quit();
}

@Test (groups = "integration")//(dependsOnMethods = "login")//(priority = 2)
public void addtocart() {
	 WebDriver driver = new ChromeDriver();
	 System.out.println("addtocart-integration");
	 driver.quit();
}

@Test (groups = "system")//(dependsOnMethods = "addtocart")//(priority = 3)
public void payment() {
	 WebDriver driver = new ChromeDriver();
	 System.out.println("payment Done-system");
	 driver.quit();
}

@Test (groups = "smoke")//(dependsOnMethods = "payment")//(priority = 4)
public void confirm() {
	 WebDriver driver = new ChromeDriver();
	 System.out.println("confirm-smoke");
	 driver.quit();
}
	
}

