import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com/");
	//WebElement Email = driver.findElement(By.xpath("//*[@id=\"_R_1h6kqsqppb6amH1_\"]"));
	//WebElement Email = driver.findElement(By.name("email"));
	WebElement Email = driver.findElement(By.xpath("//input[@name='email']")); // creating own xpath
	Email.sendKeys("Abc@gmail.com");
	List<WebElement> ListofInput = driver.findElements(By.xpath("//Input"));
	int count = ListofInput.size();
	System.out.println("Count of input elements: "+ count);
	Thread.sleep(3000);
	
	driver.close();
	
	
		
		
		
	}

}
