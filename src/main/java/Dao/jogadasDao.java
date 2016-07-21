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
		ArrayList<Jogadas> jogada = new ArrayList<Jogadas>();
		
		try {
			conn = Conecao.abrirConecao();
			pstm = conn.prepareStatement(SELECT);
			rs = pstm.executeQuery();
			while (rs.next()) {
				Jogadas jogadas = new Jogadas();
				jogadas.setNum_1(rs.getInt("num_01"));
				jogadas.setNum_2(rs.getInt("num_02"));
				jogadas.setNum_3(rs.getInt("num_03"));
				jogadas.setNum_4(rs.getInt("num_04"));
				jogadas.setNum_5(rs.getInt("num_05"));
				jogada.add(jogadas);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return jogada;
	}

}
