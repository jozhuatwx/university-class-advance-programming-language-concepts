package lab6;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Lab6 {
  // recursive lambda
  // power of
  static BinaryOperator<Long> power = (base, expo) ->
    (expo == 0) ? 1 : Lab6.power.apply(base, expo - 1) * base;

  // fibonacci sequence
  static UnaryOperator<Long> fibonacci = (n) ->
    (n == 0 || n == 1) ? n : Lab6.fibonacci.apply(n - 1) + Lab6.fibonacci.apply(n - 2);

  // factorial
  static UnaryOperator<Long> factorial = (n) ->
    (n <= 1) ? 1 : n * Lab6.factorial.apply(n - 1);

  // countdown
  static void countdown(int n) {
    if (n > 0) {
      System.out.println(n);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      countdown(n - 1);
    } else {
      System.out.println("Timeout!");
    }
  }

  // total
  static UnaryOperator<Integer> total = (n) ->
    (n == 0) ? 0 : n + Lab6.total.apply(n - 1);

  // reverse string
  static UnaryOperator<String> reverse = (n) ->
    (n.isEmpty()) ? n : Lab6.reverse.apply(n.substring(1)) + n.charAt(0);

  // maximum number
  static BiFunction<Integer[], Integer, Integer> maximum = (array, i) ->
    (i == 1) ? array[0] : Math.max(array[i - 1], Lab6.maximum.apply(array, i - 1));

  public static void main(String[] args) {
    
  }
}
