import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {

	
	WebDriver driver = new EdgeDriver();
	String THEWEBSITE = "https://www.saucedemo.com/";
	
	String Username = "standard_user";
	String password = "secret_sauce";

	@BeforeTest
	public void mtSetup() {
		driver.manage().window().maximize();
		driver.get(THEWEBSITE);

	}
	@Test
	public void addOneRandomItem() throws InterruptedException {
		WebElement UserNameInput = driver.findElement(By.id("user-name"));

		WebElement passwordInput = driver.findElement(By.id("password"));

		WebElement LoginButton = driver.findElement(By.id("login-button"));

		UserNameInput.sendKeys(Username);
		passwordInput.sendKeys(password);
		LoginButton.click();
		
		 List<WebElement> AddToCartButton = driver.findElements(By.className("btn"));
		 for(int i =0;i<AddToCartButton.size();i++) {
			 AddToCartButton.get(i).click();
			 Thread.sleep(2000);
			 
		 }
		 List<WebElement>RemoveToCartButton = driver.findElements(By.className("btn"));
		 for(int i=0;i<RemoveToCartButton.size();i++) {
			 RemoveToCartButton.get(i).click();
		 }
	}
	
}
