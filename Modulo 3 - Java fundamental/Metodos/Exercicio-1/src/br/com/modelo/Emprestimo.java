package br.com.modelo;

public class Emprestimo {

    private static double getTaxa(int parcela){
        switch (parcela){
            case 0:
                return 0;
            case 1:
                return 0.2;
            case 2:
                return 0.4;
            case 3:
                return 0.6;
            case 4:
                return 0.8;
            case 5:
                return 1;
            default:
                return -1;
        }
    }

    public static void calcular(double valor, int parcelas){
        double valorFinal, taxa;

        taxa = getTaxa(parcelas);

        if(taxa != -1){
            valorFinal = valor + (valor * taxa);
            System.out.println("Valor Final de " + parcelas + " parcela: R$ " + valorFinal);
        }else{
            System.out.println("Quantidade de parcelas invalida!");
        }
    }
}
