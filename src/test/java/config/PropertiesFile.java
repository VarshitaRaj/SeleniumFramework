package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import test.TestNGDemo3;

import java.io.InputStream;
import java.io.OutputStream;

public class PropertiesFile {
	static Properties prop = new Properties();
	static String  projectPath = System.getProperty("user.dir");

	public static void main(String[] args) throws IOException {
		getProperties();
		setProperties();
		getProperties();
	}
	public static void getProperties() {
		try {
			InputStream input = new FileInputStream(projectPath +"/src/test/java/config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			TestNGDemo3.browserName = browser;

		}
		catch (Exception exp){
			System.out.println("Message :" + exp.getMessage());
			System.out.println ("Message : " + exp.getCause());
			exp.printStackTrace();

		}}
	public static void setProperties() throws IOException {
		try {
			OutputStream output = new FileOutputStream(projectPath +"/src/test/java/config/config.properties");
			prop.setProperty("browser","chrome");
			prop.setProperty("result" , "pass");
			prop.store(output, null);

		} catch (FileNotFoundException exp) {
			System.out.println("Message :" + exp.getMessage());
			System.out.println ("Message : " + exp.getCause());
			exp.printStackTrace();
		
		}

		
	}

}
