package Array;

import java.util.Scanner;

public class ArrayExemplo2 {
   public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

            double[] notas = new double[4];

            for(int i = 0; i < notas.length; i++) {
                System.out.println("Informe a nota " + i);
                notas[i] = entrada.nextDouble();

            }

        entrada.close();
}
}
