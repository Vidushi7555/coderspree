/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    System.out.println(getValueInBase(n, b));
    scn.close();
  }

  public static int getValueInBase(int n, int b) {
    int ans_num = 0, multiplier = 1;
    while (n > 0)
    {
      int remainder = n % b;
      n = n / b;
      ans_num = ans_num + remainder * multiplier;
      multiplier *= 10;
    }
    return ans_num;
  }
}