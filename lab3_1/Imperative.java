package lab3_1;

import java.util.ArrayList;
import java.util.List;

public class Imperative {
  // 1. Iterate and display through all elements of array list. 
  public static void q1(List<Integer> numLst) {
    for (Integer elem : numLst) {
      System.out.println(elem);
    }
  }

  // 2. Search and display an element
  public static void q2(List<Integer> numLst, int target) {
    for (Integer elem : numLst) {
      if (elem == target) {
        System.out.print(elem);
        break;
      }
    }
  }

  // 3. Double up each array element by 2 and store them in another array list.
  public static void q3(List<Integer> numLst) {
    ArrayList<Integer> result = new ArrayList<>();
    for (Integer elem : numLst) {
      result.add(elem * 2);
    }

    for (Integer elem : result) {
      System.out.println(elem);
    }
  }

  // 4. Sort all elements in ascending order.
  public static void q4(List<Integer> numLst) {
    for (Integer elem : numLst) {
      for (int i = 0; i < numLst.size() - 1; i++) {
        if (numLst.get(i) > numLst.get(i + 1)) {
          int temp = numLst.get(i);
          numLst.set(i, numLst.get(i + 1));
          numLst.set(i + 1, temp);
        }
      }
    }

    for (Integer elem : numLst) {
      System.out.println(elem);
    }
  }

  // 5. Sort all elements in descending order.
  public static void q5(List<Integer> numLst) {
    for (Integer elem : numLst) {
      for (int i = 0; i < numLst.size() - 1; i++) {
        if (numLst.get(i) < numLst.get(i + 1)) {
          int temp = numLst.get(i);
          numLst.set(i, numLst.get(i + 1));
          numLst.set(i + 1, temp);
        }
      }
    }
  }

  // 6. Generate numbers from 2 to 20 with a gap of 2. Join this generated numbers with the array list above. Display all elements of the newly created array list.
  public static void q6(List<Integer> numLst) {
    ArrayList<Integer> result = new ArrayList<>();
    for (Integer elem : numLst) {
      result.add(elem);
    }

    for (int i = 2; i <= 20; i += 3) {
      result.add(i);
    }

    for (Integer elem : result) {
      System.out.println(elem);
    }
  }

  // 7. Find and display all the elements that is greater than 10.
  public static void q7(List<Integer> numLst) {
    for (Integer elem : numLst) {
      if (elem > 10) {
        System.out.println(elem);
      }
    }
  }

  // 8. Find the minimum and maximum value.
  public static void q8(List<Integer> numLst) {
    int min = numLst.get(0), max = numLst.get(0);
    for (Integer elem : numLst) {
      if (elem < min) {
        min = elem;
      } else if (elem > max) {
        max = elem;
      }
    }
    System.out.println("min=" + min + ", max=" + max);
  }

  // 9. Find the sum and average value of the list.
  // 10. Find any even number on the list. Display the result either true or false.
}
