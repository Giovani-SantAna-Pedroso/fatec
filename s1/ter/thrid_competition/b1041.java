import java.util.Scanner;

public class b1041 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float firstEntry = input.nextFloat();
    float secondEntry = input.nextFloat();

    if (firstEntry == 0 && secondEntry == 0)
      System.out.println("Origem");

    else if (firstEntry == 0)
      System.out.println("Eixo Y");

    else if (secondEntry == 0)
      System.out.println("Eixo X");

    else if (firstEntry > 0 && secondEntry > 0)
      System.out.println("Q1");

    else if (firstEntry < 0 && secondEntry > 0)
      System.out.println("Q2");

    else if (firstEntry > 0 && secondEntry < 0)
      System.out.println("Q4");

    else if (firstEntry < 0 && secondEntry < 0)
      System.out.println("Q3");

  }
}
