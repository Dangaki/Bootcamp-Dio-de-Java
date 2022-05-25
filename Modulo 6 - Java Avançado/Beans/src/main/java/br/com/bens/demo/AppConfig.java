package br.com.bens.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro(){
        return new Livro();
    }
    // <bean id="livro" class="br.com.bens.demo.Livro"/>

    @Bean
    public Autor getAutor(){
        return new Autor();
    }
    // <bean id="autor" class="br.com.bens.demo.Autor"/>

}
