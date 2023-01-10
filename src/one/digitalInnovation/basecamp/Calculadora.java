package one.digitalInnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 01 de Métodos.
 */

public class Calculadora {
    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicacao de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void dividir(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
    }

    public static void subtrair(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtração de " + numero1 + " menos " + numero2 + " é " + resultado);
    }
}
