package br.com.modelo;

public class Calculadora {
    public static void Somar(double x, double y){
        double resultado = x + y;
        System.out.println("A Soma de " + x + " por " + y +" é " + resultado);
    }

    public static void Subtrair(double x, double y){
        double resultado = x - y;
        System.out.println("A Subtração de " + x + " por " + y +" é " + resultado);
    }

    public static void Multiplicar(double x, double y){
        double resultado = x * y;
        System.out.println("A Multiplicação de " + x + " por " + y +" é " + resultado);
    }

    public static void Dividir(double x, double y){
        double resultado = x / y;
        System.out.println("A Divisão de " + x + " por " + y +" é " + resultado);
    }
}
