package entendendoMetodos.retornos;

public class QuadriLateroR {

    public static double areaBu(double lado) {
        return lado * lado;
    }

    public static double areaBd(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double areaBc(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}
