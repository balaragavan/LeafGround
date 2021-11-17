package testleaf1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertsExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click the button to display a alert box.

		WebElement AlertBox = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		AlertBox.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		//Click the button to display a confirm box.
		WebElement ConfirmBox = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		ConfirmBox.click();
	
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.dismiss();
		//alert2.accept();
		
		//Click the button to display a prompt box.
        WebElement Promptbox = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
        Promptbox.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("bala");
		alert3.accept();
		
		//just print-You should not have enjoyed learning at bala as compared to TestLeaf! Right?
		WebElement ok = driver.findElement(By.id("result1"));
		String text = ok.getText();
		System.out.println(text);
		
		//Click the button to learn line-breaks in an alert.

		WebElement linebreaks = driver.findElement(By.xpath("//button[text()='Line Breaks?']"));
		linebreaks.click();
		Alert alert4 = driver.switchTo().alert();
		String text2 = alert4.getText();
		System.out.println(text2);
		alert4.accept();
		
		
		//Click the below button and click OK.
		WebElement Sweetalertbutton = driver.findElement(By.id("btn"));
		Sweetalertbutton.click();
		
		String text3 = driver.findElement(By.xpath("//div[text()='Happy Coding!']")).getText();
		System.out.println(text3);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		
		
		
		
		
		

		
		

        
        

		
		
		
		

	}

}
