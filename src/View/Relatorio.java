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
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Tempo da Entrada");
		menuBar.add(mnNewMenu);
		
		JRadioButtonMenuItem rdbtnmntmElementos = new JRadioButtonMenuItem("30 Elementos ");
		mnNewMenu.add(rdbtnmntmElementos);
		
		JRadioButtonMenuItem rdbtnmntmElementos_1 = new JRadioButtonMenuItem("20.000 Elementos");
		mnNewMenu.add(rdbtnmntmElementos_1);
		
		JMenu mnCenrio = new JMenu("Cen\u00E1rio");
		menuBar.add(mnCenrio);
		
		JRadioButtonMenuItem rdbtnmntmRandom = new JRadioButtonMenuItem("Random");
		mnCenrio.add(rdbtnmntmRandom);
		
		JRadioButtonMenuItem rdbtnmntmInversamenteOrdenado = new JRadioButtonMenuItem("Inversamente Ordenado");
		mnCenrio.add(rdbtnmntmInversamenteOrdenado);
		
		JRadioButtonMenuItem rdbtnmntmGruposDe = new JRadioButtonMenuItem("Grupos de 10% iguais");
		mnCenrio.add(rdbtnmntmGruposDe);
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
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnExecutar)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 388, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExecutar)
					.addContainerGap(12, Short.MAX_VALUE))
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
