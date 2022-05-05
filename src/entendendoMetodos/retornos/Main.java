package entendendoMetodos.retornos;

import entendendoMetodos.retornos.QuadriLateroR;

public class Main {
    public static void main(String[] args) {

        // retornos

        double areaQuadrado = QuadriLateroR.areaBu(33);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = QuadriLateroR.areaBd(5, 5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = QuadriLateroR.areaBc(3, 4, 5);
        System.out.println("Área do trapézio:" + areaTrapezio);
    }

    public static void test() {

        System.out.println("testando");
    }
    public static double testTwo() {

        System.out.println("testando");
        return 12.8;
    }
}
