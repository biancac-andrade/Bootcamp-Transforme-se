package Sistema;

public class Sistema {

  public static void main(String[] args) {
    
    Computador c1 = new Computador();

    c1.ligar();
    c1.imprimir();

    c1.desligado();
    c1.imprimir();
    
    c1.ligar();
    c1.imprimir();
  }
  
}
