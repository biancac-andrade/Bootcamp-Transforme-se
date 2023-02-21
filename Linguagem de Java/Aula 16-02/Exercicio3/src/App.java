import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      String nome, sobrenome, time;
      int anoAtual, anoNasci, idade;

      
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite o seu nome: ");
      nome= entrada.next();
      System.out.println("Digite seu sobrenome: ");
      sobrenome = entrada.next();

      System.out.println("Digite o ano atual hoje ");
      anoAtual =  entrada.nextInt();
      System.out.println("Digite seu ano de nascimento: ");
      anoNasci = entrada.nextInt();

       System.out.println("Digite seu time favorito: ");
      time = entrada.next();


      idade = anoAtual - anoNasci;
      
 System.out.println("-------DADOS CLIENTE-------- ");
      System.out.printf("O seu nome é %s e o seu sobrenome é %s  %n", nome, sobrenome);
      System.out.printf(" O ano de nascimento do %s foi em %d então a sua idade hoje é %d  %n ", nome, anoNasci, idade);
      System.out.printf("Em pleno ano %d o seu time favorito é %s  %n", anoAtual, time);


    }
}
