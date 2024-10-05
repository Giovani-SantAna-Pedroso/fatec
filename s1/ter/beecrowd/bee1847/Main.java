import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();

    if (a > b && b <= c)
      System.out.println(":)");

    else if (a < b && b >= c)
      System.out.println(":(");

    else if (a < b && (c > b && (c - b < b - a)))
      System.out.println(":(");

    else if (a < b && (b < c && (c - b >= b - a)))
      System.out.println(":)");

    else if (a > b && (b > c && (b - c < a - b)))
      System.out.println(":)");

    else if (a > b && (b > c && (b - c >= a - b)))
      System.out.println(":(");

    else if (a == b && b < c)
      System.out.println(":)");
    else if (a == b && b > c)
      System.out.println(":(");
    else
      System.out.println(":(");
  }
}
