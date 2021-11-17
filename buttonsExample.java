package testleaf1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class buttonsExample {

	

	public static void main(String[] args) {
		//open chrome browser
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//maximize the browser
		driver.manage().window().maximize();
		//implici wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Click button to travel home page
		WebElement homepage = driver.findElement(By.xpath("//button[text()='Go to Home Page']"));
		homepage.click();
		
		driver.navigate().back();
		
		//Find position of button (x,y)
		
		WebElement positionbutton = driver.findElement(By.id("position"));
		Point xyposition = positionbutton.getLocation();
		int xvalue = xyposition.getX();
		int yvalue=xyposition.getY();
		System.out.println(xvalue);
		System.out.println(yvalue);
		
		//Find button color
		
		WebElement buttoncolor = driver.findElement(By.id("color"));
		String cssValue = buttoncolor.getCssValue("background-color");
		System.out.println(cssValue);
		
		//Find the height and width
       WebElement heightandwidth = driver.findElement(By.id("size"));
       int height = heightandwidth.getSize().getHeight();
       int width = heightandwidth.getSize().getWidth();
       System.out.println(height);
       System.out.println(width);
		
		

		
	}

}
