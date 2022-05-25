package br.com.ioc;

public class EnviarEmail {
    public EnviarEmail(String tipo, String endereco, String senha){
    }

    public static EnviarEmail obterDadosEmail(){
        return new EnviarEmail("Testando", "novoemail@email.com", "1234");
    }

    public void retornar(String mensagem){
        System.out.println("Email enviado!");
    }
}
