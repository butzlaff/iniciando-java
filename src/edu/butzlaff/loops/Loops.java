package edu.butzlaff.loops;

public class Loops {
  public static void main(String[] args) {
    System.out.println("While loop:");
    whileLoop();
    
    System.out.println("For loop:");
    forLoop();

    System.out.println("For each loop:");
    forEachLoop();
  }

  // repetições
  // while
  public static void whileLoop() {
    int number = 0;
    while (number < 10) {
      System.out.println(number);
      number++;
    }
  }
  // for
  public static void forLoop() {
    for (int number = 0; number < 10; number++) {
      System.out.println(number);
    }
  }

  //foreach
  public static void forEachLoop() {
    int[] numbers = { 1, 2, 3, 4, 5 };
    for (int number : numbers) {
      System.out.println(number);
    }
  }

}
