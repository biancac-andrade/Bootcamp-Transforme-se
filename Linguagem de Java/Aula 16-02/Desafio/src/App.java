import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
      int numero;

      
      Scanner entrada = new Scanner(System.in);
     System.out.println("-------PAR ou IMPAR -------- ");
      System.out.println("Escolhe o numero: ");
      numero = entrada.nextInt();
      
      if (numero % 2 == 0)        
          System.out.printf("O numero %d é par", numero);
      else
        System.out.printf("O numero %d é impar", numero);
      
    }
}
