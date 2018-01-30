package edu.cnm.deepdive;

public class Test {

  public static void main(String[] args) {
    Composable tester = new McNugget;
    int[] packSizes = {6, 9, 20};
    for (int i = 1; i < 100; i++) {
      System.out.printf("%d\t%b%n", i, tester.test(i, packSizes));
    }
  }
}
