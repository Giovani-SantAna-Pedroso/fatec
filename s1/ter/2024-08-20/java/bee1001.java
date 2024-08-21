import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
// public class Main {
public class bee1001 {

  public static void main(String[] args) throws IOException {

    Scanner input = new Scanner(System.in);

    int num1;
    int num2;
    int sum;

    num1 = input.nextInt();
    num2 = input.nextInt();

    sum = num1 + num2;
    System.out.printf("X = %s\n", sum);

  }

}
