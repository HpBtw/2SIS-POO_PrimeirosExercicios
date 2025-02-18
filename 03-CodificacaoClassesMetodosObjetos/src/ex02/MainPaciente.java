package ex02;

import java.util.Scanner;

public class MainPaciente {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Paciente pa = new Paciente();

        System.out.print("Digite o nome do paciente: ");
        pa.nome = kb.next();

        System.out.print("Digite a idade do paciente: " );
        pa.idade = kb.nextInt();

        pa.frequenciaMaxima = pa.calcularPressaoMaxima();
        pa.recomendadoMinimo = pa.calcularRecomendadoMinimo(pa.frequenciaMaxima);
        pa.recomendadoMaximo = pa.calcularRecomendadoMaximo(pa.frequenciaMaxima);

        System.out.println("\nNome do paciente: " + pa.nome);
        System.out.println("Idade do paciente: " + pa.idade);
        System.out.println("Frequência cardíaca máxima: " + pa.frequenciaMaxima);
        System.out.println("Frequência alvo entre: " + pa.recomendadoMinimo + " e " + pa.recomendadoMaximo);
    }
}
