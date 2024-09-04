import java.lang.Math.*;
import java.io.IOException;
import java.util.Scanner;

public class bee1011 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    final double PI = 3.14159;
    final double X = 4.0 / 3.0;

    double radiu = input.nextFloat();
    double radiu3 = radiu * radiu * radiu;

    double volume = X * PI * radiu3;

    System.out.printf("VOLUME = %.3f\n", volume);
  }
}
