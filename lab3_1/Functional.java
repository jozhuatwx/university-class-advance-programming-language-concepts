package lab3_1;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functional {
  // 1. Iterate and display through all elements of array list. 
  public static void q1(List<Integer> numLst) {
    numLst.stream()
      .forEach(System.out::println);
  }

  // 2. Search and display an element
  public static void q2(List<Integer> numLst, int target) {
    Integer result = numLst.stream()
      .filter(elem -> elem == target)
      .findAny()
      .orElse(null);

    System.out.println(result);
  }

  // 3. Double up each array element by 2 and store them in another array list.
  public static void q3(List<Integer> numLst) {
    List<Integer> result = numLst.stream()
      .map(elem -> elem * 2)
      .collect(Collectors.toList());

    result.stream()
      .forEach(System.out::println);
  }

  // 4. Sort all elements in ascending order.
  public static void q4(List<Integer> numLst) {
    List<Integer> result = numLst.stream()
      .sorted()
      .collect(Collectors.toList());
    
    result.stream()
      .forEach(System.out::println);
  }

  // 5. Sort all elements in descending order.
  public static void q5(List<Integer> numLst) {
    List<Integer> result = numLst.stream()
      .sorted(Comparator.reverseOrder())
      .collect(Collectors.toList());
    
    result.stream()
      .forEach(System.out::println);
  }

  // 6. Generate numbers from 2 to 20 with a gap of 2. Join this generated numbers with the array list above. Display all elements of the newly created array list.
  public static void q6(List<Integer> numLst) {
    List<Integer> result = Stream
      .iterate(2, n -> n + 2)
      .limit(10)
      .collect(Collectors.toList());

    Stream.of(numLst, result)
      .flatMap(Collection::stream)
      .forEach(System.out::println);
  }

  // 7. Find and display all the elements that is greater than 10.
  public static void q7(List<Integer> numLst) {
    numLst.stream()
      .filter(elem -> elem > 10)
      .forEach(System.out::println);
  }

  // 8. Find the minimum and maximum value.
  public static void q8(List<Integer> numLst) {
    System.out.println("min=" + numLst.stream().mapToInt(v -> v).min().getAsInt() + ", max=" + numLst.stream().mapToInt(v -> v).max().getAsInt());
  }

  // 9. Find the sum and average value of the list.
  // 10. Find any even number on the list. Display the result either true or false.
}
