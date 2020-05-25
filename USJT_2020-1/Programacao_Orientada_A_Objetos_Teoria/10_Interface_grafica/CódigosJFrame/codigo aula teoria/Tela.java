import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;

public class Tela extends JFrame implements ActionListener{
   private JButton botao;
   private JTextField texto;
   private JLabel etiqueta;
   
   public Tela(){
      super("Calculadora");
      botao = new JButton("soma");
      etiqueta = new JLabel("Valor:");
      texto = new JTextField(10);
      
      Container caixa = getContentPane();
      
      caixa.setLayout(new FlowLayout());
      JPanel painel = new JPanel(new GridLayout(1,3));
      painel.add(etiqueta);
      painel.add(texto);
      painel.add(botao);
      caixa.add(painel);

      botao.addActionListener(this);
   
   
      setSize(400,100);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      this.setLocationRelativeTo(null);
      
   }
   
   public void actionPerformed(ActionEvent e){
      if(e.getSource() == botao){
         String sValor = texto.getText();
         int valor = 10 + Integer.parseInt(sValor);
         texto.setText(""+valor);
      }
   }
}
