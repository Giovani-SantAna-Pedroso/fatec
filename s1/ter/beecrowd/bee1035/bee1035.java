import java.util.Scanner;

/**
 * bee1035
 */
public class bee1035 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int d = input.nextInt();
    if (b > c && (c > a || d > a) && ((c + d) > (a + b)) && c > 0 && d > 0 && a % 2 == 0) {

      System.out.println("Valores aceitos");
    } else {
      System.out.println("Valores nao aceitos");
    }
  }
}
