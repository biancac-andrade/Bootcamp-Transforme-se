import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      double a, b, soma, multi, sub, divi;
      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite o primeiro numero: ");
      a = entrada.nextDouble();
      System.out.println("Digite o segundo numero: ");
      b = entrada.nextDouble();


      
      
      soma = a + b;
      multi = a * b;
      divi = a / b;
      sub = a - b;
      
 System.out.println("-------OPERACOES MATEMATICA -------- ");
      System.out.println("O primeiro valor escolhido é " + a);
      System.out.println("O segundo valor escolhido é " + b);
      System.out.println("Resultado da soma é:  " + soma);
      System.out.println("Resultado da multiplicação é:  " + multi);
      System.out.println("Resultado da subtracao é:  " + sub);
      System.out.println("Resultado da divisão é:  " + divi);

      entrada.close();
    }
}
