package Model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class PerformanceTable extends AbstractTableModel{
	private static final int ALGORITMO = 0;
	private static final int TEMPOEXECUCAO = 1;
	private static final int QTDTROCA = 2;
	
	private List<PerformanceDoMetodo> dados;
    private String[] colunas = {"Algoritmo" , "Tempo de Execução" ,"Quantidade de Trocas"};

    public PerformanceTable() {
    
    	dados=new ArrayList<PerformanceDoMetodo>();
    	
	}
	@Override
	public int getRowCount() {
		
		return dados.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}
	
	@Override
	public String getColumnName(int column) {
		
		return colunas[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		PerformanceDoMetodo pm=dados.get(rowIndex);
		
		switch(columnIndex){
		
		case ALGORITMO: 
			return pm.getNomeAlgoritmo();
		case TEMPOEXECUCAO:
			
			if (pm.getTempeExecucao() <= 1000000) {
				return (pm.getTempeExecucao() + " Nanosec");
			} else if (pm.getTempeExecucao() <= 1000000000) {
				return ((pm.getTempeExecucao() / 1000000) + " Milisec");
			} else {
				return ((pm.getTempeExecucao() / 1000000000) + " Sec");
			}
			 
		case QTDTROCA:
			return pm.getQtdTrocas();
			default:
				System.err.println("Out of index");
		
		}
		
		return null;
	}
	

	
	public void addListaDeTestes(List<PerformanceDoMetodo> pm) {
	    
	    int indice = getRowCount();
	 
	    dados.addAll(pm);
	
	    fireTableRowsInserted(indice,indice + pm.size());
	}

	
}
