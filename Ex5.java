// Exercício 5
// • Faça um programa que calcule e mostre na tela a soma dos 50
// primeiros números pares maiores que zero.
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  

    int c =0;
    int soma = 0;

    while(c <= 100){
      if(c % 2 == 0){
        soma = soma + c;
      }
      c++;
    }

    System.out.println("A soma dos 50 primeiros números pares é: "+soma);

    }
  }
