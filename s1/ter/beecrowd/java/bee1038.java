import java.util.Scanner;

public class bee1038 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] products = { 4.00, 4.50, 5.00, 2.00, 1.50 };
    int productCode = input.nextInt();
    int productAmout = input.nextInt();

    System.out.printf("Total: R$ %.2f\n", productAmout * products[productCode - 1]);
  }
}
