package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {


	public static void main(String[] args) {
		test();
	}

	public static void test() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		System.out.println(options.getBrowserName());
		System.out.println (options.addArguments("window-size = 1200,800"));
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://facebook.com");

		System.out.println(driver.getTitle());
	    driver.findElement(By.name("email")).sendKeys("ABC@gmail.com");
	    System.out.println("Email entered into the feild");
		driver.findElement(By.name("pass")).sendKeys("password123");
		System.out.println("Password Entered into the field:");
		driver.findElement(By.id("login_form")).click();
		driver.quit();
		System.out.println("Completed");
	}
}




