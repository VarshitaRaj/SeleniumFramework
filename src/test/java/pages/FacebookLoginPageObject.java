package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPageObject {
	WebDriver driver = null;
	
	By textbox_email = By.id("_R_1h6kqsqppb6amH1_");
	By textbox_password = By.id("_R_1hmkqsqppb6amH1_");
	
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
