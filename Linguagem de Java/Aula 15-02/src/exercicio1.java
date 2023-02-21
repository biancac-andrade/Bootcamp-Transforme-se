public class  exercicio1{
    public static void main(String[] args) {

        int MesUm = 40;
        int MesDois = 30;
        int MesTres = 70;
        float Soma = MesUm + MesDois + MesTres;

        float Media = Soma / 3;
        float Resto = Soma % 3;


        System.out.println("A media dos seus clientes é:"  + Media  + " de clientes");
        System.out.println("O resto de sobrando da média é: " + Resto);

     }
}