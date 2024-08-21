import java.lang.Math.*;
import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 * O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute
 * El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
// public class Main {
public class bee1002 {

  public static void main(String[] args) throws IOException {

    Scanner input = new Scanner(System.in);

    double num1;

    num1 = input.nextDouble();

    System.out.printf("A=%.4f\n", (num1 * num1) * 3.14159);

  }

}
