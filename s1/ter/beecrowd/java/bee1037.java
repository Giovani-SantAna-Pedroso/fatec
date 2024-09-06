import java.util.Scanner;

public class bee1037 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float a = input.nextFloat();

    if (a < 0)
      System.out.println("Fora de intervalo");
    else if (a <= 25)
      System.out.println("Intervalo [0,25]");
    else if (a <= 50)
      System.out.println("Intervalo (25,50]");
    else if (a <= 75)
      System.out.println("Intervalo (50,75]");
    else if (a <= 100)
      System.out.println("Intervalo (75,100]");
    else
      System.out.println("Fora de intervalo");
  }
}
