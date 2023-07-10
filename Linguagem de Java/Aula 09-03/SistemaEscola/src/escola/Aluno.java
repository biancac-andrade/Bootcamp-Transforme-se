package escola;

public class Aluno {
  
  String nome;
  String sobrenome;
  int matricula;
  String serie;
  String turma;

// void calculoMadia( double nota1, double nota2, double nota3, double nota4) {
    
//     double somaDasNotas  = nota1 + nota2 + nota3 + nota4;
//     System.out.println("Media calculada na classe " + somaDasNotas / 4);
//   }

double calculoMadia(double nota1, double nota2, double nota3, double nota4) {

  double somaDasNotas = nota1 + nota2 + nota3 + nota4;
  return somaDasNotas / 4;
}
  
String bemvindoAluno(int sexoPessoa, String nome, String sobrenome) {

  if (sexoPessoa == 1) {
    return  "Seja bem vinda, querida aluna " + nome + " " + sobrenome;
  } else if (sexoPessoa == 2) {
    return "Seja bem vindo, querido aluno " + nome + " " + sobrenome;
  } else {
    return "Seja bem vinde, querido alune " + nome + " " + sobrenome;
  }

}
}
