package Atividade1.Conta;

import javax.swing.plaf.TextUI;

public class ContaPj extends ContaPf {

  private String nomeEmpresa;
  private String numeroCNPJ;



  public String getNomeEmpresa() {
    return nomeEmpresa;

  }

  public void setNomeEmpresa(String nomeEmpresa) {
    this.nomeEmpresa = nomeEmpresa;
  }

  public String getNumeroCNPJ() {
    return numeroCNPJ;

  }

  public void setNumeroCNPJ(String numeroCNPJ) {
    this.numeroCNPJ = numeroCNPJ;
  }

public ContaPj(String nomeTitular, int numeroConta, String nomeEmpresa, String numeroCNPJ){
  this.nomeTitular = nomeTitular;
  this.numeroConta = numeroConta;
  this.nomeEmpresa = nomeEmpresa;
  this.numeroCNPJ = numeroCNPJ;
}




}
