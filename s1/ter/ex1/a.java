import java.util.Scanner;

public class a {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    double b = input.nextDouble();

    System.out.printf("%f\n", a + b);
    System.out.printf("%f\n", a * b * b);
    System.out.printf("%f\n", a * b);
    System.out.printf("%f\n", Math.sqrt(a * a + b * b));
    System.out.printf("%f\n", Math.sin(a - b));
    System.out.printf("%f\n", Math.abs(a));
  }
}
