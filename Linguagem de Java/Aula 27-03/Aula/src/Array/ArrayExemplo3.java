package Array;

import java.util.Arrays;

public class ArrayExemplo3 {
  public static void main(String[] args) {
    
    // aqui eu criei o array
    int [] idades = new int[3];

    // atribui um valor

    idades[1] = 18;
    idades[0] = 10;
    idades[2] = 20;

    // para mostrar os valores do Array
    System.out.println(Arrays.toString(idades));

    for (int i = 0; i < 3; i++) {
      System.out.println("repetindo" + i + " como valor " + idades[i]);
    }

    for (int idade : idades) {
      System.out.println("Repetindo com foreach: " + idade);
    }

    
      System.out.println(idades[1]);

  }
  
}
