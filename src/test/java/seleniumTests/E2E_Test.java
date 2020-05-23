package seleniumTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E_Test {
	
	private static WebDriver driver;
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Libs\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 driver.get("http://www.shop.demoqa.com");
		 
		 driver.navigate().to("http://shop.demoqa.com/?s=" + "dress" + "&post_type=product");
		 
		 List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
		 items.get(0).click();		 
		 
		 
		 driver.quit();
		 
		 
		
		
		
		

	}

}
