import java.io.*;
import java.io.InputStreamReader;

public class c {

  public static void main(String[] args) throws IOException {
    // WIth for 0.032
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    int firstN = Integer.parseInt(input.readLine());
    int secondN = Integer.parseInt(input.readLine());
    int tmp = 0;

    // put the values in order
    if (firstN > secondN) {
      tmp = firstN;
      firstN = secondN;
      secondN = tmp;
    }

    int sumOfOdds = 0;

    for (int i = firstN + 1; i < secondN; i++) {
      sumOfOdds += i % 2 == 0 ? 0 : i;
    }

    out.println(sumOfOdds);
    out.flush();
  }
}
