package materialAula06_Relogio;

public class Teste{
   public static void main(String[] args){
      Relogio relogio = new Relogio();
      //i <= 1440 para minutos e 86400 para segundos
      for(int i = 0; i <= 1440; i++){
         System.out.println(relogio.mostra());
         relogio.ticTac();
      }
   }
}