package lab5;

import java.util.List;

public class Lab5 {
  public static void main(String[] args) {
    String fileName = "C:\\Code\\university-class-advance-programming-language-concepts\\lab6\\senarai-keperluan-peralatan-dan-kenderaan-kkm-rmk11.xlsx";
    XlsxReader reader = new XlsxReader(fileName);
    List<ProjectWork> projectLst = reader.getProjectWorks();
    projectLst.forEach(System.out::println);
  }
}
