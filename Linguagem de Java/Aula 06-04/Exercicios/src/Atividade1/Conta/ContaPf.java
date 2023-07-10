package Atividade1.Conta;

public class ContaPf {



  public ContaPf(String nomeTitular, int numeroConta) {
    this.nomeTitular = nomeTitular;
    this.numeroConta = numeroConta;
  }

  protected String nomeTitular;
  protected int numeroConta;

  public String getNomeTitular() {
    return nomeTitular;
  }

  public void setNomeTitular(String nomeTitular) {
    this.nomeTitular = nomeTitular;
  }

  public double getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }



}
