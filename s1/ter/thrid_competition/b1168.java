import java.util.Scanner;

public class b1168 {

  public static void main(String[] args) {
    // int numberToCount = input.ne
    Scanner input = new Scanner(System.in);
    int timesToCount = input.nextInt();

    for (; timesToCount != 0; timesToCount--) {
      int leds = 0;
      String numberShown = input.next();

      for (char ch : numberShown.toCharArray()) {
        leds += getNumberOfLeds(ch);
      }
      System.out.printf("%d leds\n", leds);
    }
  }

  public static int getNumberOfLeds(char number) {
    switch (number) {
      case '1':
        return 2;
      case '2':
        return 5;
      case '3':
        return 5;
      case '4':
        return 4;
      case '5':
        return 5;
      case '6':
        return 6;
      case '7':
        return 3;
      case '8':
        return 7;
      case '9':
        return 6;
      case '0':
        return 6;

      default:
        return 0;
    }
  }

}
