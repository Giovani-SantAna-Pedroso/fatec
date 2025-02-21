import java.io.IOException;
import java.lang.Math.*;
import java.net.URI;
import java.util.Scanner;

public class bee1018 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int value = input.nextInt();
    System.out.printf("%s\n", value);
    int notas100 = 0;
    int notas50 = 0;
    int notas20 = 0;
    int notas10 = 0;
    int notas5 = 0;
    int notas2 = 0;
    int notas1 = 0;

    while (value >= 100) {
      value -= 100;
      notas100++;
    }
    while (value >= 50) {
      value -= 50;
      notas50++;
    }
    while (value >= 20) {
      value -= 20;
      notas20++;
    }
    while (value >= 10) {
      value -= 10;
      notas10++;
    }
    while (value >= 5) {
      value -= 5;
      notas5++;
    }
    while (value >= 2) {
      value -= 2;
      notas2++;
    }
    while (value >= 1) {
      value -= 1;
      notas1++;
    }

    System.out.printf("%s nota(s) de R$ 100,00\n", notas100);
    System.out.printf("%s nota(s) de R$ 50,00\n", notas50);
    System.out.printf("%s nota(s) de R$ 20,00\n", notas20);
    System.out.printf("%s nota(s) de R$ 10,00\n", notas10);
    System.out.printf("%s nota(s) de R$ 5,00\n", notas5);
    System.out.printf("%s nota(s) de R$ 2,00\n", notas2);
    System.out.printf("%s nota(s) de R$ 1,00\n", notas1);
    // System.out.printf("%s\n", value);
  }
}
