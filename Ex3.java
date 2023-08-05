// Exercício 3
// • Faça um programa que leia a altura e o peso de uma pessoa. De
// acordo com uma tabela, verifique e mostre qual a classificação
// dessa pessoa.

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double altura, peso;

    System.out.println("Digite a sua altura");
    altura = in.nextDouble();

    System.out.println("Digite o seu peso");
    peso = in.nextDouble();

    if (altura < 1.20) {
      if (peso <= 60) {
        System.out.println("Sua classificação é A");
      }

      if (peso > 60 && peso <= 90) {
        System.out.println("Sua classificação é D");
      }

      if (peso > 90) {
        System.out.println("Sua classificação é G");
      }

    }
    if (altura >= 1.20 && altura <= 1.70) {
      if (peso <= 60) {
        System.out.println("Sua classificação é B");
      }

      if (peso > 60 && peso <= 90) {
        System.out.println("Sua classificação é E");
      }

      if (peso > 90) {
        System.out.println("Sua classificação é F");
      }

    }

    if (altura > 1.70) {
      if (peso <= 60) {
        System.out.println("Sua classificação é C");
      }

      if (peso > 60 && peso <= 90) {
        System.out.println("Sua classificação é F");
      }

      if (peso > 90) {
        System.out.println("Sua classificação é I");
      }

    }

  }
}
