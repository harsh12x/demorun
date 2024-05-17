package newstart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelsheetpro {
  @Test
  public void f() throws FileNotFoundException {
	  
	  
	  File excel=new File("C:\\Users\\Lenovo\\OneDrive\\Desktop\\testdatarun.xlsx");
         System.out.println(excel.exists());
         
         //to access the workbook
         
	  FileInputStream input=new FileInputStream(excel);
	  
	  
	  try {
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		
		//to access the rows
		//to count the rows and col
		
		int no_of_rows=sheet.getPhysicalNumberOfRows();
		
		int no_of_col=sheet.getRow(0).getLastCellNum();
		
		
		
		for(int i=1;i<no_of_rows;i++) {
		//access the row	
		XSSFRow row=sheet.getRow(i);
			
		
		for(int j=0;j<no_of_col;j++) {
		
		System.out.println(row.getCell(j).getStringCellValue());
		
		
		}
		}
		
		
		
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  
	  
	  
	  
	  
  }
}
