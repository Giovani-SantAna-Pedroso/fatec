import java.util.Scanner;

/**
 * Adition
 */
public class Adition {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int num1;
    int num2;
    int sum;

    num1 = input.nextInt();
    num2 = input.nextInt();

    sum = num1 + num2;
    System.out.printf("X = %s\n", sum);
  }
}
