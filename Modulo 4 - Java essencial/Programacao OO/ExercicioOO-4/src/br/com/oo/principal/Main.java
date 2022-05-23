package br.com.oo.principal;

import br.com.oo.modelo.ClasseFilha1;
import br.com.oo.modelo.ClasseFilha2;
import br.com.oo.modelo.ClasseMae;

public class Main {
    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{
                new ClasseFilha1("Primeiro"),
                new ClasseFilha2("Segundo"),
                new ClasseMae("Terceiro")};

        for(ClasseMae classe: classes){
            classe.metodo1();
        }

        System.out.println("");

        for(ClasseMae classe: classes){
            classe.metodo2();
        }

        System.out.println("");

        for(ClasseMae classe: classes){
            if(classe instanceof ClasseMae)
                System.out.println("Mae" );
            if(classe instanceof ClasseFilha1)
                System.out.println("Filha1");
            if(classe instanceof ClasseFilha2)
                System.out.println("Filha2");
            System.out.println("End Loop " + classe.nome);
        }

    }
}
