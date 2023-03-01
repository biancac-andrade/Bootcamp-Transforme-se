import java.util.Scanner;

public class correcao {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Informa o valor do boleto");

    double valorBoleto = entrada.nextDouble();

    System.out.println("Informa o dia do boleto");

   int diaVencimento = entrada.nextInt();

    System.out.println("Informa o dia do pagamento");

    int diaPagamento = entrada.nextInt();

   
    int diaEmAtraso = diaPagamento - diaVencimento ;

    
    if (diaVencimento >= diaPagamento) {
      System.out.println("Obrigada, o seu boleto foi pago sem juros");
      // aqui to verificando se o dia do pagamento é valido
    }  else if(diaPagamento < 1  || diaPagamento < 31){
System.out.println("O  dia de pagamento é invalido");
    } else if (diaPagamento < 1 || diaPagamento > 31) {
      System.out.println("O  dia de pagamento é invalido");


    } else if (diaVencimento < diaPagamento && diaEmAtraso <= 10) {

      // Aqui estou calculando os juros
      double juros = diaEmAtraso * 1.00;
// Aqui estou somando o juro no valor do boleto
double valorCorrigido = valorBoleto + juros;
      System.out.println("O valor do boleto corrigido é: " + valorCorrigido);
      
    } else if(diaVencimento < diaPagamento && diaEmAtraso > 10){

      // Aqui estou calculando os juros
      double juros = diaEmAtraso * 1.50;
// Aqui estou somando o juro no valor do boleto
double valorCorrigido = valorBoleto + juros;
      System.out.println("O valor do boleto corrigido é: " + valorCorrigido);
    }
    entrada.close();
  }
}
