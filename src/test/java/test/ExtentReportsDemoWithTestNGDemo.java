package test;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.FacebookLoginPage;

public class ExtentReportsDemoWithTestNGDemo {
	ExtentSparkReporter spark;
	ExtentReports extent;
	WebDriver driver;
	ExtentTest test;
	
		@BeforeSuite
		public void setupReport() {
		    spark = new ExtentSparkReporter("ExtentReports.html");
		    extent = new ExtentReports();
		    extent.attachReporter(spark);
		}

		@BeforeMethod
		public void setupBrowser() {
		    driver = new ChromeDriver();
		}

	
	@Test
	public void test1() {	
		    test = extent.createTest("facebookLoginTest1", "Facebook login test validation");
	       
	        test.log(Status.INFO, "Starting my Testcases)");
	        driver.get("https://facebook.com/");
	        test.pass("Navigated to FacebookLogin Page");
	        FacebookLoginPage.textbox_email(driver).sendKeys("Abc@gmail.com");
	        test.pass("emailId entered");
	        FacebookLoginPage.textbox_password(driver).sendKeys("Test123");
	        test.pass("Password entered");
	        test.fail("details" , MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
	}
	        @Test
	        public void test2() {
	        	
			    test = extent.createTest("facebookLoginTest2", "Facebook login test validation");
		        test.log(Status.INFO, "Starting my Testcases)");
		        driver.get("https://facebook.com/");
		        test.pass("Navigated to FacebookLogin Page");
		        FacebookLoginPage.textbox_email(driver).sendKeys("Abcd@gmail.com");
		        test.pass("emailId entered");
		        FacebookLoginPage.textbox_password(driver).sendKeys("Test123");
		        test.fail("Password entered");
		        test.pass("details" , MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		         //test with snapshot
		        test.addScreenCaptureFromPath("screenshot.png");
	        
	}
	        
	     
			@AfterMethod
	        public void closeBrowser() {
	            if (driver != null) {
	                driver.quit();
	            }
	        }

	        @AfterSuite
	        public void flushReport() {
	            extent.flush();
	        }
	        
	        
}
