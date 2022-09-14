package MAVEN;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Maven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./src/test/resources/Book1.xlsx");		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheetname = wb.getSheet("Sheet1"); //this indicate which sheet we need to use 	
		Row row = sheetname.getRow(0); //this is to give the row number
		Cell cell = row.getCell(0);// this is use to give the column number
		String string = cell.toString();
		System.out.println(string);
	}
	
}
