package clinicaPet;

import java.util.Scanner;

public class Sistema {
  public static void main(String[] args) {

  Cachorro c1 = new Cachorro();
  c1.nome = "Thor";
  c1.raca = "vira lata";
  c1.idade = 7;
  c1.sexo = "M";
  

  Cachorro c2 = new Cachorro();
  c2.nome = "Spike";
  c2.raca = "Pincher";
  c2.idade = 5;
  c2.sexo = "M";
  System.out.println("O nome é " + c1.nome +  " a raça é " + c1.raca + "a sua idade é" + c1.idade + " o seu sexo é " + c1.sexo);

  // c1.latir("Thor");
  c1.latir("Qualquer", 12);

  c1.mostrarDadosCachorro("Max", "Pastor Alemao", 4, "M");
  c2.mostrarDadosCachorro(c2.nome, c2.raca, c2.idade, c2.sexo);




    Scanner entrada = new Scanner(System.in);
    int verificacao;

    do{
          System.out.println(" Informe o nome do cachorro ");
          String nomeDoCachorro = entrada.next();

          System.out.println(" Deseja adicionar mais um cachorro? 1- Sim e 2-Não ");
          verificacao = entrada.nextInt();


    }while(verificacao != 2);

  }
}
