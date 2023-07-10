import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       int somaNumeros = 0;

       while (somaNumeros < 100){
           System.out.print("Escolhe um numero: ");
           int numero = entrada.nextInt();

           somaNumeros += numero;


       }
        System.out.println("Soma dos numeros é : " + somaNumeros);
       entrada.close();
    }

}
