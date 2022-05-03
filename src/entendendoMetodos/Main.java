package entendendoMetodos;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(2, 3.4);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.pegarMensagem(7);
        Mensagem.pegarMensagem(16);
        Mensagem.pegarMensagem(3);

        // Empréstimo

        System.out.println("Exercicio empréstimo");
        Emprestimo.calcular(1000.0, (int) Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1800.0, (int) Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
