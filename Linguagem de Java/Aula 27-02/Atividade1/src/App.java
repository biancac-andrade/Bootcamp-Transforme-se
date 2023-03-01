import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class App {
  public static void main(String[] args) throws Exception {
    Calendar c1 = Calendar.getInstance();
    String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		  int hora = c1.get(Calendar.HOUR_OF_DAY);
      System.out.println(hora);
      String tipo, nome;

      Scanner entrada = new Scanner(System.in);


      System.out.printf("Você possui CPF ou CPNJ ?");
      tipo = entrada.next();

       System.out.printf("Qual o seu nome fisica ou juridica ?");
      nome = entrada.next();
    
    
        
 if (hora > 6 && hora < 12) {
        if( tipo.equals("CPF")) {
			System.out.printf("Bom Dia %s, tudo bem? %n  voce é uma pessoa fisica %n . Hoje é dia %s", nome, timeStamp );

        }else {
			System.out.printf("Bom Dia %s, tudo bem? %n  voce é uma pessoa juridica %n . Hoje é dia %s", nome, timeStamp );

        }
}else if(hora > 12 && hora < 18){
   if( tipo.equals("CPF")) {
			System.out.printf("Boa tarde %s, tudo bem? %n  voce é uma pessoa fisica %n . Hoje é dia %s", nome, timeStamp );

        }else {
			System.out.printf("Boa tarde %s, tudo bem? %n  voce é uma pessoa juridica %n . Hoje é dia %s", nome, timeStamp );

        }
 } else {
            if( tipo.equals("CPF")){
			System.out.printf("Boa noite %s, tudo bem? %n  voce é uma pessoa fisica %n . Hoje é dia %s", nome, timeStamp );

        }else {
			System.out.printf("Boa noite %s, tudo bem? %n  voce é uma pessoa juridica %n . Hoje é dia %s", nome, timeStamp );

        }
  }
    
    entrada.close();
	}
}
