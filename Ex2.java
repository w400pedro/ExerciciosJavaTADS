// Exercício 2
// • Escreva um algoritmo que leia o valor do raio de um círculo, calcule e
// imprima a área do círculo correspondente.
// • A área do círculo é π ∗ raio2
// • Utilize a classe java.lang.Math para obter a constate PI.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  
    double raio;

  System.out.println("Digite o raio");
  raio = in.nextInt();

  double area = Math.PI * Math.pow(raio, 2);

  System.out.println("A área é: "+area);

}
}

