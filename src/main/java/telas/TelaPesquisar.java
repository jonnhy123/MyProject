package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;

import org.omg.CORBA.OBJ_ADAPTER;

import Class.Jogadas;
import Dao.Conecao;
import Dao.jogadasDao;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TelaPesquisar extends JFrame {

	private JPanel contentPane;
	private JTable table_01;
	private JTable table_02;
	private JTextField textField_1;
	private JTextField txt_1;
	private JTable table_03;
	private JTextField textField_2;
	private JTable table_04;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	Jogadas j = new Jogadas();
	
	private JogadasTableModel modeloTabela;
	List<Jogadas> listaJogadas;
	private Connection conn = Conecao.abrirConecao();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPesquisar frame = new TelaPesquisar();
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
	public TelaPesquisar() {
		setTitle("Tela Pesquisar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		panel.add(panel_1, gbc_panel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 11, 281, 142);
		panel_1.add(panel_5);
		
		table_01 = new JTable(modeloTabela);
		panel_5.add(table_01);
//		pesquisar();
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(0, 154, 301, 37);
		panel_1.add(panel_8);
		
		txt_1 = new JTextField();
		txt_1.setColumns(10);
		panel_8.add(txt_1);
		
		JButton button_2 = new JButton("Pesquisar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int pValor = Integer.parseInt(txt_1.getText());
				
				try {
					JogaNaTabela(pValor);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		panel_8.add(button_2);
		
		JButton button_3 = new JButton("Zerar");
		panel_8.add(button_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 0;
		contentPane.add(panel_2, gbc_panel_2);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 11, 281, 142);
		panel_2.add(panel_6);
		
		table_02 = new JTable();
		panel_6.add(table_02);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(0, 154, 301, 37);
		panel_2.add(panel_7);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel_7.add(textField_1);
		
		JButton button = new JButton("Pesquisar");
		panel_7.add(button);
		
		JButton button_1 = new JButton("Zerar");
		panel_7.add(button_1);
		
		JButton btnVoltar = new JButton("<<<<");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			TelaPrincipal form = new TelaPrincipal();
			form.setLocationRelativeTo(null);
			form.setVisible(true);
			dispose();
			}
		});
		GridBagConstraints gbc_btnVoltar = new GridBagConstraints();
		gbc_btnVoltar.fill = GridBagConstraints.VERTICAL;
		gbc_btnVoltar.gridheight = 2;
		gbc_btnVoltar.insets = new Insets(0, 0, 5, 0);
		gbc_btnVoltar.gridx = 2;
		gbc_btnVoltar.gridy = 0;
		contentPane.add(btnVoltar, gbc_btnVoltar);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 1;
		contentPane.add(panel_3, gbc_panel_3);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(10, 11, 281, 142);
		panel_3.add(panel_9);
		
		table_03 = new JTable();
		panel_9.add(table_03);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(0, 159, 301, 37);
		panel_3.add(panel_10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_10.add(textField_2);
		
		JButton button_4 = new JButton("Pesquisar");
		panel_10.add(button_4);
		
		JButton button_5 = new JButton("Zerar");
		panel_10.add(button_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 0, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 1;
		contentPane.add(panel_4, gbc_panel_4);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(10, 11, 281, 142);
		panel_4.add(panel_11);
		
		table_04 = new JTable();
		panel_11.add(table_04);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(-10, 159, 301, 37);
		panel_4.add(panel_12);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_12.add(textField_3);
		
		JButton button_6 = new JButton("Pesquisar");
		panel_12.add(button_6);
		
		JButton button_7 = new JButton("Zerar");
		panel_12.add(button_7);
	}

		private void JogaNaTabela(int valor) throws SQLException{
			
			DefaultTableModel modelo = new DefaultTableModel();
			//constroi a tabela
			table_01.setModel(modelo);
			//cria 2 colunas
			modelo.addColumn("col01");
			modelo.addColumn("col02");
			modelo.addColumn("col03");
			modelo.addColumn("col04");
			modelo.addColumn("col05");
			//definindo tamanho nas colunas da tabela
			table_01.getColumnModel().getColumn(0).setPreferredWidth(55);
			table_01.getColumnModel().getColumn(1).setPreferredWidth(55);
			table_01.getColumnModel().getColumn(2).setPreferredWidth(55);
			table_01.getColumnModel().getColumn(3).setPreferredWidth(55);
			table_01.getColumnModel().getColumn(4).setPreferredWidth(55);
			//procedimentos para obter ps dados de uma tabela
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM jogadas WHERE id_jogadas ="+valor;
			ResultSet rs = stmt.executeQuery(query);
			
			int num1,num2,num3,num4,num5,
			num6,num7,num8,num9,num10,
			num11,num12,num13,num14,num15;
			
			while (rs.next()) {
				num1 = rs.getInt("num_1");
				num2 = rs.getInt("num_2");
				num3 = rs.getInt("num_3");
				num4 = rs.getInt("num_4");
				num5 = rs.getInt("num_5");
				num6 = rs.getInt("num_6");
				num7 = rs.getInt("num_7");
				num8 = rs.getInt("num_8");
				num9 = rs.getInt("num_9");
				num10 = rs.getInt("num_10");
				num11 = rs.getInt("num_11");
				num12 = rs.getInt("num_12");
				num13 = rs.getInt("num_13");
				num14 = rs.getInt("num_14");
				num15 = rs.getInt("num_15");
				modelo.addRow(new Object[]{new Integer(num1),new Integer(num2),
						new Integer(num3),new Integer(num4),new Integer(num5)});
				modelo.addRow(new Object[]{new Integer(num6),new Integer(num7),
						new Integer(num8),new Integer(num9),new Integer(num10)});
				modelo.addRow(new Object[]{new Integer(num11),new Integer(num12),
						new Integer(num13),new Integer(num14),new Integer(num15)});
				}
			}
			
			//fim procedimento para obter dados
	}