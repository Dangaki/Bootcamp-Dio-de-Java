package br.com.exercicio.modelo;

public class Carro {
    private String cor;
    private String modelo;
    private double capacidadeTanque;

    public Carro() {

    }

    public Carro(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public Carro(String cor, String modelo, float capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public double valorTanqueCheio(double preco){
         return preco * this.capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(float capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
}
