package Array;

import java.util.Arrays;

public class ArrayExemplo1 {
  public static void main(String[] args) {
    
    // para criar um arra
    int[] idades = new int[4];
    
    // para atribuir valores

    idades[0] = 5;
    idades[1] = 4;
    idades[2] = 6;
    idades[3] = 6;
    
    
    //  jeito errado
    System.out.println(idades[0]);
    System.out.println(idades[1]);
    System.out.println(idades[2]);
    System.out.println(idades[3]);


    // jeito certo
  System.out.println(Arrays.toString(idades));
    
  }
  
}
