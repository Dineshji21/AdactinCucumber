package selenium_datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class inputdata {


	public  static void  inputdataipt() throws IOException  {
		File f = new File("C:\\Users\\dines\\Desktop\\dinesh.xlsx");
		FileInputStream fis =new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		//Sheet createSheet = wb.createSheet("datadrivenipt");
		//	Row createRow = createSheet.createRow(0);
		//Cell createCell = createRow.createCell(0);
		//reateCell.setCellValue("username");
		wb.createSheet("datadrivenipt").createRow(0).createCell(0).setCellValue("username");
		wb.getSheet("datadrivenipt").getRow(0).createCell(1).setCellValue("password");
		wb.getSheet("datadrivenipt").createRow(1).createCell(0).setCellValue("asdf");
		wb.getSheet("datadrivenipt").getRow(1).createCell(1).setCellValue("asd@123");
		wb.getSheet("datadrivenipt").createRow(2).createCell(0).setCellValue("zxc");
		wb.getSheet("datadrivenipt").getRow(2).createCell(1).setCellValue("zxc@234");
		
		FileOutputStream fos =new FileOutputStream(f);
		wb.write(fos);
		System.exit(0);
		System.out.println("write successfully");
		wb.close();
		


	}

	public static void main(String[] args) throws IOException {
		inputdataipt();

	}

}
