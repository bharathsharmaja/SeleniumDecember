package util;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LearnExcel {
	
	@Test
	public void readExcel() throws InvalidFormatException, IOException {
		
		File src = new File("./inputData/login.xlsx");
		XSSFWorkbook wBook = new XSSFWorkbook(src);
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(rowCount);
		System.out.println(columnCount);
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
					XSSFCell cell = row.getCell(j);
					String cellValue = cell.getStringCellValue();
					System.out.println(cellValue);
			}			
		}
		wBook.close();
		
		
		
		
		
		
		
		
	}
	

}