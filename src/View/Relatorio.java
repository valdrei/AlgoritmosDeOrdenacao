package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class Relatorio extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Relatorio frame = new Relatorio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Relatorio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnExecutar = new JButton("Executar");
		btnExecutar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("30 Elementos");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("20 Mil Elementos");
		
		JLabel lblTamanhoDaEntrada = new JLabel("Tamanho da Entrada:");
		
		JLabel lblNewLabel = new JLabel("Cenário:");
		
		JRadioButton rdbtnRandom = new JRadioButton("Random");
		
		JRadioButton rdbtnInversamenteOrdenado = new JRadioButton("Inversamente Ordenado");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Grupos 10% iguais");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnExecutar)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNewRadioButton)
								.addComponent(rdbtnNewRadioButton_1)
								.addComponent(lblTamanhoDaEntrada)
								.addComponent(lblNewLabel)
								.addComponent(rdbtnRandom)
								.addComponent(rdbtnInversamenteOrdenado)
								.addComponent(rdbtnNewRadioButton_2))
							.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnExecutar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(16)
							.addComponent(lblTamanhoDaEntrada)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_1)
							.addGap(18)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnRandom)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnInversamenteOrdenado)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_2)))
					.addContainerGap(58, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Algoritmos", "Tempo de execu\u00E7\u00E3o", "Qtd. de Trocas"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(112);
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
	}
}
