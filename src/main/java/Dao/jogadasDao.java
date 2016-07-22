package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Class.Jogadas;

public class jogadasDao {

	private final String INSERT = "INSERT INTO jogadas ()";
	private final String UPDATE = "UPDATE jogadas SET ";
	private final String DELETE = "DELETE FROM jogadas WHERE id_jogadas = ?";
	private final String SELECT = "SELECT * FROM jogadas";
	private final String SelectID = "SELECT * FROM jogadas WHERE id_jogadas = ?";
	
	public List<Jogadas> getJogadas() {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		ArrayList<Jogadas> ListJogada = new ArrayList<Jogadas>();
		
		try {
			conn = Conecao.abrirConecao();
			pstm = conn.prepareStatement(SELECT);
			rs = pstm.executeQuery();
			while (rs.next()) {
				Jogadas jogadas = new Jogadas();
				jogadas.setNum_1(rs.getInt("num_1"));//num_01 é o que está declarado no Banco MySQL.
				jogadas.setNum_2(rs.getInt("num_2"));
				jogadas.setNum_3(rs.getInt("num_3"));
				jogadas.setNum_4(rs.getInt("num_4"));
				jogadas.setNum_5(rs.getInt("num_5"));
				jogadas.setNum_1(rs.getInt("num_6"));
				jogadas.setNum_2(rs.getInt("num_7"));
				jogadas.setNum_3(rs.getInt("num_8"));
				jogadas.setNum_4(rs.getInt("num_9"));
				jogadas.setNum_5(rs.getInt("num_10"));
				jogadas.setNum_1(rs.getInt("num_11"));
				jogadas.setNum_2(rs.getInt("num_12"));
				jogadas.setNum_3(rs.getInt("num_13"));
				jogadas.setNum_4(rs.getInt("num_14"));
				jogadas.setNum_5(rs.getInt("num_15"));
				ListJogada.add(jogadas);
			}
			Conecao.fecharConecao(conn, pstm, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ListJogada;
	}

}
