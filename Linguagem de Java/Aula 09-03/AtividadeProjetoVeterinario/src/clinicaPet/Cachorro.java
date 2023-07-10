package clinicaPet;

public class Cachorro {
  
  String nome;
  String raca;
  int idade;
  String sexo;


  void mostrarDadosCachorro(String nomeCachorro, String racaCachorro, int idadeCachorro, String sexoCachorro) {
    System.out.println("O nome é: " + nomeCachorro + " A raca é : " + racaCachorro + " a idade é: " + idadeCachorro);
  }

  void latir(String nomeCachorro, int idadeCachorro) {
    // formatado
    System.out.printf(" o cachoro %s esta latindo ! A idade é %d ! %n", nomeCachorro, idadeCachorro);

    //  forma comum 
    System.out.println(" o cachorro " + nomeCachorro + "  esta latindo ");
    System.out.println(" o cachorro " + nomeCachorro + "  esta latindo ");

    
    
  }
}
