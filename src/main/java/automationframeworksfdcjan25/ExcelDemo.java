package automationframeworksfdcjan25;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	static void readXL() throws IOException {
		String path = System.getProperty("user.dir") + "/src/main/resources/DemoFile.xlsx";
		XSSFWorkbook demo = new XSSFWorkbook(path);
		XSSFSheet sheet1 = demo.getSheetAt(0);
		XSSFRow rows;
		for (int row = 0; row < sheet1.getLastRowNum(); row++) {
			rows = sheet1.getRow(row);
			for (int col = 0; col < rows.getLastCellNum(); col++) {
				System.out.print(rows.getCell(col) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir") 
				+ "/src/main/resources/DemoFile2.xlsx";
		XSSFWorkbook demo = new XSSFWorkbook();
		XSSFSheet sheet = demo.createSheet("Hello");
		XSSFRow r1 = sheet.createRow(0);
		r1.createCell(0).setCellValue("NAME");
		demo.write(new FileOutputStream(path));
		demo.close();
	}

}
