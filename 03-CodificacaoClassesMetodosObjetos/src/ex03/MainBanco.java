package ex03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainBanco {
    public static void main(String[] args) {
        int agenciaCorreta = 1010;
        int opcao;

        Scanner kb = new Scanner(System.in);
        Banco ba = new Banco();

        System.out.print("Digite a agência: ");
        ba.agencia = kb.nextInt();

        if (ba.agencia != agenciaCorreta) {
            System.err.println("A agência não coincide com nenhum banco cadastrado!");
        } else {
            System.out.print("Digite seu nome: ");
            ba.nome = kb.next();

            System.out.print("Caro(a) " + ba.nome + ", digite sua idade:");
            ba.idade = kb.nextInt();

            System.out.print("Digite sua conta corrente: ");
            ba.contaCorrente = kb.nextInt();

            while (opcao != 4) {
                System.out.print("\nNome: " + ba.nome);
                System.out.print("Idade: " + ba.idade);
                System.out.print("Conta corrente : " + ba.contaCorrente);
                System.out.print("Saldo");
            }
        }
    }
}
