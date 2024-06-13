package excelUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead 
{
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	static String project= System.getProperty("user.dir");
	
 public static String getStringData(int a, int b) throws IOException
 {
	

	f=new FileInputStream(project+"src\\main\\resources\\Excel File\\AppCredentials.xlsx");
	 w=new XSSFWorkbook(f);
	 s=w.getSheet("Sheet1");
	 Row r=s.getRow(a);
	 Cell c=r.getCell(b);
	 return c.getStringCellValue();
 }
 public static String getIntegerData(int a, int b) throws IOException
 {
	 f=new FileInputStream("D:\\Workspace\\Excelread\\Excelread.xlsx");
	 w=new XSSFWorkbook(f);
	 s=w.getSheet("Sheet1");
	 Row r=s.getRow(a);
	 Cell c=r.getCell(b);
	 int x=(int)c.getNumericCellValue();// Converting String to Integer
	 return String.valueOf(x);
 }

 
}