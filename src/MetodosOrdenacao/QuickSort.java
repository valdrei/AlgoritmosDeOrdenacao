package MetodosOrdenacao;

import java.util.concurrent.SynchronousQueue;

import Model.PerformanceDoMetodo;

public class QuickSort {
	
	private int trocas = 0;
	public  PerformanceDoMetodo sort( int[] vetQuick){
		PerformanceDoMetodo quickSort = new PerformanceDoMetodo();
		
		long inicio = System.currentTimeMillis(); 
		
		
		quickSort(vetQuick, 0, vetQuick.length -1 );
		
		long fim = System.currentTimeMillis();
		quickSort.setTempeExecucao(fim-inicio);
		quickSort.setQtdTrocas(trocas);
		quickSort.setNomeAlgoritmo("Quick Sort");
		
		
		return quickSort;
	}
	
	public  int partition( int[] vetQuick, int left, int right){
		
		int i = left, j = right;
		int pivot = vetQuick[(left + right) / 2];
		
		while ( i <= j){
			while( vetQuick[i] < pivot)
				i++;
			while( vetQuick[j] > pivot)
				j--;
			if( i<= j ){
				trocas++;
				int temp = vetQuick[i];
				vetQuick[i] = vetQuick[j];
				vetQuick[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
	
	
	public  void quickSort(int[] vetQuick, int left, int right){
		
		
			int index = partition(vetQuick, left, right);
			if(left < index -1)
				quickSort(vetQuick, left, index -1);
			if(index < right)
				quickSort(vetQuick, index, right);
		
	}
	
	
	
	
}
