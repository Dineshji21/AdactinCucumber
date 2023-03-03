package selenium;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsheet {

	private static void selectpart() throws Throwable {
		
     File f=new File("C:\\Users\\dines\\eclipse-workspace\\work\\newproject\\xlsheet\\dinesh.xlsx");
     FileInputStream file =new FileInputStream(f);
     Workbook wb=new XSSFWorkbook(file);
     Sheet sheetAt = wb.getSheetAt(0);
     Row row = sheetAt.getRow(2);
     Cell cell = row.getCell(1);
     CellType celltype  = cell.getCellType();  
     if (celltype.equals(CellType.STRING)) {
    	 String stringCellValue = cell.getStringCellValue();
    	 System.out.println( stringCellValue);
     }
     
     else if (celltype.equals(CellType.NUMERIC)) {
    	 double numericCellValue = cell.getNumericCellValue();
    	 int d=(int) numericCellValue;
    	 System.out.println(d);
    	 
		
	}
     wb.close();
     
     
	}
	public static void main(String[] args) throws Throwable {
		selectpart();
		
	}

}
