import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tipoServico;
        int resposta;

        double ValorGasolina = 4.75;
        double valorAlcool = 3.85;
        double valorDiesel = 4.15;
        int tipoDeCombustivel, tipoPagamento;

        System.out.println("Ola seja bem vindo(a) ao posto transforme-se");
        System.out.println("Qual servico deseja fazer?");
        System.out.println("1 - Abastecer 2- Lavar o carro 3- Trocar oleo");
        tipoServico = entrada.nextInt();



        do{
           System.out.println("Gostaria de fazer outro servico ? 1 - Sim e 2 - Não");
           resposta = entrada.nextInt();

            switch (tipoServico) {
                case 1:
                    System.out.println("abastecer");
                    System.out.println("o preco dos combustiveis são: ");
                    System.out.println(" Gasolina - R$ 4.75   ");
                    System.out.println("Qyal gostaria de abastecer? 1- Gasolina 2-Alcool 3-Diesel ");
                    tipoDeCombustivel = entrada.nextInt();

                    if(tipoDeCombustivel == 1){
                        System.out.println(" voce vai abastecer Gasolinal ");
                    } else if (tipoDeCombustivel == 2){
                        System.out.println(" voce vai abastecer Alcool  ");
                    } else if (tipoDeCombustivel == 3) {
                        System.out.println(" voce vai abastecer Diesel ");

                    } else {
                        System.out.println(" Servico invalido ");
                    }
                    break;
                case 2:
                    System.out.println("lavar carro");
                    break;
                case 3:
                    System.out.println("trocar oleo");
                    break;
                default:
                    System.out.println("Servico invalido");

            }
        } while(resposta != 2);

        System.out.println("Qual sera a forma de pagamento? ");
        System.out.println("1-Dinheiro 2-Pix 3-Credito ");
        tipoPagamento = entrada.nextInt();

        if(tipoPagamento == 1){
            System.out.println("Sera pago em dinheiro");
        }else if(tipoPagamento == 2){
            System.out.println("Sera págo em pix");
        } else if (tipoPagamento == 3) {
            System.out.println("Sera pago em credito");

        } else{
            System.out.println("quer dar calote doidão?");
        }


        entrada.close();


    }
}