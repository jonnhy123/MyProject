package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Conecao {
	private static Connection conn;
	private static final String USUARIO = "root";
    private static final String SENHA = "4221";
    private static final String URL = "jdbc:mysql://localhost:3306/LotoFacil";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

	static {
		Conexao();
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					conn.close();
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null,"Erro ao fechar Conex�o");
					e.printStackTrace();
				}
			}
		}));
	}
    
	private Conecao(){};
	
	public static Connection Conexao() {
		if (conn == null) {
			try {
				new Conecao();
				conn = Conecao.abrirConecao();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
    // Conectar ao banco
    public static Connection abrirConecao() {
        // Registrar o driver
        try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // Capturar a conex�o
        try {
			conn = DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // Retorna a conexao aberta
        return conn;
    }

    public void fecharConecao(){
    	 try{
    	  conn.close();
    	  System.out.println("Conexao finalizada com sucesso");
    	 }catch(Exception e){
    	  System.out.println("Erro ao fechar conexao com banco" + e.getMessage());
    	 }
    }
}
