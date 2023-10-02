package edu.butzlaff.operators;

public class Operators {
  double sum = 0.5 + 1.5;  // operador de soma (+)
  int difference = 10 - 1; // operador de subtração (-)
  double product = 2.5 * 2; // operador de multiplicação (*)
  double quotient = 10 / 2; // operador de divisão (/)
  int remainder = 10 % 3; // operador de resto (%)
  double result = (2.5 * 2 + 10) / (2 - 10 % 3); // operadores combinados
  double exponentiation = Math.pow(2, 3); // operador de exponenciação

  public static void main(String[] args) {
    Operators operators = new Operators();
    System.out.println("Sum: " + operators.sum);
    System.out.println("Difference: " + operators.difference);
    System.out.println("Product: " + operators.product);
    System.out.println("Quotient: " + operators.quotient);
    System.out.println("Remainder: " + operators.remainder);
    System.out.println("Result: " + operators.result);

    System.out.println("Increment: " + increment());
    System.out.println("Decrement: " + decrement());
    System.out.println("Positive: " + positive());
    System.out.println("Negative: " + negative());
    System.out.println("Negation: " + negation());


    System.out.println("If ternário: " + ifTernario(10));
  }

  // operadores unários = operadores que atuam em apenas um operando

  public static int increment() {
    int number = 10;
    number++; // operador de incremento (++)
    return number;
  }

  public static int decrement() {
    int number = 10;
    number--; // operador de decremento (--)
    return number;
  }

  public static int positive() {
    int number = -10;
    // Para transformar um número negativo em positivo, podemos usar o operador de negativo (-) sucessivamente duas vezes
    // Ou podemos usar também a multiplicação por -1
    // number = number * -1;
    number = -number; 
    return number;
  }

  public static int negative() {
    int number = 10;
    number = -number; // operador de negativo (-)
    return number;
  }

  public static boolean negation() {
    boolean isTrue = true;
    isTrue = !isTrue; // operador de negação (!)
    return isTrue;
  }

  public static String ifTernario(int number) {
    String result = number > 10 ? "Maior que 10" : "Menor ou igual a 10";
    return result;
  }
}
