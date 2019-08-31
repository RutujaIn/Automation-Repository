package fileHandling;

import java.io.IOException;

public class TextXls_Reader {

	public static void main(String[] args) throws IOException 
	{

		Xls_Reader xl = new Xls_Reader("D:\\Automation-Repository1\\BasicCoreJava\\src\\fileHandling\\TestData.xls");
		
		int rows=xl.getRowCount("Sheet1");
		int cols=xl.getColumnCount("Sheet1");
		System.out.println(rows);
		System.out.println(cols);
		
		System.out.println(xl.getCellData("Sheet1",1,1));
		
		for(int r=1; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				//System.out.println(xl.getCellData("Sheet1", r, c));
				System.out.print(xl.getCellData("Sheet1", r, c)+ " ");
			}
			
			System.out.println();
		}

		
	}
	
	
	
}
