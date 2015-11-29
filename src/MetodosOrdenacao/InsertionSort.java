package MetodosOrdenacao;

import Model.PerformanceDoMetodo;

public class InsertionSort {

	public PerformanceDoMetodo insertionSort( int[] vetInsert){
		PerformanceDoMetodo insertionSort = new PerformanceDoMetodo();
		
		long inicio = System.nanoTime(); 
		int trocas = 0;
		
		for(int i = 1; i < vetInsert.length; i++){
			int temp = vetInsert[i];
			int j;
			for(j = i-1; j >= 0 && temp < vetInsert[j]; j--)
				vetInsert[j+1] = vetInsert[j];
				
			vetInsert[j+1] = temp;
			trocas++;
		}
		long fim = System.nanoTime();
		insertionSort.setTempeExecucao(fim-inicio);
		insertionSort.setQtdTrocas(trocas);
		insertionSort.setNomeAlgoritmo("Insertion Sort");
		
		return insertionSort;
	}
}
