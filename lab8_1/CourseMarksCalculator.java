package lab8_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CourseMarksCalculator {
  private static List<Student> studentList;

  public static Function<Integer, Double> mul25 = marks -> marks * 0.25;
  
  static {
    studentList = new ArrayList<>();
    studentList.add(new Student(new Integer[]{23, 56, 76, 76}));
    studentList.add(new Student(new Integer[]{43, 61, 66, 78}));
    studentList.add(new Student(new Integer[]{12, 56, 87, 78}));
    studentList.add(new Student(new Integer[]{67, 23, 87, 76}));
  }

  public static List<Double> compute() {
    return studentList.stream()
      .map(student -> Stream.of(student.getMarks()).map(m -> mul25.apply(m)).mapToDouble(Number::doubleValue).sum())
      .collect(Collectors.toCollection(ArrayList::new));
  }
}
