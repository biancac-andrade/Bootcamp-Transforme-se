package Exercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Executa {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    double[] nota = new double[4];

    for (int i = 0; i <= 3; i++) {
      System.out.println("Informe a sua nota " + i);

      nota[i] = entrada.nextDouble();

    }


    System.out.println(Arrays.toString(nota));

    entrada.close();
  }
}
