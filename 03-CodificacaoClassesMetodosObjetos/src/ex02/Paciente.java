package ex02;

public class Paciente {
    String nome;
    int idade;
    double frequenciaMaxima;
    double recomendadoMinimo;
    double recomendadoMaximo;

    public double calcularPressaoMaxima() {
        return frequenciaMaxima = 220 - idade;
    }

    public double calcularRecomendadoMinimo(double pressaoMaxima) {
        double recomendadoMinimo;

        return recomendadoMinimo = pressaoMaxima * .5;
    }

    public double calcularRecomendadoMaximo(double pressaoMaxima) {
        double recomendadoMaximo;

        return recomendadoMaximo = pressaoMaxima * .85;
    }
}
