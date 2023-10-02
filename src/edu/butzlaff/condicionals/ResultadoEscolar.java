package edu.butzlaff.condicionals;

public class ResultadoEscolar {
  public static void main(String[] args) {
    double nota = 7.0;
    // if (nota >= 7.0) {
    //   System.out.println("Aprovado!");
    // } else if (nota >= 5.0) {
    //   System.out.println("Recuperação!");
    // } else {
    //   System.out.println("Reprovado!");
    // }
    
    // String resultado = nota > 7 ? "Aprovado!" : "Reprovado!";

    String resultado = nota > 7 ? "Aprovado!" : nota > 5 ? "Recuperação!" : "Reprovado!";

    System.out.println(resultado);
  }
}
