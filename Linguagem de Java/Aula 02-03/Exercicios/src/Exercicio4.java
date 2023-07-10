import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int somaTudo = 0;

    for( int repete = 1; repete <= 4; repete++){
            System.out.println("Digite um valor par: ");
            int num = entrada.nextInt();
            if(num % 2 == 0){
                somaTudo += num;
            }else {
                repete --;
            }

        }
    System.out.println("Soma dos valores pares: " + somaTudo);
        entrada.close();
    }
}

