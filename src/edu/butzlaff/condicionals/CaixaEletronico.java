package edu.butzlaff.condicionals;

public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 1000.0;
    double saque = 100.0;
    System.out.println("Saldo atual: " + saldo);
    if (saldo >= saque) {
      saldo = saldo - saque;
      System.out.println("Saque realizado com sucesso!");
    } else {
      System.out.println("Saldo insuficiente!");
    }

    System.out.println("Saldo atual: " + saldo);
  }
}
