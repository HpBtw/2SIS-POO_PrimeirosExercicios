package ex01;

import java.util.Scanner;

public class Aluno {
    // atributos ou propriedades ou variáveis de instância
    int rm;
    String nome;
    double nota1;
    double nota2;
    double media;
    // quando e atributo é bom declarar uma em cada linha mesmo se for do mesmo tipo

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String situacao() {
        String situacao;

        if (media >= 7) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }

        return situacao;
    }
}
