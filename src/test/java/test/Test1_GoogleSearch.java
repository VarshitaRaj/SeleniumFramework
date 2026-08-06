package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		googleSearch();
	}

	public static void googleSearch() throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		WebElement Text = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		Text.sendKeys("Automation step by step");
		Thread.sleep(3000);
		WebElement Btn = driver
				.findElement(By.xpath("/html/body/div[2]/div[6]/form/div[1]/div/div[4]/center/input[1]"));

		// press enterkey to see the button
		
		Btn.sendKeys(Keys.RETURN);
		Btn.click();
		driver.close();
		System.out.println("Test Completed Successfully");
	}

}
