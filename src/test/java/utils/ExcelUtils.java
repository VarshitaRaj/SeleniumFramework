package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelUtils {
	static String projectpath ;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName){
		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook (excelPath);
			sheet = workbook.getSheet(sheetName);
		}
		catch (IOException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}}
	public static void main(String[] args) {
		getRowCount();
		getColumnCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	// using constructor instead of hardcoding here we put everything in the constructor

	public static int getRowCount() {
		int rowCount =0;

		rowCount = sheet.getPhysicalNumberOfRows();
		//System.out.println("number of rows" + rowCount);
		return rowCount;

	}
	public static int getColumnCount() {
		int ColCount =0;
		ColCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("number of Columns" + ColCount);
		return ColCount;

	}
	
	

	public static String getCellDataString(int rowNum, int colNum) {

	   DataFormatter formatter = new DataFormatter();

	   XSSFCell cell = sheet.getRow(rowNum).getCell(colNum);

	   return formatter.formatCellValue(cell);
	}
	public static void getCellDataNumber(int rowNum , int colNum) {
		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook (projectpath + "/excel/data.xlsx");
			sheet = workbook.getSheet("Login");
			double cellData= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println("Data from cell1" + "" + cellData);

		}
		catch (IOException exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
		
		
	}}
