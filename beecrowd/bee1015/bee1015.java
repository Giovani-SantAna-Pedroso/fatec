import java.io.IOException;
import java.lang.Math.*;
import java.net.URI;
import java.util.Scanner;

public class bee1015 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    float x1 = input.nextFloat();
    float y1 = input.nextFloat();
    float x2 = input.nextFloat();
    float y2 = input.nextFloat();

    double x2x1 = (x2 - x1);
    double y2y1 = (y2 - y1);

    double distance = Math.sqrt((Math.pow(x2x1, 2) + Math.pow(y2y1, 2)));

    System.out.printf("%.4f\n", distance);
  }
}
