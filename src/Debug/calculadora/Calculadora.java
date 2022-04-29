package Debug.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.println("Digite o primeiro valor: ");
        b = sc.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("Somar: " + somar);
        System.out.println("subtrair: " + subtrair);
        System.out.println("multiplicar: " + multiplicar);
        System.out.println("dividir: " + dividir);
    }

    //    metodos
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
