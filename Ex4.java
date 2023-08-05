// Exercício 4
// • Faça um programa para verificar se determinado número inteiro lido
// é divisível por 3 ou 5, mas não simultaneamente pelos dois.

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  

    int numero;

    System.out.println("Digite o número");
    numero = in.nextInt();

    if(numero % 3 == 0 && numero % 5 != 0){
      System.out.println("Número é divisivel por 3");
    }else if(numero % 5 == 0 && numero % 3 != 0){
      System.out.println("Número é divisivel por 5");
    }else if(numero % 5 ==0 && numero % 3 == 0){
      System.out.println("O número é divisivel por ambos");
    }else{
      System.out.println("O valor não é divisivel nem por 3 nem por 5");
    }


    }
  }