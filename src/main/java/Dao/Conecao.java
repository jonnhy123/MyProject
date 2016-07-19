package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conecao {
	private static Connection conn;
	private static final String USUARIO = "root";
    private static final String SENHA = "4221";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/LotoFacil";
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    // Conectar ao banco
    public static Connection abrirConecao() throws Exception {
        // Registrar o driver
        Class.forName(DRIVER);
        // Capturar a conexão
        conn = DriverManager.getConnection(URL, USUARIO, SENHA);
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
