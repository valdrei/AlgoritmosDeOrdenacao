package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ExecutoraTestes;
import Model.PerformanceTable;

import javax.swing.JOptionPane;
import javax.naming.ldap.Rdn;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Relatorio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private PerformanceTable tbmodel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Relatorio frame = new Relatorio();
					frame.setVisible(true);
				} catch (Exception e) {
					System.err.println("Erro");
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Relatorio() {
		
		ButtonGroup qtdDeDados=new ButtonGroup();
		ButtonGroup metodoOrdenacao=new ButtonGroup();
		tbmodel=new PerformanceTable();
		
		JRadioButton rdbtn30 = new JRadioButton("30 Elementos");
		
		JRadioButton rdbtn20000 = new JRadioButton("20 Mil Elementos");
		
		JLabel lblTamanhoDaEntrada = new JLabel("Tamanho da Entrada:");
		
		JLabel lblNewLabel = new JLabel("Cenário:");
		
		JRadioButton rdbtnRandom = new JRadioButton("Random");
		
		JRadioButton rdbtnInversamenteOrdenado = new JRadioButton("Inversamente Ordenado");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnExecutar = new JButton("Executar");
		btnExecutar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(qtdDeDados.getSelection()==null||metodoOrdenacao.getSelection()==null){
					JOptionPane.showMessageDialog(null, "Por favor selecione o metodo e o tamanho da entrada!");
				}else{
					
					int qtd;
					String metodo;
					
					if(rdbtn20000.isSelected()){
						qtd=20000;
					}else{
						qtd=30;
					}
					
					if(rdbtnInversamenteOrdenado.isSelected()){
						metodo="invert";
					}else if(rdbtnRandom.isSelected()){
						metodo="random";
					}else{
						metodo="grupo";
					}
					executarTestes(qtd, metodo);
				}
			}
		});
		
		
		
		JRadioButton rdbtnGrupo = new JRadioButton("Grupos 10% iguais");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnExecutar)
							.addContainerGap())
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtn30)
								.addComponent(rdbtn20000)
								.addComponent(lblTamanhoDaEntrada)
								.addComponent(lblNewLabel)
								.addComponent(rdbtnRandom)
								.addComponent(rdbtnInversamenteOrdenado)
								.addComponent(rdbtnGrupo))
							.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
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
							.addComponent(rdbtn30)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtn20000)
							.addGap(18)
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnRandom)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnInversamenteOrdenado)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnGrupo)))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(tbmodel);
		table.getColumnModel().getColumn(1).setPreferredWidth(112);
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
		
		qtdDeDados.add(rdbtn30);
		qtdDeDados.add(rdbtn20000);

		
		metodoOrdenacao.add(rdbtnGrupo);
		metodoOrdenacao.add(rdbtnInversamenteOrdenado);
		metodoOrdenacao.add(rdbtnRandom);
		
		
		
		
	}
	
	private void executarTestes(int qtd, String metodo){
		
		ExecutoraTestes et=new ExecutoraTestes(qtd,metodo);
		
		tbmodel.addListaDeTestes(et.getResults());
		
		
		
	}
	
	
}
