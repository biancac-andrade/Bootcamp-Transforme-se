import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      String nome, modelo;
      int mes1, mes2,mes3;
      float soma, media, resto;
    
      Scanner entrada = new Scanner(System.in);
        System.out.println("Qual nome da sua empresa? ");
        nome = entrada.next();

         System.out.println("Qual é o modelo de trabalho da sua empresa ");
        modelo= entrada.next();

         System.out.println("Qual foi a quantidade de cleinte do seu primeiro mes ");
         mes1 = entrada.nextInt();
         System.out.println("Qual foi a quantidade de cleinte do seu segundo mes ");
         mes2 = entrada.nextInt();
         System.out.println("Qual foi a quantidade de cleinte do seu terceiro mes ");
         mes3 = entrada.nextInt();
      
      
         soma = mes1 + mes2 + mes3;
         media = soma / 3;
         resto = soma % 3;


         System.out.printf(" A empresa %s que tem o modelo como %s tem um total dos primeiros meses são %.2f de clientes  %n",
             nome, modelo, soma);
      
         System.out.printf("A media dos cliente é  %.2f clientes e a restante da media é  %.2f clientes %n ", media, resto);    
    }
}

