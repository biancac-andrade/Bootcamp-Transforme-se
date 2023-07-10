package Sistema;

public class Computador {
  
  public boolean estado;
  public boolean ligar;
  public boolean desligado;

  public boolean ligar() {

    estado = true;
    return desligado;

  }
  
  public boolean desligado() {
    estado = false;
    return desligado;

  }
  
  public boolean imprimir() {
      
    if (estado == true) {
      System.out.println(" O Computador tá ligado");
    } else {
      System.out.println(" O computador está desligado");
    }
    return desligado;
    
  }

}
