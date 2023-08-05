// Exercício 6
// • Considere a definição da série harmônica abaixo:
// • Escreva um programa que leia um número inteiro positivo n e
// calcule 𝐻𝑛.
// • Exemplo: Se n = 3, então o valor de 𝐻𝑛 deve ser 1.833333.
import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n;
    double c = 1.0;
    double harmonica = 0;

    System.out.println("Digite o valor de n");
    n = in.nextInt();

    while (c <= n) {
      if (c == 1) {
        harmonica = harmonica + 1;
      }
      if (c > 1) {
        harmonica = harmonica + (1.0 / c);
      }
      c++;
    }

    System.out.println("A série harmônica é: " + harmonica);

  }
}