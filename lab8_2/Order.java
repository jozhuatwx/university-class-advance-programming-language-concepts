package lab8_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Order {
  private static List<Item> items = new ArrayList<>();
  public static Function<Double, Double> tax = price -> price * 1.06;
  public static Function<Double, Double> serviceTax = price -> price * 1.1;

  public static List<Item> getItems() {
    return items;
  }

  public static void setItems(List<Item> items) {
    Order.items = items;
  }

  public static List<Double> computeSubTotal(List<Item> priceList) {
    return priceList.stream()
      .map(item -> Stream.of(item.getPrice()).map(price -> tax.apply(price)).mapToDouble(Number::doubleValue).sum())
      .collect(Collectors.toCollection(ArrayList::new));
  }

  public static double computeGrandTotal(List<Double> subTotalList) {
    return subTotalList.stream().mapToDouble(Number::doubleValue).sum();
  }

  public static double computeTotalPayment(double grandTotal) {
    return serviceTax.apply(grandTotal);
  }
}
