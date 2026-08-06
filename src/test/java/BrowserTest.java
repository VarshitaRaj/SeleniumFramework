import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com/");
        Thread.sleep(3000);
        driver.close();
        
		//driver.quit();
        
      //  String projectpath = System.getProperty("User.dir");
       // System.out.println (projectpath);
       // System.setProperty("Webdriver.chrome.driver", projectpath+ "Location of driver"); // which we can keep in the project itself by creating a separate folder and keep the executable file inside
	
	}

}
