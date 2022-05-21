package br.com.modelo;

public class Mensagem {

    public static void saudacaoMensagem(int horas){
        System.out.println(clasificaMensagem(horas));
    }

    private static String clasificaMensagem(int horas){

      if(horas < 0 || horas > 23)
          return "Horario invalido!";

      if (horas >= 5 && horas <= 12)
          return "Bom Dia!";

      if (horas >= 13 && horas <= 17)
          return "Boa Tarde!";

      if ((horas >= 18 && horas <= 23)  || (horas >= 0 && horas <= 4))
          return "Boa Noite!";

      return null;
  }
}
