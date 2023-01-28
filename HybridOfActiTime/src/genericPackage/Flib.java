package genericPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	public String readexaldata(String sheetpath, String sheetname, int rowCount, int cellCount)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(sheetpath);//for exel relative path 
		Workbook wb = WorkbookFactory.create(fis); //for methhod call ststic call
		Sheet sheet = wb.getSheet(sheetname);

		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);

	     String data = cell.getStringCellValue();//to print the string value inside the cellcount

		return data;  //returning value is string
	}

	public int rowCount(String sheetPath, String sheetName) throws IOException    {
		FileInputStream fis = new FileInputStream(sheetPath);
		    Workbook wb = WorkbookFactory.create(fis);
		//Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc; //returning value is mandatory 

	}

	public String writeData(String sheetpath, String sheetname, int rowcount, int cellcount,String data) throws EncryptedDocumentException, IOException
		  {
		FileInputStream fis = new FileInputStream(sheetpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		
		
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(sheetpath);
		wb.write(fos);
		
		return data;
		
		
	}
	public String readPropertyData(String path,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		
		Properties prop = new Properties();
		
		 prop.load(fis);
		 
		 String data = prop.getProperty(key);
		 
		// System.out.println(data);
		return data;
		
		
	}


}
