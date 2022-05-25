package br.com.primeiroprojeto.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @GetMapping("/")
    public String mensagem(){
        return "Primeiro projeto Spring Boot Web";
    }

}
