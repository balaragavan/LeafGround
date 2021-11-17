package testleaf1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class textboxexample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();

		// Enter your email address

		WebElement Emailaddress = driver.findElement(By.id("email"));
		Emailaddress.sendKeys("Balaragavancse@gmail.com");

		// Append a text and press keyboard tab

		WebElement Append = driver.findElement(By.xpath("//input[@value='Append ']"));
		Append.sendKeys("bala");

		// Get default text entered
		WebElement getdefaulttextentered = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
		String attribute = getdefaulttextentered.getAttribute("value");
		System.out.println(attribute);

		// Clear the text
		WebElement clearthetext = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		clearthetext.clear();
		
        // confirm that editbox is diabled
		
		WebElement editboxdisabled = driver.findElement(By.xpath("//input[@disabled='true']"));
		boolean enabled = editboxdisabled.isEnabled();
		System.out.println(enabled);
		
	}

}
