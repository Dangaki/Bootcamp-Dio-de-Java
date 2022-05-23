package br.com.oo.modelo;

public class ClasseFilha2 extends ClasseMae{
    public ClasseFilha2(String nome) {
        super(nome);
    }

    @Override
    public void metodo1() {
        System.out.println("Metodo1 - Filha2");
    }

    @Override
    public void metodo2() {
        System.out.println("Metodo2 - Filha2");
    }
}
