package DAS;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class VB {
	@Test
	  public void f() throws IOException {
		  XSSFWorkbook workbook = new XSSFWorkbook();
		  FileOutputStream out = new FileOutputStream(new File("C:\\Users\\a07208trng_b4a.04.26\\Desktop\\amar.xslx"));
		  workbook.write(out);
		  out.close();
		  System.out.println("Workbook created successfully");
		  workbook.close();
	  }
}
