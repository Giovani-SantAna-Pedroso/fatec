import java.util.Scanner;

/**
 * b3053
 */
public class b3053 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int timesToShafel = input.nextInt();
    int initialPosition = input.next().charAt(0) - 'A';

    int cups[] = { 0, 0, 0 };

    cups[initialPosition] = 1;

    for (; timesToShafel != 0; timesToShafel--) {
      cups = changePostion(cups, input.nextInt());
    }

    if (cups[0] == 1)
      System.out.println("A");
    if (cups[1] == 1)
      System.out.println("B");
    if (cups[2] == 1)
      System.out.println("C");

  }

  public static int[] changePostion(int[] ogPotion, int typeOfMotiment) {

    int tmpValue = 0;
    switch (typeOfMotiment) {
      case 1:
        tmpValue = ogPotion[0];
        ogPotion[0] = ogPotion[1];
        ogPotion[1] = tmpValue;
        return ogPotion;

      case 2:
        tmpValue = ogPotion[2];
        ogPotion[2] = ogPotion[1];
        ogPotion[1] = tmpValue;
        return ogPotion;
      case 3:

        tmpValue = ogPotion[0];
        ogPotion[0] = ogPotion[2];
        ogPotion[2] = tmpValue;
        return ogPotion;

      default:
        return ogPotion;
    }
  }

}
