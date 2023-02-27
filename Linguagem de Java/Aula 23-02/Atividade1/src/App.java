import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {


      int qtdDias, dataVenc, dataAtual;
      double valor, multa;


      Scanner entrada = new Scanner(System.in);
      System.out.println("Qual o dia do vencimento? ");
      dataVenc = entrada.nextInt();
      

      System.out.println("Qual o dia de pagamento hoje? ");
      dataAtual = entrada.nextInt();

      System.out.println("Qual o valor original? ");
      valor = entrada.nextInt();

      qtdDias = dataAtual - dataVenc;

        
      if (qtdDias <= 10) {
        multa = valor + (qtdDias * 1);

        System.out.println("Está entre os 10 dias atrasado, então o valor da sua multa é: " + multa);
      }
      if (qtdDias > 10) {
        multa = valor + (qtdDias * 1.50);
        System.out.println("Está mais 10 dias atrasado, então o valor da sua multa é: " + multa + " reais");
      } else {

        System.out.println("voce não tem multa");
      }
      
      entrada.close();
    }
}
