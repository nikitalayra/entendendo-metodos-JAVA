package one.digitalInnovation.basecamp;

/**
 * Classe principal dos exercicios da Aula 01 de Métodos.
 */

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3,6);
        Calculadora.multiplicacao(7,8);
        Calculadora.dividir(5, 2.5);
        Calculadora.subtrair(9, 1.8);

        // Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}