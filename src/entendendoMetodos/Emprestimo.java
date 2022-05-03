package entendendoMetodos;

public class Emprestimo {

    public static double getDuasParcelas() {
        return 5;
    }

    public static double getTresParcelas() {
        return 10;
    }

    public static double getTaxaCincoParcelas() {
        return 0.5;
    }

    public static double getTaxaDezParcelas() {
        return 1.25;
    }

    public static void calcular(String[] args) {

    }

    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2) {
            double valorFinal = valor + (valor * getDuasParcelas());
            System.out.println("Valor final do empréstimo para 2 parcelas: R$" + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTresParcelas());
            System.out.println("Valor final do empréstimo para 3 parcelas: R$" + valorFinal);
        } else {
            System.out.println("Vai pagar à vista?. ");
        }
    }
}
