package materialAula04;

import javax.swing.*;

//O programa se encerrará quando for digitado o número -999, caso contrário ele apresentará o triplo do número digitado e repetirá toda a ação.

public class Kata2
{
   public   static   void main(String args[])
   {
      int   i;
      do
      {  
         String sI = JOptionPane.showInputDialog(null, "Digite um número diferente de -999", "Kata 2", JOptionPane.QUESTION_MESSAGE);
         i = Integer.parseInt(sI);
         JOptionPane.showMessageDialog(null, "O triplo de i:" + i + " é:" + (3*i), "Kata 2", JOptionPane.PLAIN_MESSAGE);
      }while(i != -999);
      System.exit(0);
   }
}