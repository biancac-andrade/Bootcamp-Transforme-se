package Atividade1.Banco;

import java.util.Scanner;

import Atividade1.Conta.ContaPf;
import Atividade1.Conta.ContaPj;

public class SistemaBanco {
  public static void main(String[] args) {

    ContaPf contaPF = new ContaPf("Ariel", 1234);

    System.out.println(contaPF.getNomeTitular());
    System.out.println(contaPF.getNumeroConta());
    

    ContaPj contaPJ = new ContaPj("tati", 5678, "Serasa", "00.000.00-0001");


    System.out.println(contaPJ.getNomeEmpresa());
    System.out.println(contaPJ.getNomeTitular());
    System.out.println(contaPJ.getNumeroConta());
    System.out.println(contaPJ.getNumeroCNPJ());
  }
}
