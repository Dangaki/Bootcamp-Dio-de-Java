package br.com.formas;

public class Quadrilatero {

    public static void calculaArea(double lado){
        double area =  lado * lado;
        System.out.println("Area do quadrado: " + area);
    }

    public static void calculaArea(double lado1, double lado2){
        double area =  lado1 * lado2;
        System.out.println("Area do retangulo: " + area);
    }

    public static void calculaArea(double ladoMaior, double ladoMenor, double altura){
        double area =  ((ladoMaior + ladoMenor) * altura )/2;
        System.out.println("Area do trapezio: " + area);
    }
    public static void calculaArea(float diagonalMenor, float diagonalMaior){
        double area =  (diagonalMenor * diagonalMaior) / 2;
        System.out.println("Area do losangulo: " + area);
    }


}
