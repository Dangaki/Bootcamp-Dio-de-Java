package br.com.ioc;

public class Pedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.gravar();
    }

    private  EnviarEmail enviar = EnviarEmail.obterDadosEmail();
    //private  EnviarEmail enviar;

    public void gravar(){
        this.enviar.retornar("Pedido criado!");
    }
}
