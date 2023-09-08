package WebDriverUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exelUtilityClass {

	public String exelFile(String sheetName,int rownumber,int columnNumber) throws Throwable {
		File xlFile = new File("C:\\exeldata\\exelFile.xlsx");
		  FileInputStream fis= new FileInputStream(xlFile);
		 Workbook woorkbook = WorkbookFactory.create(fis);
		 Sheet sheet=woorkbook.getSheet(sheetName);
		Row row= sheet.getRow(rownumber);
		Cell cell=row.getCell(columnNumber);
		String value=cell.getStringCellValue();
		return value;
	}
}
