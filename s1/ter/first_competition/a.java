import java.io.BufferedReader;
import java.io.Console;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class a {
  public static void main(String[] args) throws IOException {

    // ≃ 0.065
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    float salary = Float.parseFloat(input.readLine());
    PrintWriter out = new PrintWriter(System.out);

    if (salary <= 2000.00) {
      out.println("Isento");
    }

    else if (salary <= 3000.00) {
      float tax = (salary - 2000.00f) * 0.08f;
      out.println("R$ " + String.format("%.2f", tax));
    }

    else if (salary <= 4500.00) {
      float tax = 80 + (salary - 3000.00f) * 0.18f;
      out.println("R$ " + String.format("%.2f", tax));
    }

    else {
      float tax = 80 + 270 + (salary - 4500.00f) * 0.28f;
      out.println("R$ " + String.format("%.2f", tax));
    }

    out.flush();
  }
}
