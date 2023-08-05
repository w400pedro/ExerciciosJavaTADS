// Exercício 1
// • Faça um programa que calcule a média final em uma disciplina.
// • O usuário deverá informar o valor obtido em duas provas e em dois
// trabalhos.
// • A média final é a média ponderada de peso 0,3 para cada prova e 0,2
// para cada trabalho.
// • O programa deve exibir todas as notas informadas pelo usuário e o
// valor da média final.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double prova1, prova2, trab1, trab2, mediaponderada;

    System.out.println("Digite a nota da prova 1");
    prova1 = in.nextInt();
    
    System.out.println("Digite a nota da prova 2");
    prova2 = in.nextInt();

    System.out.println("Digite a nota do trabalho 1");
    trab1 = in.nextInt();

    System.out.println("Digite a nota do trabalho 2");
    trab2 = in.nextInt();

    mediaponderada = (prova1 * 0.3) + (prova2 * 0.3) + (trab1 * 0.2) + (trab2 * 0.2);

    System.out.println("A média ponderada foi "+ mediaponderada);

  }
}
