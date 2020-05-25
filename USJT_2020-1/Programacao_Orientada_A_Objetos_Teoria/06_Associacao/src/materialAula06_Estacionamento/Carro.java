package materialAula06_Estacionamento;

public class Carro
{
   private String cor;
   private String placa;
   
   public Carro(String cor, String placa){
      this.cor = cor;
      this.placa = placa;
   }
  
   public String getPlaca(){
      return placa;
   }
   
   public String getCor(){
      return cor;
   }
   
   
}