import java.util.Scanner;

/**
 * c
 */
public class c {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int firstN = input.nextInt();
    int secondN = input.nextInt();
    int tmp = 0;

    // put the values in order
    if (firstN > secondN) {
      tmp = firstN;
      firstN = secondN;
      secondN = tmp;
    }

    int sumOfOdds = 0;

    for (int i = firstN + 1; i < secondN; i++) {
      System.out.println(sumOfOdds);
      sumOfOdds += i % 2 == 0 ? 0 : i;
    }

    System.out.println(sumOfOdds);
  }
}
