package util;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class ReadingExcel {
	
	@Test
	public void loginOutlook() throws InvalidFormatException, IOException{
		
	File src = new File("./inputData/ctslogin.xlsx");
	XSSFWorkbook wbook = new XSSFWorkbook(src);
	XSSFSheet sheet = wbook.getSheet("Sheet1");
	int row =sheet.getLastRowNum();
	int col = sheet.getRow(0).getLastCellNum();
	System.out.println(row);
	for(int i =0; i<=row;i++){
		XSSFRow rows = sheet.getRow(i);{
			for(int j =0 ;j<col;j++){
				XSSFCell cell = rows.getCell(j);
				String cellvalue = cell.getStringCellValue();
				System.out.println(cellvalue);
			}
		}
		wbook.close();
	}
		
	}

}
