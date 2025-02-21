import java.io.IOException;
import java.lang.Math.*;
import java.util.Scanner;

public class bee1013 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int maiorAB = (a + b + Math.abs(a - b)) / 2;
    int maiorC = (maiorAB + c + Math.abs(c - maiorAB)) / 2;

    System.out.printf("%s eh o maior\n", maiorC);
  }
}
