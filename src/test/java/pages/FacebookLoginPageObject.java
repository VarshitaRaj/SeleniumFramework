package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPageObject {
	WebDriver driver = null;
	
	By textbox_email = By.id("_R_c9l6neappb6amH1_");
	By textbox_password = By.name("pass");
	
	public  FacebookLoginPageObject (WebDriver driver) {
		this.driver = driver ;
	}


public void setTextInEmail (String Email) {
	driver.findElement(textbox_email).sendKeys(Email);;
	
}

public void setTextInPassword(String Password) {
	driver.findElement(textbox_password).sendKeys(Password);
}

}
