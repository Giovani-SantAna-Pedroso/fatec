import java.io.IOException;
import java.lang.Math.*;
import java.net.URI;
import java.util.Scanner;

public class bee1016 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int startDistanceCarX = input.nextInt();

    double hoursToCarYReachCarX = startDistanceCarX / 30.0;
    double minutesToReach = hoursToCarYReachCarX * 60.0;
    System.out.printf("%.0f minutos\n", minutesToReach);
  }
}
