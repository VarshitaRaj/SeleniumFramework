package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
	
public static void test () {
	WebDriver driver =  new ChromeDriver();
	driver.get("http://www.tinyupload.com");
	driver.findElement(By.name("Name")).click();
	driver.findElement(By.cssSelector("input[type='file']"))
    .sendKeys("/Users/yourname/Documents/sample.pdf");
	
}

}
