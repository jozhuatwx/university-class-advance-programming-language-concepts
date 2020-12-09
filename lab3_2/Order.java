package lab3_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Order {
  private static final String DATAFILE = "lab3_2\\orderlist.txt";

  private String orderItem, orderDateTime, email, deliveryAddress, status, transactionDateTime;
  private float paymentAmount;

  public Order(String orderItem, String orderDateTime, float paymentAmount, String email, String deliveryAddress, String status, String transactionDateTime) {
    this.orderItem = orderItem;
    this.orderDateTime = orderDateTime;
    this.paymentAmount = paymentAmount;
    this.email = email;
    this.deliveryAddress = deliveryAddress;
    this.status = status;
    this.transactionDateTime = transactionDateTime;
  }

  @Override
  public String toString() {
    return "Order{orderItem=" + orderItem + ", orderDateTime=" + orderDateTime + ", paymentAmount=" + paymentAmount + ", email=" + email + ", deliveryAddress" + deliveryAddress + ", status=" + status + ", transactionDateTime=" + transactionDateTime + "}";
  }

  // getters
  public String getOrderItem() {
    return orderItem;
  }

  public int getOrderItemCount() {
    return orderItem.split("\\,").length;
  }

  public String getOrderDateTime() {
    return orderDateTime;
  }

  public float getPaymentAmount() {
    return paymentAmount;
  }

  public String getStatus() {
    return status;
  }

  // get all orders
  public static List<Order> getAll() {
    ArrayList<Order> lst = new ArrayList<>();

    try {
      List<String> lines = Files.readAllLines(Paths.get(DATAFILE));

      for (int i = 1; i < lines.size(); i++) {
        String[] split = lines.get(i).split("\\|");
        lst.add(new Order(split[0], split[1], Float.parseFloat(split[2]), split[3], split[4], split[5], split[6]));
      }
    } catch (IOException e) {
      Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, e);
    }

    return lst;
  }
}
