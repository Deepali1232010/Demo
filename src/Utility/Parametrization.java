package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

public static String getData(String sheetname,int row,int cell)throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Velocity\\Automation\\Apache\\Testdata.xlsx");
String value = WorkbookFactory.create(file).getSheet("Credencial").getRow(row).getCell(cell).getStringCellValue();
 return value;
		
	}
}
