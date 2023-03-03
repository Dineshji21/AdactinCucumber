package selenium_datadriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Readalldata {

	private static void alldataread() throws IOException  {
		File f= new File("C:\\Users\\dines\\eclipse-workspace\\work\\newproject\\xlsheet\\dinesh.xlsx") ;
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int phyNumberOfRows = sheetAt.getPhysicalNumberOfRows();


		for (int i = 0; i < phyNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int physNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j <physNumberOfCells   ; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if ( cellType.equals(CellType.STRING) ) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
					else if (cellType.equals(CellType.NUMERIC)) {
						double data= cell.getNumericCellValue();
						System.out.println(data);
					}
			}
		}
		wb.close();
	}

	public static void main(String[] args) throws IOException     {
      alldataread();
	}
}
