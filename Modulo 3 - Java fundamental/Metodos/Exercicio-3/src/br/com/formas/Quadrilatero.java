package br.com.formas;

public class Quadrilatero {

    public static double calculaArea(double lado){
        return  lado * lado;
    }

    public static double calculaArea(double lado1, double lado2){
        return  lado1 * lado2;
    }

    public static double calculaArea(double ladoMaior, double ladoMenor, double altura){
        return ((ladoMaior + ladoMenor) * altura )/2;
    }
    public static float calculaArea(float diagonalMenor, float diagonalMaior){
        return (diagonalMenor * diagonalMaior) / 2;
    }


}
