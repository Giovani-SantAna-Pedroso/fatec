
// Error with floating point
import java.util.Scanner;

/**
 * bee1035
 */
public class bee1036 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float a = input.nextFloat();
    float b = input.nextFloat();
    float c = input.nextFloat();

    float delta = (b * b) + (a * c * -4);
    if (delta < 0 || a == 0) {
      System.out.println("Impossivel calcular");
    } else {
      double r1 = (-b + Math.sqrt(delta)) / (2 * a);
      double r2 = (-b - Math.sqrt(delta)) / (2 * a);
      System.out.printf("R1 = %.5f\n", r1);
      System.out.printf("R2 = %.5f\n", r2);
    }
  }
}
