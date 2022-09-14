package MAVEN;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Book1 {

	public static void readdatafromsheet(String sheet,int rownum,int colnum) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new  FileInputStream("./src/test/resources/Book1.xlsx");		
		Workbook wb = WorkbookFactory.create(fis);
		String string = wb.getSheet(sheet).getRow(rownum).getCell(colnum).toString();
		System.out.println(string);
	}

}


