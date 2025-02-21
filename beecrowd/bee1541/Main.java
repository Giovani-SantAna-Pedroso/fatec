import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int A = 0;
    int B = 0;
    int C = 0;

    A = input.nextInt();
    do {
      B = input.nextInt();
      C = input.nextInt();

      System.out.printf("%.0f\n", Math.floor(Math.sqrt((A * B * 100.0) / C)));

      A = input.nextInt();
    } while (A != 0);
  }
}
