package materialAula06_Estacionamento;

public class Estacionamento
{
   public static void main(String[] args){
      Carro carro = new Carro("azul", "XVW1100");
      Vaga vaga = new Vaga(3, carro);
      
      System.out.println(vaga.ocupante());
      System.out.println(vaga.ocupante(8, 
         new Carro("amarelo", "CCD4523")));
   }
}