/* Classe Quadrado: Crie uma classe que modele um quadrado:
   Atributos: Tamanho do lado
   Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;
 */

 public class POO08CL02 {
   private int lado; 

   public void setLado(int novoLado){
      if(novoLado>2) {
         this.lado=novoLado;
      }else{
         System.out.println("Lado deve ser>2");
      }
   }
   
   public POO08CL02(int inicialLado){
      //construtor
      if (inicialLado>2){
      this.lado = inicialLado;
      }
  
   }
   public static void main (String[]args){
      POO08CL02 quadrado = new POO08CL02(3)
      System.out.println("Mudar errado: ");
      quadrado.mudarLado(1);
      System.out.println("Mudar correto: ");
      quadrado.mudarLado(5);
      System.out.println("Retornar: " + quadrado.retornarLado());
      System.out.println("Área: " + quadrado.calcularArea());
   }

   public void mudarLado(int novoLado) {
      setLado(novoLado);

   }

   public int retornarLado(){
      return this.lado;
   }

   public double calcularArea(){
      return this.lado * this.lado;
   }
 }