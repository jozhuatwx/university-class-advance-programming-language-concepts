package lab6;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsxReader {
  private FileInputStream fileInputStream;
  private XSSFWorkbook workbook;
  private String targetFile;

  public XlsxReader(String targetFile) {
    this.targetFile = targetFile;
    try {
      fileInputStream = new FileInputStream(this.targetFile);
      workbook = new XSSFWorkbook(fileInputStream);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public List<ProjectWork> getProjectWorks() {
    List<ProjectWork> lst = new ArrayList<>();
    // get excel sheet
    XSSFSheet sheet = workbook.getSheetAt(0);

    for (Row row : sheet) {
      int rowNum = row.getRowNum();

      if (rowNum < 3)
        continue;

      lst.add(new ProjectWork(row.getCell(2).getStringCellValue(), row.getCell(1).getStringCellValue(), row.getCell(3).getStringCellValue(), row.getCell(4).getStringCellValue(), row.getCell(5).getStringCellValue()));
    }
    return lst;
  }
}
