package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaJogar extends JFrame {

	private JPanel contentPane;
	private JTextField txt_01;
	private JTextField txt_02;
	private JTextField txt_03;
	private JTextField txt_04;
	private JTextField txt_05;
	private JTextField txt_06;
	private JTextField txt_07;
	private JTextField txt_08;
	private JTextField txt_09;
	private JTextField txt_10;
	private JTextField txt_11;
	private JTextField txt_12;
	private JTextField txt_13;
	private JTextField txt_14;
	private JTextField txt_15;
	private JTextField txtConcurso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaJogar frame = new TelaJogar();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaJogar() {
		setTitle("Tela Jogar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("01");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel label = new JLabel("02");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		contentPane.add(label, gbc_label);
		
		JLabel label_1 = new JLabel("03");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 2;
		gbc_label_1.gridy = 0;
		contentPane.add(label_1, gbc_label_1);
		
		JLabel label_2 = new JLabel("04");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 3;
		gbc_label_2.gridy = 0;
		contentPane.add(label_2, gbc_label_2);
		
		JLabel label_3 = new JLabel("05");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 4;
		gbc_label_3.gridy = 0;
		contentPane.add(label_3, gbc_label_3);
		
		txt_01 = new JTextField();
		GridBagConstraints gbc_txt_01 = new GridBagConstraints();
		gbc_txt_01.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_01.insets = new Insets(0, 0, 5, 5);
		gbc_txt_01.gridx = 0;
		gbc_txt_01.gridy = 1;
		contentPane.add(txt_01, gbc_txt_01);
		txt_01.setColumns(10);
		
		txt_02 = new JTextField();
		GridBagConstraints gbc_txt_02 = new GridBagConstraints();
		gbc_txt_02.insets = new Insets(0, 0, 5, 5);
		gbc_txt_02.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_02.gridx = 1;
		gbc_txt_02.gridy = 1;
		contentPane.add(txt_02, gbc_txt_02);
		txt_02.setColumns(10);
		
		txt_03 = new JTextField();
		GridBagConstraints gbc_txt_03 = new GridBagConstraints();
		gbc_txt_03.insets = new Insets(0, 0, 5, 5);
		gbc_txt_03.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_03.gridx = 2;
		gbc_txt_03.gridy = 1;
		contentPane.add(txt_03, gbc_txt_03);
		txt_03.setColumns(10);
		
		txt_04 = new JTextField();
		GridBagConstraints gbc_txt_04 = new GridBagConstraints();
		gbc_txt_04.insets = new Insets(0, 0, 5, 5);
		gbc_txt_04.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_04.gridx = 3;
		gbc_txt_04.gridy = 1;
		contentPane.add(txt_04, gbc_txt_04);
		txt_04.setColumns(10);
		
		txt_05 = new JTextField();
		GridBagConstraints gbc_txt_05 = new GridBagConstraints();
		gbc_txt_05.insets = new Insets(0, 0, 5, 5);
		gbc_txt_05.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_05.gridx = 4;
		gbc_txt_05.gridy = 1;
		contentPane.add(txt_05, gbc_txt_05);
		txt_05.setColumns(10);
		
		JButton btnPlay = new JButton("Play");
		GridBagConstraints gbc_btnPlay = new GridBagConstraints();
		gbc_btnPlay.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPlay.gridwidth = 5;
		gbc_btnPlay.insets = new Insets(0, 0, 5, 5);
		gbc_btnPlay.gridx = 6;
		gbc_btnPlay.gridy = 1;
		contentPane.add(btnPlay, gbc_btnPlay);
		
		JLabel label_4 = new JLabel("06");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 2;
		contentPane.add(label_4, gbc_label_4);
		
		JLabel label_5 = new JLabel("07");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 2;
		contentPane.add(label_5, gbc_label_5);
		
		JLabel label_6 = new JLabel("08");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 2;
		gbc_label_6.gridy = 2;
		contentPane.add(label_6, gbc_label_6);
		
		JLabel label_7 = new JLabel("09");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 3;
		gbc_label_7.gridy = 2;
		contentPane.add(label_7, gbc_label_7);
		
		JLabel label_8 = new JLabel("10");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 4;
		gbc_label_8.gridy = 2;
		contentPane.add(label_8, gbc_label_8);
		
		txt_06 = new JTextField();
		GridBagConstraints gbc_txt_06 = new GridBagConstraints();
		gbc_txt_06.insets = new Insets(0, 0, 5, 5);
		gbc_txt_06.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_06.gridx = 0;
		gbc_txt_06.gridy = 3;
		contentPane.add(txt_06, gbc_txt_06);
		txt_06.setColumns(10);
		
		txt_07 = new JTextField();
		GridBagConstraints gbc_txt_07 = new GridBagConstraints();
		gbc_txt_07.insets = new Insets(0, 0, 5, 5);
		gbc_txt_07.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_07.gridx = 1;
		gbc_txt_07.gridy = 3;
		contentPane.add(txt_07, gbc_txt_07);
		txt_07.setColumns(10);
		
		txt_08 = new JTextField();
		GridBagConstraints gbc_txt_08 = new GridBagConstraints();
		gbc_txt_08.insets = new Insets(0, 0, 5, 5);
		gbc_txt_08.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_08.gridx = 2;
		gbc_txt_08.gridy = 3;
		contentPane.add(txt_08, gbc_txt_08);
		txt_08.setColumns(10);
		
		txt_09 = new JTextField();
		GridBagConstraints gbc_txt_09 = new GridBagConstraints();
		gbc_txt_09.insets = new Insets(0, 0, 5, 5);
		gbc_txt_09.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_09.gridx = 3;
		gbc_txt_09.gridy = 3;
		contentPane.add(txt_09, gbc_txt_09);
		txt_09.setColumns(10);
		
		txt_10 = new JTextField();
		GridBagConstraints gbc_txt_10 = new GridBagConstraints();
		gbc_txt_10.insets = new Insets(0, 0, 5, 5);
		gbc_txt_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_10.gridx = 4;
		gbc_txt_10.gridy = 3;
		contentPane.add(txt_10, gbc_txt_10);
		txt_10.setColumns(10);
		
		JButton btnZerar = new JButton("Zerar");
		btnZerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txt_01.setText("");
			txt_02.setText("");
			txt_03.setText("");
			txt_04.setText("");
			txt_05.setText("");
			txt_06.setText("");
			txt_07.setText("");
			txt_08.setText("");
			txt_09.setText("");
			txt_10.setText("");
			txt_11.setText("");
			txt_12.setText("");
			txt_13.setText("");
			txt_14.setText("");
			txt_15.setText("");
			txtConcurso.setText("");
			}
		});
		GridBagConstraints gbc_btnZerar = new GridBagConstraints();
		gbc_btnZerar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnZerar.gridwidth = 5;
		gbc_btnZerar.insets = new Insets(0, 0, 5, 5);
		gbc_btnZerar.gridx = 6;
		gbc_btnZerar.gridy = 3;
		contentPane.add(btnZerar, gbc_btnZerar);
		
		JLabel label_9 = new JLabel("11");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 0;
		gbc_label_9.gridy = 4;
		contentPane.add(label_9, gbc_label_9);
		
		JLabel label_10 = new JLabel("12");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.insets = new Insets(0, 0, 5, 5);
		gbc_label_10.gridx = 1;
		gbc_label_10.gridy = 4;
		contentPane.add(label_10, gbc_label_10);
		
		JLabel label_11 = new JLabel("13");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 2;
		gbc_label_11.gridy = 4;
		contentPane.add(label_11, gbc_label_11);
		
		JLabel label_12 = new JLabel("14");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 3;
		gbc_label_12.gridy = 4;
		contentPane.add(label_12, gbc_label_12);
		
		JLabel label_13 = new JLabel("15");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 4;
		gbc_label_13.gridy = 4;
		contentPane.add(label_13, gbc_label_13);
		
		txt_11 = new JTextField();
		GridBagConstraints gbc_txt_11 = new GridBagConstraints();
		gbc_txt_11.insets = new Insets(0, 0, 5, 5);
		gbc_txt_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_11.gridx = 0;
		gbc_txt_11.gridy = 5;
		contentPane.add(txt_11, gbc_txt_11);
		txt_11.setColumns(10);
		
		txt_12 = new JTextField();
		GridBagConstraints gbc_txt_12 = new GridBagConstraints();
		gbc_txt_12.insets = new Insets(0, 0, 5, 5);
		gbc_txt_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_12.gridx = 1;
		gbc_txt_12.gridy = 5;
		contentPane.add(txt_12, gbc_txt_12);
		txt_12.setColumns(10);
		
		txt_13 = new JTextField();
		GridBagConstraints gbc_txt_13 = new GridBagConstraints();
		gbc_txt_13.insets = new Insets(0, 0, 5, 5);
		gbc_txt_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_13.gridx = 2;
		gbc_txt_13.gridy = 5;
		contentPane.add(txt_13, gbc_txt_13);
		txt_13.setColumns(10);
		
		txt_14 = new JTextField();
		GridBagConstraints gbc_txt_14 = new GridBagConstraints();
		gbc_txt_14.insets = new Insets(0, 0, 5, 5);
		gbc_txt_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_14.gridx = 3;
		gbc_txt_14.gridy = 5;
		contentPane.add(txt_14, gbc_txt_14);
		txt_14.setColumns(10);
		
		txt_15 = new JTextField();
		GridBagConstraints gbc_txt_15 = new GridBagConstraints();
		gbc_txt_15.insets = new Insets(0, 0, 5, 5);
		gbc_txt_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt_15.gridx = 4;
		gbc_txt_15.gridy = 5;
		contentPane.add(txt_15, gbc_txt_15);
		txt_15.setColumns(10);
		
		JButton btnSalve = new JButton("<<<<");
		btnSalve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal form = new TelaPrincipal();
				form.setLocationRelativeTo(null);
				form.setVisible(true);
				dispose();
			}
		});
		GridBagConstraints gbc_btnSalve = new GridBagConstraints();
		gbc_btnSalve.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSalve.gridwidth = 5;
		gbc_btnSalve.insets = new Insets(0, 0, 5, 5);
		gbc_btnSalve.gridx = 6;
		gbc_btnSalve.gridy = 5;
		contentPane.add(btnSalve, gbc_btnSalve);
		
		txtConcurso = new JTextField();
		txtConcurso.setToolTipText("");
		GridBagConstraints gbc_txtConcurso = new GridBagConstraints();
		gbc_txtConcurso.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtConcurso.gridwidth = 3;
		gbc_txtConcurso.insets = new Insets(0, 0, 5, 5);
		gbc_txtConcurso.gridx = 7;
		gbc_txtConcurso.gridy = 7;
		contentPane.add(txtConcurso, gbc_txtConcurso);
		txtConcurso.setColumns(10);
	}

}
