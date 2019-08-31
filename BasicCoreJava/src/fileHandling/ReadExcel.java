package fileHandling;

import java.io.FileInputStream;//creating object of class from outside package
import java.io.FileNotFoundException;//throw exception
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception  {
		
		String path = "D:\\Automation-Repository1\\BasicCoreJava\\src\\fileHandling\\TestData.xls";
		
		FileInputStream file = new FileInputStream(path);//checked exception - file not found //Constructor
		
		HSSFWorkbook wb = new HSSFWorkbook(file);//IO exception - ParentClass of fileNotfound exception
		
		HSSFSheet sheet = wb.getSheet("Sheet1");

		HSSFRow row= sheet.getRow(0);
		
		HSSFCell cell = row.getCell(0);
		
		String data=cell.getStringCellValue();
		
		System.out.println(data);
		
		//Thread.sleep(3000);//Interrupt exception
		
		//throw new Exception("Testing");//Exception - Superclass of all exceptions
		
		//Testing obj = new Testing();//no error if class has exception at main method
		                              //error when  exception at constructor
		//ReadExcel ab=test();

	}
	

	public static ReadExcel test() //ReadExcel -> return type
	{
		return new ReadExcel();
	}
	
	/*public static int sum(int a,int b) //ReadExcel -> return type
	{
	   int sum = a + b;
		return int();
	}*/

}
