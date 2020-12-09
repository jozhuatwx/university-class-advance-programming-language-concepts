package lab3_2;

import java.util.List;
import java.util.stream.Collectors;

import org.javatuples.Pair;
import org.javatuples.Quartet;

public class Lab3_2 {
  public static void main(String[] args) {
    // Account
    List<Account> accountData = Account.getAll();
    System.out.println(getCredential(accountData));

    // Order
    List<Order> orderData = Order.getAll();

    // 2. List all order information
    System.out.println(orderData);

    System.out.println(calculateTotalPaymentAmount(orderData));
    System.out.println(getOrder(orderData));
    System.out.println(calculateTotalOrderItems(orderData));
  }

  private static List<Pair<String, String>> getCredential(List<Account> data) {
    return data.stream()
      .map(account -> Pair.with(account.getUsername(), account.getPassword()))
      .collect(Collectors.toList());
  }

  // 3. Calculate the total of order payment
  private static float calculateTotalPaymentAmount(List<Order> data) {
    return data.stream()
      .map(order -> order.getPaymentAmount())
      .reduce(0f, Float::sum);
  }

  // 4. List OrderItem, OrderDateTime, PaymentAmount, and Status using tuples
  private static List<Quartet<String, String, Float, String>> getOrder(List<Order> data) {
    return data.stream()
      .map(order -> Quartet.with(order.getOrderItem(), order.getOrderDateTime(), order.getPaymentAmount(), order.getStatus()))
      .collect(Collectors.toList());
  }

  // 5. List total order items in this file
  private static int calculateTotalOrderItems(List<Order> data) {
    return data.stream()
      .map(order -> order.getOrderItemCount())
      .reduce(0, Integer::sum);
  }
}
