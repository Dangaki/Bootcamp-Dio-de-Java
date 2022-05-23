package br.com.oo.modelo;

public class ClasseFilha1 extends ClasseMae{
    public ClasseFilha1(String nome) {
        super(nome);
    }

    @Override
    public void metodo1() {
        System.out.println("Metodo1 - Filha1");
    }
}
