package testng1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Book {
  @Test
  public void f() throws IOException {
	  XSSFWorkbook work = new XSSFWorkbook();
	  FileOutputStream out = new FileOutputStream(new File("C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium\\file.xlsx"));
	  work.write(out);
	  out.close();
	  System.out.println("Workbook created successfully");
	  work.close();
  }
}
