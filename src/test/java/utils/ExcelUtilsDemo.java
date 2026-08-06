package utils;

public class ExcelUtilsDemo {
	public static void main(String[] args) 
	{
		String projectpath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectpath + "/excel/data.xlsx", "Login");
		int excel1 = excel.getRowCount();
		System.out.println(excel1);
	}

}
