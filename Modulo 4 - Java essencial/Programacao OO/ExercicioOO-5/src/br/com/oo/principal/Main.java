package br.com.oo.principal;

import br.com.oo.model.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.soma(6,3);
        calculadora.subtacao(6,3);
        calculadora.multiplicacao(6,3);
        calculadora.divisao(6,3);
    }
}
