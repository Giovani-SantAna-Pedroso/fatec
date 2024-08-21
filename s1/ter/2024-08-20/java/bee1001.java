import java.io.ioexception;
import java.util.scanner;

/**
 * important:
 * o nome da classe deve ser "main" para que a sua solução execute
 * class name must be "main" for your solution to execute
 * el nombre de la clase debe ser "main" para que su solución ejecutar
 */
// public class main {
public class bee1001 {

  public static void main(string[] args) throws ioexception {

    scanner input = new scanner(system.in);

    int num1;
    int num2;
    int sum;

    num1 = input.nextint();
    num2 = input.nextint();

    sum = num1 + num2;
    system.out.printf("x = %s\n", sum);

  }

}
