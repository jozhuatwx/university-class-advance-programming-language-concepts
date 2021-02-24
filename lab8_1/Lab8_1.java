package lab8_1;

import java.text.DecimalFormat;
import java.util.List;

public class Lab8_1 {
  public static void main(String[] args) {
    List<Double> results = CourseMarksCalculator.compute();

    DecimalFormat df = new DecimalFormat("#.##");
    results.forEach(result -> System.out.println(df.format(result)));
  }
}
