package telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMain frame = new FrmMain();
					frame.setLocationRelativeTo(null);
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
	public FrmMain() {
		setTitle("Loto Facil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmPlay form = new FrmPlay();
				form.setLocationRelativeTo(null);
				form.setVisible(true);
				dispose();
			}
		});
		GridBagConstraints gbc_btnJogar = new GridBagConstraints();
		gbc_btnJogar.insets = new Insets(0, 0, 0, 5);
		gbc_btnJogar.gridx = 0;
		gbc_btnJogar.gridy = 0;
		contentPane.add(btnJogar, gbc_btnJogar);
		
		JButton btnResultado = new JButton("Resultado");
		GridBagConstraints gbc_btnResultado = new GridBagConstraints();
		gbc_btnResultado.insets = new Insets(0, 0, 0, 5);
		gbc_btnResultado.gridx = 1;
		gbc_btnResultado.gridy = 0;
		contentPane.add(btnResultado, gbc_btnResultado);
		
		JButton btnConferencia = new JButton("Possibilidades");
		GridBagConstraints gbc_btnConferencia = new GridBagConstraints();
		gbc_btnConferencia.gridx = 2;
		gbc_btnConferencia.gridy = 0;
		contentPane.add(btnConferencia, gbc_btnConferencia);
	}

}
