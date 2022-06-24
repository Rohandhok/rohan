package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	public static String getData(int row,int cell) throws EncryptedDocumentException, IOException {
		 FileInputStream file =new FileInputStream("E:\\Rohan\\KiteZeroda\\src\\main\\resources\\Book223.xlsx");
		 String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		 return value;
				 
	}

}
