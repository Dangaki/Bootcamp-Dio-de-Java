package br.com.oo.principal;

import br.com.oo.modelo.Faxineiro;
import br.com.oo.modelo.Funcionario;
import br.com.oo.modelo.Gerente;
import br.com.oo.modelo.Vendedor;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        // UpCasting implicito
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Downcasting explicito !!EVITAR!!
        //Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}
