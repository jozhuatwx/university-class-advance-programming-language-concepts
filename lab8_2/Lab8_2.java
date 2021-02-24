package lab8_2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Lab8_2 {
  public static void main(String[] args) {
    Item i1 = new Item("Soap", 3.9);
    Item i2 = new Item("Plate", 15.9);
    Item i3 = new Item("Wok", 199.9);

    DecimalFormat df = new DecimalFormat("#.##");

    List<Double> subTotalList = Order.computeSubTotal(Arrays.asList(i1, i2, i3));
    System.out.println("Sub-Total");
    subTotalList.forEach(subTotal -> System.out.println(df.format(subTotal)));
    System.out.println("");

    double grandTotal = Order.computeGrandTotal(subTotalList);
    System.out.println("Grand Total: " + df.format(grandTotal) + "\n");

    double totalPayment = Order.computeTotalPayment(grandTotal);
    System.out.println("Total Payment: " + df.format(totalPayment));
  }
}
