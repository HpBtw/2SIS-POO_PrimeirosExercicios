package ex01;

import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        double corte = 7;

        Scanner kb = new Scanner(System.in);
        Aluno al = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        al.nome = kb.next();

        System.out.print("Digite o RM do aluno: ");
        al.rm = kb.nextInt();

        System.out.print("Digite a nota 1 do aluno: ");
        al.nota1 = kb.nextDouble();

        System.out.print("Digite a nota 2 do aluno: ");
        al.nota2 = kb.nextDouble();

        al.media = al.calcularMedia();
        String situacao = al.situacao();

        System.out.println("\nAluno(a): " + al.nome);
        System.out.println("RM: " + al.rm);
        System.out.println("Média: " + al.media);
        System.out.println("Situação: " + situacao);

    }
}
