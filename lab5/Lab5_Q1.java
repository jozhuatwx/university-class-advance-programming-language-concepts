package lab5;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lab5_Q1 {
  // normal method
  double mul(double a, double b) {
    return a * b;
  }

  // higher order function
  double m(BiFunction<Double, Double, Double> f, double a, double b) {
    return f.apply(a, b);
  }

  Function<Double, Double> m2(BiFunction<Double, Double, Double> f, double a) {
    return b -> f.apply(a, b);
  }

  public static void main(String[] args) {
    Lab5_Q1 lab5 = new Lab5_Q1();

    BiFunction<Double, Double, Double> mul = (a, b) -> a * b;
    System.out.println(lab5.m(mul, 10, 2)); // 20
    System.out.println(lab5.m((a, b) -> a * b, 10, 2)); // 20

    System.out.println(lab5.m2(mul, 10).apply(2.0)); // 
    
    Function<Double, Double> partial_complete_fn = lab5.m2(mul, 10);
    double b = 2;
    double result = partial_complete_fn.apply(b);
    System.out.println(result);
  }
}
