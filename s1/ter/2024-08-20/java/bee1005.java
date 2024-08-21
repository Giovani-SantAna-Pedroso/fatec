import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
// public class Main {
public class bee1005 {

  public static void main(String[] args) throws IOException {

    Scanner input = new Scanner(System.in);

    double num1;
    double num2;
    double sum;

    num1 = input.nextFloat();
    num2 = input.nextFloat();

    sum = (num1 + num2) / 2;
    System.out.printf("MEDIA = %.5f\n", sum);

  }

}
