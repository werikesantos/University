import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaPedidos extends JFrame implements ActionListener {
	private JLabel lblIdPedido, lblData, lblValor;
	private JTextField txtIdPedido, txtData, txtValor;
	private JButton inserir, alterar, excluir, carregar, voltar;
	private Cliente cliente;
	private Connection conn;
	private Pedido pedido;

	public TelaPedidos(Connection conn, Cliente cliente) {
		super("Pedidos do Cliente " + cliente.getIdCliente() + " - "
				+ cliente.getNome());
		this.cliente = cliente;
		this.conn = conn;
		lblIdPedido = new JLabel("Id");
		lblData = new JLabel("Data");
		lblValor = new JLabel("Valor");
		txtIdPedido = new JTextField(10);
		txtData = new JTextField(10);
		txtValor = new JTextField(10);
		inserir = new JButton("Novo");
		alterar = new JButton("Alterar");
		excluir = new JButton("Excluir");
		carregar = new JButton("Carregar");
		voltar = new JButton("Voltar");

		Container caixa = getContentPane();
		caixa.setLayout(new BorderLayout());

		JPanel painelCentro = new JPanel(new FlowLayout());
		JPanel painelSul = new JPanel(new FlowLayout());

		painelCentro.add(lblIdPedido);
		painelCentro.add(txtIdPedido);
		painelCentro.add(lblData);
		painelCentro.add(txtData);
		painelCentro.add(lblValor);
		painelCentro.add(txtValor);
		painelSul.add(inserir);
		painelSul.add(alterar);
		painelSul.add(excluir);
		painelSul.add(carregar);
		painelSul.add(voltar);

		caixa.add(painelCentro, BorderLayout.CENTER);
		caixa.add(painelSul, BorderLayout.SOUTH);

		inserir.addActionListener(this);
		alterar.addActionListener(this);
		excluir.addActionListener(this);
		carregar.addActionListener(this);
		voltar.addActionListener(this);

		setSize(530, 105);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == voltar) {
			new TelaCliente(conn, cliente);
			dispose();
		}
		pedido = new Pedido();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			pedido.setId(Integer.parseInt(txtIdPedido.getText()));
		} catch (NumberFormatException nfe) {
			pedido.setId(-1);
		}
		try {
			pedido.setValor(Double.parseDouble(txtValor.getText()));
		} catch (NumberFormatException nfe) {
			pedido.setValor(0);
		}
		try {
			pedido.setData((Date) formatter.parse(txtData.getText()));
		} catch (ParseException pe) {
			pedido.setData(new Date());// para nao deixar nulo
		}

		if (e.getSource() == inserir) {
			pedido.incluir(cliente.getIdCliente(), conn);
			txtIdPedido.setText("" + pedido.getId());
		} else if (e.getSource() == alterar) {
			if (pedido.getValor() > 0
					&& pedido.getData().toString().length() > 0) {
				pedido.atualizar(conn);
			} else {
				JOptionPane.showMessageDialog(this, "Dados invalidos",
						"Pedido", JOptionPane.ERROR_MESSAGE);
			}
		} else if (e.getSource() == excluir) {
			pedido.excluir(conn);
		} else if (e.getSource() == carregar) {
			int idCliente = pedido.carregar(conn);
			txtIdPedido.setText("" + pedido.getId());
			txtValor.setText(String.format("%.2f", pedido.getValor()));
			txtData.setText("" + pedido.getData());
			cliente.setIdCliente(idCliente);
			cliente.carregar(conn);
			setTitle("Pedidos do Cliente " + cliente.getIdCliente() + " - "
					+ cliente.getNome());
		}
	}

}