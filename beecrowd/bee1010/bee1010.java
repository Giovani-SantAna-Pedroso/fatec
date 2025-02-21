
import java.lang.Math.*;
import java.io.IOException;
import java.util.Scanner;

public class bee1010 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // first line
    int first_item_code = input.nextInt();
    int first_item_qtn = input.nextInt();
    float first_item_val = input.nextFloat();

    // first line
    int second_item_code = input.nextInt();
    int second_item_qtn = input.nextInt();
    float second_item_val = input.nextFloat();

    float total = ((first_item_val * first_item_qtn) + (second_item_qtn * second_item_val));

    System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
  }
}
