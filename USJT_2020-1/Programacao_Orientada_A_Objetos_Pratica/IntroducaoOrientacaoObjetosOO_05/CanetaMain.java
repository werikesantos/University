import   javax.swing.*;

public   class CanetaMain
{
   public   static   void  main(String args[])
   {
      String sRascT;
      String sRascC;

      Caneta caneta1 = new Caneta();
      sRascT = caneta1.getTipo();
      sRascC = caneta1.getCor();
      JOptionPane.showMessageDialog(null, "Tipo: " + sRascT, "Caneta 1", JOptionPane.PLAIN_MESSAGE);
      JOptionPane.showMessageDialog(null, "Cor: " + sRascC, "Caneta 1", JOptionPane.PLAIN_MESSAGE);
      System.out.println("Caneta 1 - Tipo: " + sRascT);
      System.out.println("Caneta 1 - Cor: " + sRascC);

      caneta1.setTipo("Hidrográfica");
      caneta1.setCor("Vermelha");      
      sRascT = caneta1.getTipo();
      sRascC = caneta1.getCor();
      JOptionPane.showMessageDialog(null, "Tipo: " + sRascT, "Caneta 1", JOptionPane.PLAIN_MESSAGE);
      JOptionPane.showMessageDialog(null, "Cor: " + sRascC, "Caneta 1", JOptionPane.PLAIN_MESSAGE);
      System.out.println("Caneta 1 - Tipo: " + sRascT);
      System.out.println("Caneta 1 - Cor: " + sRascC);
         
      Caneta caneta2 = new Caneta("Esferográfica", "Azul");
      sRascT = caneta2.getTipo();
      sRascC = caneta2.getCor();
      JOptionPane.showMessageDialog(null, "Tipo: " + sRascT, "Caneta 2", JOptionPane.PLAIN_MESSAGE);
      JOptionPane.showMessageDialog(null, "Cor: " + sRascC, "Caneta 2", JOptionPane.PLAIN_MESSAGE);
      System.out.println("Caneta 2 - Tipo: " + sRascT);
      System.out.println("Caneta 2 - Cor: " + sRascC);
      
      System.exit(0);
   }
}