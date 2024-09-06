
// Not done
import java.io.IOException;
import java.lang.Math.*;
import java.net.URI;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class bee1023 {
  public static class House {
    public int numberOfPeople;
    public int consumption;
    public float averge;

    public float getAverge() {
      this.averge = (float) consumption / numberOfPeople;
      return this.averge;
    }

    public void setNumber(int n) {
      this.numberOfPeople = n;
    }

    public void setCon(int n) {
      this.consumption = n;
    }

    public String getHouseData() {
      System.out.println(numberOfPeople);
      System.out.println(consumption);
      getAverge();
      return this.numberOfPeople + "-" + (int) this.averge;
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int cityN = 1;

    int amoutOfHouses = input.nextInt();
    System.out.println("=============================");
    while (amoutOfHouses != 0) {
      System.out.printf("Cidade# %s:\n", cityN);

      House[] houses = new House[amoutOfHouses];

      int totalPessoas = 0;
      int totalConsomido = 0;

      for (int i = 0; i < amoutOfHouses; i++) {
        houses[i] = new House();
        houses[i].numberOfPeople = (input.nextInt());
        houses[i].consumption = input.nextInt();
        totalPessoas += houses[i].numberOfPeople;
        totalConsomido += houses[i].consumption;
      }

      Arrays.sort(houses, new Comparator<House>() {
        @Override
        public int compare(House h1, House h2) {
          // Comparando os números das casas
          return Float.compare(h1.averge, h2.averge);
        }
      });
      String x = "";

      for (int i = 0; i < houses.length; i++) {
        x += houses[i].getHouseData() + " ";
      }

      System.out.println(x.substring(0, x.length() - 1));

      System.out.printf("Consumo medio: %.2f m3.\n", (float) totalConsomido / totalPessoas);
      cityN++;
      amoutOfHouses = input.nextInt();
    }

  }
}
