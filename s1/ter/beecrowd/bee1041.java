import java.util.Scanner;

public class bee1041 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] products = { 4.00, 4.50, 5.00, 2.00, 1.50 };
    float coordinateX = input.nextFloat();
    float coordinateY = input.nextFloat();

    if (coordinateY == 0 && coordinateX == 0)
      System.out.println("Origem");
    if (coordinateX > 0 && coordinateY > 0)
      System.out.println("Q1");
    if (coordinateX < 0 && coordinateY > 0)
      System.out.println("Q2");
    if (coordinateX < 0 && coordinateY < 0)
      System.out.println("Q3");
    if (coordinateX > 0 && coordinateY < 0)
      System.out.println("Q4");
    if (coordinateX == 0 && coordinateY != 0)
      System.out.println("Eixo Y");
    if (coordinateX != 0 && coordinateY == 0)
      System.out.println("Eixo X");

  }
}
