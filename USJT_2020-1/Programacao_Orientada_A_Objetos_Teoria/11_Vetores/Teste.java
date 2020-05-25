public class Teste{
   public static void main(String[] args){
      Exemplo ex = new Exemplo();
      
      ex.preencher();
      ex.imprimir();
      System.out.println(""+ex.busca(0));
      System.out.println("maior = "+ex.maior());
      System.out.println("menor = "+ex.menor());
      System.out.println("media = "+ex.media());
      System.out.println("conta 5 = "+ex.contaValor(5));

   }
}