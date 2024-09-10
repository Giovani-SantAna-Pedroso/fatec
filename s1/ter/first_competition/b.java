import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class b {

  public static void main(String[] args) throws IOException {

    PrintWriter out = new PrintWriter(System.out);
    int numEvens = 0;
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 5; i++) {
      numEvens += Integer.parseInt(input.readLine()) % 2 == 0 ? 1 : 0;
    }

    out.println(String.valueOf(numEvens) + " valores pares");
    out.flush();
  }
}
