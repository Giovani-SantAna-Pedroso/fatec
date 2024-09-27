import java.lang.Math.*;
import java.io.IOException;
import java.util.Scanner;

public class bee1020 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int daysToCount = input.nextInt();
    int days = 0;
    int mounths = 0;
    int years = 0;

    while (daysToCount > 0) {
      days++;
      if (days == 30) {
        days = 0;
        mounths++;
        if (mounths == 12) {
          mounths = 0;
          years++;
          days -= 5;
        }
      }
      daysToCount--;
    }

    System.out.printf("%s ano(s)\n", years);
    System.out.printf("%s mes(es)\n", mounths);
    System.out.printf("%s dia(s)\n", days);
  }
}
