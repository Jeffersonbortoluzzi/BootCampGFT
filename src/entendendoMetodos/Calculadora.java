package entendendoMetodos;

import java.util.Scanner;

public class Calculadora {

    public static void soma(double n1, double n2) {

        double resultado = n1 + n2;

        System.out.println("A subtração é: " + n1 + " menos " + n2 + " resultado = " + resultado);
    }

    public static void subtracao(double n1, double n2) {

        double resultado = n1 - n2;

        System.out.println("A subtração é: " + n1 + " menos " + n2 + " resultado = " + resultado);
    }

    public static void multiplicacao(double n1, double n2) {

        double resultado = n1 * n2;

        System.out.println("A multiplicação é: " + n1 + " vezes " + n2 + " resultado = " + resultado);
    }

    public static void divisao(double n1, double n2) {

        double resultado = n1 / n2;

        System.out.println("A divisão é: " + n1 + " por " + n2 + " resultado = " + resultado);
    }
}
