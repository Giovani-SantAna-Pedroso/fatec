import java.util.Scanner;

/**
 * b
 */
public class b {

  public static void main(String[] args) {
    int numEvens = 0;
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      numEvens += input.nextInt() % 2 == 0 ? 1 : 0;
    }
    System.out.printf("%s valores pares\n", numEvens);
  }
}
