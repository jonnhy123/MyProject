package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TelaResultado extends JFrame {

	private JPanel contentPane;
	private JTable table_01;
	private JTable table_02;
	private JTextField textField_1;
	private JTextField textField;
	private JTable table;
	private JTextField textField_2;
	private JTable table_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaResultado frame = new TelaResultado();
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
	public TelaResultado() {
		setTitle("Result");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
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
		
		table_01 = new JTable();
		panel_5.add(table_01);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(0, 154, 301, 37);
		panel_1.add(panel_8);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel_8.add(textField);
		
		JButton button_2 = new JButton("Pesquisar");
		panel_8.add(button_2);
		
		JButton button_3 = new JButton("Zerar");
		panel_8.add(button_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
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
		
		table = new JTable();
		panel_9.add(table);
		
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
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 1;
		gbc_panel_4.gridy = 1;
		contentPane.add(panel_4, gbc_panel_4);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(10, 11, 281, 142);
		panel_4.add(panel_11);
		
		table_1 = new JTable();
		panel_11.add(table_1);
		
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
}
