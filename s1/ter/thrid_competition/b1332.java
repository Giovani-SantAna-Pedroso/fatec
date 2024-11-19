import java.util.Scanner;

public class b1332 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int timesToCount = input.nextInt();

    char one[] = { 'o', 'n', 'e' };
    char two[] = { 't', 'w', 'o' };

    for (; timesToCount != 0; timesToCount--) {
      String numberToGuest = input.next();

      if (numberToGuest.length() == 5) {
        System.out.println("3");
        continue;
      }

      int isOne = 0;
      int isTwo = 0;

      for (int i = 0; i < 3; i++) {
        char tmp = numberToGuest.charAt(i);

        if (one[i] == tmp) {
          isOne += 1;
          continue;
        }
        if (two[i] == tmp) {
          isTwo += 1;
          continue;
        }

      }

      if (isOne > isTwo)
        System.out.println("1");
      else
        System.out.println("2");
    }
  }
}
