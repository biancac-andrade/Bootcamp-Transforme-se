package Posto.sistema;

import Posto.pagamento.Credito;
import Posto.pagamento.Pagamento;
import Posto.pessoas.Cliente;
import Posto.pessoas.Funcionario;
import Posto.servicos.Abastecimento;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
       // Cliente c1 = new Cliente();
        // c1.nome = "Gabiel";
        // c1.sobrenome = "Nunes";

        // Cliente c2 = new Cliente("Gilcemar", "Borges");
        // System.out.println(c2.nome);
        // System.out.println(c2.sobrenome);
        // c2.dizNomeCliente("Gilcemar");

        // System.out.println(Funcionario.enderecoPosto);

        // Credito.pagoNoCredito("Richard");
        // Credito.pagoNoCredito("qualquer nome");

        // O sistema comeca aqui

        int escolhaCliente;
        int tipoCombustivel = 0;
        double valorAbastecer;
        double qtdCombustivel;

        System.out.println("ola seja bem vindo(a) ao posto transforme se");
        System.out.println("Qual servico deseja fazer? 1-Abastecer");
        escolhaCliente = entrada.nextInt();

        System.out.println("Quanto gostaria de abastecer?");
        valorAbastecer = entrada.nextDouble();
        Abastecimento.Abastecer(tipoCombustivel, valorAbastecer);
        System.out.println("Qual seria a forma de pagamento? 1-Dinheiro 2-Debito 3-Credito");
        int formaPagamento  = entrada.nextInt();

        Pagamento.formaPagamento(formaPagamento, valorAbastecer);

        // if(escolhaCliente == 1){
        //   System.out.println("O preco dos combustives: 1- Gasolina - R$ 4.75  2- R$ 3.59 3-Diesel - R$");
        //   tipoCombustivel = entrada.nextInt();

        //   System.out.println("Quanto gostaria de abastecer?");
        //  valorAbastecer = entrada.nextDouble();

        //   if(tipoCombustivel == 1){
        //       qtdCombustivel = valorAbastecer / 4.75;
        //      System.out.printf("Foi  abastecido %.2f, rendendo a quantidade de %.3f", qtdCombustivel, valorAbastecer);
        //  }
        //  }
    }
}
