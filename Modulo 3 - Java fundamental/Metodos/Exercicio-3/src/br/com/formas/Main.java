package br.com.formas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Area do quadrado: " + Quadrilatero.calculaArea(3));
        System.out.println("Area do retangulo: " + Quadrilatero.calculaArea(5d,5d));
        System.out.println("Area do trapezio: " + Quadrilatero.calculaArea(7,8, 9));
        System.out.println("Area do losangulo: " + Quadrilatero.calculaArea(5f,5f));
    }
}
