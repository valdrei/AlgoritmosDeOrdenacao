package MetodosOrdenacao;

import Model.PerformanceDoMetodo;

public class BubbleSort {

	public PerformanceDoMetodo bubbleSort( int[] vetBubble){
		PerformanceDoMetodo bubbleSort = new PerformanceDoMetodo();
		
		long inicio = System.currentTimeMillis(); 
		int trocas = 0;
		
		for( int i = vetBubble.length; i >= 1; i-- ){
			
			for( int j = 1; j < i; j++){
				if(vetBubble[j-1] > vetBubble[j]){
					int aux = vetBubble[j];
					vetBubble[j] = vetBubble[j-1];
					vetBubble[j-1]=aux;
					trocas ++;
				}
			}
		}
		long fim = System.currentTimeMillis(); 
		bubbleSort.setTempeExecucao(fim-inicio);
		bubbleSort.setQtdTrocas(trocas);
		bubbleSort.setNomeAlgoritmo("Bubble Sort");
		return bubbleSort;
	}
	
	public int[] invertBubleSort(int[] vetBubble){
	
		int[] resultado = vetBubble;  
	    for (int i = vetBubble.length; i >= 1; i--) {  
	        for (int j = 1; j < i; j++) {  
	            if (resultado[j - 1] < vetBubble[j]) {  
	                int aux = vetBubble[j];  
	                resultado[j] = vetBubble[j - 1];  
	                resultado[j - 1] = aux;  
	            	}  
	        	}	  
	    	} 
	    return vetBubble;
	}
}
