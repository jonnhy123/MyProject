package telas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import Class.Jogadas;

public class JogadasTableModel extends AbstractTableModel {

	private static final int COL_num1 = 0;
	private static final int COL_num2 = 1;
	private static final int COL_num3 = 2;
	private static final int COL_num4 = 3;
	private static final int COL_num5 = 4;
	
	List<Jogadas> linhas;
	private String[] colunas = new String[]{"num1","num2","num3",
			"num4","num5"};
	
	public JogadasTableModel(List<Jogadas> listaJogadas) {
		this.linhas = new ArrayList<>(listaJogadas);
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		return linhas.size();
	}
	@Override
	public String getColumnName(int columnIndex) {
	    return colunas[columnIndex];
	}
	
	@Override
	public Object getValueAt(int row, int column) {
		Jogadas j = linhas.get(row);
		
		if(column == COL_num1){
			return j.getNum_1();
		}else if(column == COL_num2){
			return j.getNum_2();
		}else if(column == COL_num3){
			return j.getNum_3();
		}else if(column == COL_num4){
			return j.getNum_4();
		}else if(column == COL_num5){
			return j.getNum_5();
		}
		return "Deu RUIM!!!";
	}

}
