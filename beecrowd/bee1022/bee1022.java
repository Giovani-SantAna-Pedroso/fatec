import java.io.IOException;
import java.lang.Math.*;
import java.net.URI;
import java.util.Scanner;

public class bee1022 {

  public static int mdc(int a, int b) {
    if (b == 0) {
      return a;
    }
    return mdc(b, a % b);
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numOfCases = input.nextInt();
    for (int i = numOfCases; i >= 0; i--) {
      String operation = input.nextLine();
      String[] operationData = operation.split(" ");

      // Jump the buffer
      if (operationData.length == 1)
        continue;

      //
      String operationType = operationData[3];
      int n1 = Integer.parseInt(operationData[0]);
      int d1 = Integer.parseInt(operationData[2]);
      int n2 = Integer.parseInt(operationData[4]);
      int d2 = Integer.parseInt(operationData[6]);
      //
      int nr = 0;
      int dr = 0;
      String isNegative = "";

      /*
       * Sum: (N1*D2 + N2*D1) / (D1*D2)
       * Subtraction: (N1*D2 - N2*D1) / (D1*D2)
       * Multiplication: (N1*N2) / (D1*D2)
       * Division: (N1/D1) / (N2/D2), that means (N1*D2)/(N2*D1)
       */
      if (operationType.equals("+")) {
        nr = ((n1 * d2) + (n2 * d1));
        dr = ((d1 * d2));
      }
      if (operationType.equals("-")) {
        nr = ((n1 * d2) - (n2 * d1));
        dr = ((d1 * d2));

      }
      if (operationType.equals("*")) {
        nr = (n1 * n2);
        dr = (d1 * d2);
      }
      if (operationType.equals("/")) {
        nr = ((n1 * d2));
        dr = ((n2 * d1));
      } else {

      }
      if (nr < 0) {
        isNegative = "-";
        nr *= -1;
      }
      if (dr < 0) {
        isNegative = "-";
        dr *= -1;
      }

      int factor = mdc(nr, dr);
      System.out.printf("%s%s/%s = %s%s/%s\n", isNegative, nr, dr, isNegative, nr / factor, dr / factor);
      //
      // // System.out.println(operation);
    }

  }
}
