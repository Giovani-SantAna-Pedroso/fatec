import java.util.Scanner;

public class a {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float salary = input.nextFloat();
    if (salary <= 2000.00)
      System.out.println("Isento");
    else if (salary <= 3000.00)
      System.out.printf("R$ %.2f", (salary - 2000.00) * 0.08);
    //
    else if (salary <= 4500.00)
      System.out.printf("R$ %.2f", 80 + ((salary - 3000.00) * 0.18));
    else
      System.out.printf("R$ %.2f", 80 + 270 + ((salary - 4500.00) * 0.28));
  }
}
