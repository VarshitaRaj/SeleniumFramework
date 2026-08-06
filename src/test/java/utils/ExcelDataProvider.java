package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	WebDriver  driver = null;
	@BeforeTest
	public void setUpTest() {
		driver = new ChromeDriver();
		System.out.println("This is Before Test Block");
	}	
	
	
	@Test (dataProvider= "Test1 data")
	public void test1 (String Username, String Password, String EmailId){
		System.out.println(Username + "\t" + Password + "\t"+  EmailId);

	}

	@DataProvider(name = "Test1 data")
	public Object[][] getData() {
		String projectpath = System.getProperty("user.dir");
		String excelPath = projectpath + "/excel/data.xlsx";
		Object data[][]=Testdata (excelPath, "Login" );
		return data;

	}

	public  Object[][] Testdata(String excelPath, String sheetName) {

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColumnCount();


		for (int i = 1; i < rowCount; i++) {

			for (int j = 0; j < colCount; j++) {

				String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData + "  |  ");


			}

			//System.out.println();
		}
		//two dimensional 
		Object data [][] = new Object[rowCount][colCount];
		for (int i = 1; i < rowCount; i++) {

			for (int j = 0; j < colCount; j++) {

				String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData + "  \t ");
				data[i-1][j]=cellData;

			}

			//System.out.println();
		}
		return data;

	} }

