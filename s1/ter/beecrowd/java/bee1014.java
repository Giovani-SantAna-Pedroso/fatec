
import java.io.IOException;
import java.lang.Math.*;
import java.net.URI;
import java.util.Scanner;

public class bee1014 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    float distance = input.nextInt();
    float fuel = input.nextFloat();

    System.out.printf("%.3f km/l\n", distance / fuel);
  }
}
