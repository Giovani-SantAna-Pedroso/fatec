import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class b2 {

  public static void main(String[] args) throws IOException {

    PrintWriter out = new PrintWriter(System.out);
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    int a = 0;
    int n1 = 1;

    do {
      n1++;
      a += Integer.parseInt(input.readLine()) % 2 == 0 ? 1 : 0;
    } while (n1 < 6);

    out.println(String.valueOf(a) + " valores pares");
    out.flush();
    /*
     * Scanner input = new Scanner(System.in);
     * 
     * int a = 0;
     * int n1 = 1;
     * int cont = 0;
     * 
     * do {
     * a = input.nextInt();
     * n1++;
     * if (a % 2 == 0)
     * cont++;
     * } while (n1 < 6);
     * System.out.println(cont + " valores pares");
     */
  }
}
