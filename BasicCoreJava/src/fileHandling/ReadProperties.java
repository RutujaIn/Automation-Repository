package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException 
	{
      FileInputStream file = new FileInputStream("D:\\Automation-Repository1\\BasicCoreJava\\src\\fileHandling\\OR.properties");//objectRepo filePath
      
      Properties or = new Properties();
      
      or.load(file);
      
      System.out.println(or.getProperty("name"));

}

}