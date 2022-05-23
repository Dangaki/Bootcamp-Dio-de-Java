package br.com.exercicio.principal;

import br.com.exercicio.modelo.Carro;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Amarelo", "Fusca", 50);
        System.out.println("Preço para o tanque cheio é de R$ "+ carro1.valorTanqueCheio(5.5) + "\n");

        Carro carro2 = new Carro();

        carro2.setCor("Preto");
        carro2.setModelo("Camaro");
        carro2.setCapacidadeTanque(100);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());

        System.out.println("Preço para o tanque cheio é de R$ "+ carro2.valorTanqueCheio(5.5));

    }
}
