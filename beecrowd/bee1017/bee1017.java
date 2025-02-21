import java.io.IOException;
import java.lang.Math.*;
import java.net.URI;
import java.util.Scanner;

public class bee1017 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int durationTrip = input.nextInt();
    int speed = input.nextInt();

    int distance = durationTrip * speed;
    double fuelSpend = distance / 12.0;

    System.out.printf("%.3f\n", fuelSpend);
  }
}
