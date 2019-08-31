package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SetDataInExcel {

	public static void main(String[] args) throws IOException {

        String path = "D:\\Automation-Repository1\\BasicCoreJava\\src\\fileHandling\\TestData.xls";
		
		FileInputStream file = new FileInputStream(path);//checked exception - file not found //Constructor
		
		HSSFWorkbook wb = new HSSFWorkbook(file);//IO exception - ParentClass of fileNotfound exception
		
		HSSFSheet sheet = wb.getSheet("Sheet1");

		HSSFRow row= sheet.getRow(0);
		
		HSSFCell cell = row.getCell(0);
		
		cell.setCellValue("anand");
		
		FileOutputStream fileOut = new FileOutputStream(path);
		
		wb.write(fileOut);
	}

}
