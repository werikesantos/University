public class Exemplo{   
   private int[] vetor;
   
   public Exemplo(){
      vetor = new int[5];
   }
      
   public void preencher(){   
      for(int i = 0; i < vetor.length; i++){
         vetor[i] = Integer.parseInt(
            javax.swing.JOptionPane.showInputDialog(
               "Digite o numero da posicao "+(i+1)+
               "/"+vetor.length));
      }
   }
    
   public void imprimir(){
      for(int i = 0; i < vetor.length; i++){
         System.out.print(vetor[i]+"\t");
      }
      System.out.println();
   }
   
   public int busca(int chave){
      for(int i = 0; i < vetor.length; i++){
         if(vetor[i] == chave){
            return i;
         }
      }
      return -1;
   }
   
   public int maior(){
      int aux = vetor[0];
      for(int i = 1; i < vetor.length; i++){
         if(vetor[i] > aux){
            aux = vetor[i];
         }
      }
      return aux;
   }
   
   public int menor(){
      int aux = vetor[0];
      for(int i = 1; i < vetor.length; i++){
         if(vetor[i] < aux){
            aux = vetor[i];
         }
      }
      return aux;
   }
   
   public int contaValor(int valor){
      int conta = 0;
      for(int i = 0; i < vetor.length; i++){
         if(vetor[i] == valor){
            conta++;
         }
      }
      return conta;
   }
   
   public double media(){
      double soma = 0;
      for(int i = 0; i < vetor.length; i++){
         soma += vetor[i];
      }
      return soma/vetor.length;   
   }


}
