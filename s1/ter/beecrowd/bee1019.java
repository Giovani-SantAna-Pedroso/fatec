import java.lang.Math.*;
import java.io.IOException;
import java.util.Scanner;

public class bee1019 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int secondsToCount = input.nextInt();
    int seconds = 0;
    int minutes = 0;
    int hours = 0;

    while (secondsToCount > 0) {
      seconds++;
      if (seconds == 60) {
        seconds = 0;
        minutes++;
        if (minutes == 60) {
          minutes = 0;
          hours++;
        }
      }
      secondsToCount--;
    }

    System.out.printf("%s:%s:%s\n", hours, minutes, seconds);
  }
}
