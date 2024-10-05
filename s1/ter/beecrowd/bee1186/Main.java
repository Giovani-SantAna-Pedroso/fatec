import java.util.Scanner;

/**
 * main
 */
public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int totalN = 12;

    String operation = input.next();

    double sum = 0;
    float tmp = 0;
    int amout = 0;
    for (int i = 0; i < totalN; i++) {
      for (int j = totalN; j > 0; j--) {
        tmp = input.nextFloat();
        // System.out.printf("j-i = %d\n", j - i);
        if (j - i <= 0) {

          // System.out.printf("added", j);
          sum += tmp;
          amout++;
        }
      }
    }

    if (operation.equals("S")) {
      System.out.printf("%.1f\n", sum);
    } else
      System.out.printf("%.1f\n", (sum / amout));
  }
}
