package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.FacebookLoginPage;

public class ExtentreportBasicDemo {

	public static void main(String[] args) {
		
		// start reporters
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReports.html");
        
        // create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("facebookLoginTest", "Facebook login test validation");
        WebDriver driver = new ChromeDriver(); 
        test.log(Status.INFO, "Starting my Testcases)");
        driver.get("https://facebook.com/");
        test.pass("Navigated to FacebookLogin Page");
        FacebookLoginPage.textbox_email(driver).sendKeys("Abc@gmail.com");
        test.pass("emailId entered");
        FacebookLoginPage.textbox_password(driver).sendKeys("Test123");
        test.pass("Password entered");
        System.out.println("Test Completed");
        //driver.close();
       // driver.quit();
        test.pass("driver close");
        
        ExtentTest test1 = extent.createTest("facebookLoginTest1", "Facebook login test validation1");
        driver.get("https://facebook.com/");
        test1.pass("Navigated to FacebookLogin Page");
        FacebookLoginPage.textbox_email(driver).sendKeys("Abc@gmail.com");
        test1.pass("emailId entered");
        FacebookLoginPage.textbox_password(driver).sendKeys("Test123");
        test1.fail("Password entered");
        System.out.println("Test Completed");
        test1.info("Test Completed");
        driver.close();
        driver.quit();
        test1.pass("driver close");
		
		
   		 
        // log(Status, details)
        test.log(Status.INFO, "This step shows the test is completed)");

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
       // test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
       // test.addScreenCaptureFromPath("screenshot.png");
        
        // calling flush writes everything to the log file
        extent.flush();
    }
	}

