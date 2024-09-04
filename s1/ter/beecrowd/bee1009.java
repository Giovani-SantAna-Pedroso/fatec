
import java.lang.Math.*;
import java.io.IOException;
import java.util.Scanner;

public class bee1009 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String name;
    double salary;
    double sales;

    // name = input.next();
    // salary = input.nextFloat();
    // sales = input.nextFloat();
    name = "manu";
    // salary = 1700.00;
    // sales = 1230.50;
    salary = 500.00;
    sales = 1230.30;

    String earns = String.format("%.7f", salary + (sales * 0.15));

    System.out.printf("name: %s\n", name);
    // System.out.printf("TOTAL = %.2f\n", String.valueOf(earns).substring(0, -2));
    System.out.printf("TOTAL = %s\n", earns.substring(0, earns.length() - 1));
  }
}
