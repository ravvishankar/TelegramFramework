package fileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public static String getCellData(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./src/test/resources/Mini_Project.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sheet = book.getSheet("Register");
		
		Row row = sheet.getRow(5);
		
		Cell cell = row.getCell(1);
		
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		return value;
	}
	
	public static String[][] readExcelData(String )

}
