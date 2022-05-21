package br.com.principal;
import br.com.modelo.Calculadora;
import br.com.modelo.Emprestimo;
import br.com.modelo.Mensagem;

public class Main {
    public static void main(String[] args) {

        System.out.println("CALCULADORA");
        Calculadora.Somar(6,3);
        Calculadora.Subtrair(6,3);
        Calculadora.Dividir(6,3);
        Calculadora.Multiplicar(6,3);

        System.out.println("\nMENSAGEM");
        Mensagem.saudacaoMensagem(1);
        Mensagem.saudacaoMensagem(9);
        Mensagem.saudacaoMensagem(14);
        Mensagem.saudacaoMensagem(23);

        System.out.println("\nEMPRESTIMO");
        Emprestimo.calcular(1000, 0);
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, 5);
        Emprestimo.calcular(1000, 10);
    }
}
