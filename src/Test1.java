import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
//ygkbufyukfgkjbljkrgr1
	WebDriver driver = new EdgeDriver();
	String THEWEBSITE = "https://www.saucedemo.com/";

	String Username = "standard_user";
	String password = "secret_sauce";

	@BeforeTest
	public void mtSetup() {

		driver.manage().window().maximize();
		driver.get(THEWEBSITE);

	}

	@Test(priority = 1)
	public void addOneRandomItem() throws InterruptedException {
		WebElement UserNameInput = driver.findElement(By.id("user-name"));

		WebElement passwordInput = driver.findElement(By.id("password"));

		WebElement LoginButton = driver.findElement(By.id("login-button"));

		UserNameInput.sendKeys(Username);
		passwordInput.sendKeys(password);
		LoginButton.click();
		
		 WebElement BackPackAddButtom =
		 driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		 BackPackAddButtom.click();

	}

	@Test(priority = 2)
	public void removeItemFromTheCart() {
		WebElement BackPackRemoveButtom = driver.findElement(By.id("remove-sauce-labs-backpack"));
		BackPackRemoveButtom.click();

	}

	@Test(priority = 3)
	public void Logout() throws InterruptedException {
		WebElement BurgerMenuButtom = driver.findElement(By.id("react-burger-menu-btn"));
		BurgerMenuButtom.click();
		WebElement LogoutButton = driver.findElement(By.id("logout_sidebar_link"));
		LogoutButton.click();
	}

	@AfterTest
	public void myAftertest() {
		// driver.quit();
	}

}
