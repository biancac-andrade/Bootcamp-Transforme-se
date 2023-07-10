import java.util.Scanner;

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int digite;
        int somaTudo = 0;

        do{
            System.out.println("Digita um numero");
            int num = entrada.nextInt();

            somaTudo += num;

            System.out.println("Quer escolher outro numero 1-sim 2-Não");
            digite = entrada.nextInt();
        }while (digite != 2);

        System.out.println("Soma dos numeros escolhido é : " + somaTudo);
        entrada.close();

    }
}
