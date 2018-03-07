package util;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputProvider {	
	
	public String[][] getData(String fileName) throws InvalidFormatException, IOException {
		
		File src = new File("./inputData/"+fileName+".xlsx");
		XSSFWorkbook wBook = new XSSFWorkbook(src);
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][columnCount];
		System.out.println(rowCount);
		System.out.println(columnCount);
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
					XSSFCell cell = row.getCell(j);
					data[i-1][j] = cell.getStringCellValue();
			}			
		}
		wBook.close();
		return data;
	}

}