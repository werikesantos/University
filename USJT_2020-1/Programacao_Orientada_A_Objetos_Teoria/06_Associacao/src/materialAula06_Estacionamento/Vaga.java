package materialAula06_Estacionamento;

public class Vaga
{
   private int numero;
   private Carro carro;
   
   public Vaga(int numero, Carro carro){
      this.numero = numero;
      this.carro = carro;
   }
   
   public Vaga(){
      this.numero = 0;
      this.carro = new Carro("verde", "ABC1234");
   }
   
   public String ocupante(){
      return "vaga " + numero + " placa " + 
         carro.getPlaca() + " cor " + 
         carro.getCor();
   }
   
   public String ocupante(int n, Carro c){
      return "vaga " + n + " placa " + 
         c.getPlaca() + " cor " + 
         c.getCor();
   } 
}