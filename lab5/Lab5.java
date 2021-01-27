package lab5;

import java.util.Arrays;
import java.util.function.BiFunction;

public class Lab5 {
  // Q1
  static BiFunction<Double, Double, Double> mul = (a, b) -> a * b;
  public static void q1() {
    System.out.println(mul.apply(10.0, 2.0));
  }

  // Q2
  public static String q2(String target) {
    String[] username = {"ali", "ahmad", "maria", "john", "derick", "salleh"};
    return Arrays.stream(username)
      .filter(elem -> elem.equalsIgnoreCase(target))
      .findAny()
      .orElse(null);
  }

  // Q3
  static BiFunction<String, String, String> joiner = (a, b) -> a + b;
  static BiFunction<String, String, String> joiner2 = (a, b) -> String.join(a, b);
  public static void q3() {
    System.out.println(joiner.apply("hello ", "world!"));
  }

  // Q4
  static int compute(int x, int[] a) {
    return Arrays.stream(a).sum() * x;
  }
}
