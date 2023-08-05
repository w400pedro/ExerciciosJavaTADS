// Exercício 7
// • Faça um programa que leia um valor A e um valor N, e depois
// imprima a soma dos N números inteiros a partir de A (inclusive).
// • Caso N seja negativo ou ZERO, deverá ser lido um novo N.
// • Exemplo: Se A = 10 e N = 5, deve-se mostrar “Soma = 60” (pois 10 +
// 11 + 12 + 13 + 14 = 60).

import java.util.Scanner;

public class Ex7 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a, n;
    int c = 0;
    System.out.println("Digite o valor a");
    a = in.nextInt();
    
    System.out.println("Digite o valor n");
    n = in.nextInt();

    while(n<= 0){
    System.out.println("Digite novamente o valor n");
    n = in.nextInt();
    }
    int soma = 0;

    while (c < n) {
      if (c == 0) {
        soma = a;
      } else {
        soma = soma + a + c ;
      }
      c++;
    }

    System.out.println("A soma dos valores é: " + soma);

  }
}
