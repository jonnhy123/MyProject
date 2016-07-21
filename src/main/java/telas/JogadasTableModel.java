package telas;

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
	
	public JogadasTableModel(List<Jogadas> listaJogadas) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
