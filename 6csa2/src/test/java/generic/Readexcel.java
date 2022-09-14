package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcel implements IConstant{
public String getdataexcel(String Sheet1,int Rownum,int Colnum) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(Excelpath);
	Workbook wb = WorkbookFactory.create(fis);
   String value = wb.getSheet(Sheet1).getRow(Rownum).getCell(Colnum).toString();
    return value;
}
}

