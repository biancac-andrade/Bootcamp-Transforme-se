package SistemaVeterinario;

public class Cachorro {
  String nome;
  String raca;
  int idade;
  String telefone;
  String nomeResponsavel;
  


  double calculaPreco(double valor, double horas) {
    double calculaHoras = horas * valor;
    return calculaHoras;
  }
}

