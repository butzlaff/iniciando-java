package edu.butzlaff.variables;

public class Learning {

  int integer = 10;              // range: -2,147,483,648 to 2,147,483,647
  float floating = 10.5F;        // range: 1.4e-045 to 3.4e+038 or 6-7 decimal digits (4 bytes)
  double decimal = 10.5;         // range: 4.9e-324 to 1.8e+308 or 15 decimal digits (8 bytes)
  char character = 'a';          // range: 0 to 65,536 (unsigned) 
  boolean bool = true;           // range: true or false
  String text = "Hello";         // range: 0 to 2^16-1 or 0 to 65,535 
  short shortInteger = 10;       // range: -32,768 to 32,767
  byte byteInteger = 10;         // range: -128 to 127
  long longInteger = 1000000000L;// range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

  public static void main(String[] args) {
    System.out.print("Olá, aqui estou aprendendo sobre variáveis!\n");

    // chamando a função MyMethod
    Casting((short) 10);
    // Casting(10); => não funciona, pois o valor 10 é um int e não um short, precisando do casting
  }

  public static void Casting(short newNumber) {
    short shortNumber = newNumber;
    int intNumber = shortNumber; // automatic casting: short to int
    short anotherShortNumber = (short) intNumber; // manual casting: int to short
    System.out.println(anotherShortNumber);
  }

  // var Integer (variável)
  int myNum = 5;               
  // const Integer (constante) por convenção, nomes de constantes são escritos em letras maiúsculas
  // Utilizamos a regra de nomenclatura de variáveis para constantes com _ separando as palavras 
  // Por exemplo: final int MIN_PER_HOUR = 60; ou final double PI = 3.14; final String MY_NAME = "Emilio";
  // constante em Java é definida com a palavra-chave (reservada) final
  final int MY_NUM = 15;       
}
