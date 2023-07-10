package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExemplo4 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    // double[] notas = new double[4];
    double[] notas = new double[quantidade];

    // for( int i = 0; i <= 3; i++){
    for (int i = 0; i <= quantidade; i++){
    
System.out.printf(" informe a nota %d do aluno: " , i + 1);
notas[i] = entrada.nextDouble();

   
    }
    System.out.println(Arrays.toString(notas));
  }
  
}
