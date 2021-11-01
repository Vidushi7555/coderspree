/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    scn.close();
    int d = toDecimal(n, b);
    System.out.println(d);
  }

  public static int toDecimal(int n, int b) {
    int multiplier = 0, ans_num = 0;
    while (n > 0) {
      int remainder = n % 10;
      n = n / 10;
      ans_num += remainder * Math.pow(b, multiplier);
      multiplier++;
    }
    return ans_num;
  }
}