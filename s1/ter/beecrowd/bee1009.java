
// Problem if rounding the numbers
import java.lang.Math.*;
import java.io.IOException;
import java.util.Scanner;

public class bee1009 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String name;
    double salary;
    double sales;

    name = input.next();
    salary = input.nextDouble();
    sales = input.nextDouble();

    double total = salary + (sales * 0.15);

    System.out.printf("TOTAL = R$ %.2f\n", total);
  }
}
