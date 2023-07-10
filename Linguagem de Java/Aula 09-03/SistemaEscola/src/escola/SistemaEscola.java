package escola;

import java.util.Scanner;

public class SistemaEscola {
  
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno();
    aluno1.nome = "Tati";
    aluno1.sobrenome = "Martins";
    aluno1.matricula = 123456;
    aluno1.serie = "7 serie";
    aluno1.turma = "B";

    // aluno1.calculoMadia(5.2, 7.1, 4.8, 4.7)

    double mediaCalculada = aluno1.calculoMadia(5.2, 7.1, 4.8, 4.7);
    System.out.println(mediaCalculada);
    // String nomeFormatado = aluno1.bemvindoAluno("tati", "Martins");
    // System.out.println(nomeFormatado);

    Scanner entrada = new Scanner(System.in);
    // System.out.println("Digite o  sexo 1 - F  2 - M  3 - Prefiro não informar: ");
    // int sexo = entrada.nextInt();
    
    // String fraseFormatada = aluno1.bemvindoAluno(sexo, "Tati", "MArtins");
    // System.out.println(fraseFormatada);


    Professor prof1 = new Professor("Ariel", "000.000.000-00");
    prof1.materia = "Libras";


    System.out.println(prof1.nome);
    System.out.println(prof1.sobrenome);
    
    // Professor prof2 = new Professor("Ariel", "Xavier", "Libras");

    entrada.close();

}
}
