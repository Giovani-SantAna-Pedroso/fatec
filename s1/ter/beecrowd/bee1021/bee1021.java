import java.io.IOException;
import java.lang.Math.*;
import java.net.URI;
import java.util.Scanner;

public class bee1021 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float value = input.nextFloat();
    int notas100 = 0;
    int notas50 = 0;
    int notas20 = 0;
    int notas10 = 0;
    int notas5 = 0;
    int notas2 = 0;

    // Bills
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

    System.out.printf("NOTAS:\n", value);
    System.out.printf("%s nota(s) de R$ 100.00\n", notas100);
    System.out.printf("%s nota(s) de R$ 50.00\n", notas50);
    System.out.printf("%s nota(s) de R$ 20.00\n", notas20);
    System.out.printf("%s nota(s) de R$ 10.00\n", notas10);
    System.out.printf("%s nota(s) de R$ 5.00\n", notas5);
    System.out.printf("%s nota(s) de R$ 2.00\n", notas2);

    int coin100 = 0;
    int coin050 = 0;
    int coin025 = 0;
    int coin010 = 0;
    int coin005 = 0;
    int coin001 = 0;

    while (value >= 1.00) {
      value -= 1.00;
      coin100++;
    }
    while (value >= 0.50) {
      value -= 0.50;
      coin050++;
    }
    while (value >= 0.25) {
      value -= 0.25;
      coin025++;
    }
    while (value >= 0.10) {
      value -= 0.10;
      coin010++;
    }
    while (value >= 0.05) {
      value -= 0.05;
      coin005++;
    }
    while (value > 0.005) {
      value -= 0.01;
      coin001++;
    }

    // Coins
    System.out.printf("MOEDAS:\n", value);
    System.out.printf("%s moeda(s) de R$ 1.00\n", coin100);
    System.out.printf("%s moeda(s) de R$ 0.50\n", coin050);
    System.out.printf("%s moeda(s) de R$ 0.25\n", coin025);
    System.out.printf("%s moeda(s) de R$ 0.10\n", coin010);
    System.out.printf("%s moeda(s) de R$ 0.05\n", coin005);
    System.out.printf("%s moeda(s) de R$ 0.01\n", coin001);
  }
}
