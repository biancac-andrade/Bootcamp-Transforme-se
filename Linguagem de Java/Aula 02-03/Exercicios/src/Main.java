import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int somaTudo = 0;
        for(int repetir = 1; repetir <= 4; repetir++){
            System.out.println("Digite um numero: ");
            int num = entrada.nextInt();

            somaTudo += num;
        }
        System.out.println("O valor da soma dos numeros é" + somaTudo);
    }
}