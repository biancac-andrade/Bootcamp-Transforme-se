package SistemaVeterinario;

public class SistemaVet {
  public static void main(String[] args) {
    
    Cachorro cachorro1 = new Cachorro();
    cachorro1.nome = "Toddy";
    cachorro1.raca = "Vira lata";
    cachorro1.idade = 4;
    cachorro1.telefone = "19981982280";
    cachorro1.nomeResponsavel = "Tati";

    System.out.println(cachorro1.nome);
    System.out.println(cachorro1.raca);
    System.out.println(cachorro1.idade);
    System.out.println(cachorro1.telefone);
    System.out.println(cachorro1.nomeResponsavel);


  double mediaCalculada = cachorro1.calculaPreco(25, 4.7);
    System.out.println( "O valor do servico de tosa ficou" + mediaCalculada);
  
  }
}
