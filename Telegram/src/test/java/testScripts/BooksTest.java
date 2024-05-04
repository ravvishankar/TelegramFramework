package testScripts;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ObjectRepository.booksPage;
import ObjectRepository.homePage;
import genericLibrary.baseClass;

public class BooksTest extends baseClass{
	@Test //(groups = "ft")
	public void books_001() throws InterruptedException {
		homePage hp = new homePage(driver);
		booksPage bp = new booksPage(driver);
		hp.getBooksLink().click();
		String actualresult = bp.getPageTitle().getText();
		//Hard assert
		Assert.assertEquals(actualresult, "Books");
		/*if(bp.getPageTitle().getText().equals("Books")) {
		System.out.println("Test case pass");
		}
		else
			System.out.println("Test case fail");*/
		
		//Soft Assert
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualresult, "Computers");
		Thread.sleep(3000);
		soft.assertAll();
				
	}
}

