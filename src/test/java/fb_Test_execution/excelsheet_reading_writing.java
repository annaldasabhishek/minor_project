package fb_Test_execution;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import fb_Test_execution.Test_execution_final;
import fb_Page_execution.page_value;


public class excelsheet_reading_writing  extends page_value
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		String emailid   = "     ";
		String password  = "     ";
		String path      = "C:\\Users\\LILT_87\\Downloads\\reading_writing.xlsx";
		
		FileInputStream fs = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int row = sheet.getLastRowNum();
		  System.out.println(row);
		  
		  for(int i=1; i<=row; i++)
		  {	  
			  
			  XSSFRow row1 = sheet.getRow(i);
			  emailid = row1.getCell(1).getStringCellValue();
			  password = row1.getCell(2).getStringCellValue();
			 
			    Browser_launch();
				enter_emailid(emailid);
				enter_password(password);
				login();	
				
				String actual="The password that you've entered is incorrect.";
				  System.out.println(actual);
				String expected ="The password that you've entered is incorrect.";
	              int Cellcount = sheet.getRow(i).getLastCellNum();
	              XSSFCell cell = row1.createCell(Cellcount);
	           
	          if(actual.equals(expected))
	          {
	        	System.out.println("test case is passed");
	        	cell.setCellValue(" pass");
	          }
	          else
	          {
	        	System.out.println("test case is fail");
	        	cell.setCellValue(" fail");
	          }  	
		}
		  fs.close();
		  FileOutputStream fout = new FileOutputStream(path);
		  workbook.write(fout);
		  fout.close();  
	}
}

