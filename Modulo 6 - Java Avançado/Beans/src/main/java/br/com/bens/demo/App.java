package br.com.bens.demo;

import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Duna");
        livro.setCodigo("ASD2F13A2SD1F");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("Frank Herbert");

        livro.setAutorLivro(autor);

        livro.exibir();

        ((AbstractApplicationContext)factory).close();

    }
}
