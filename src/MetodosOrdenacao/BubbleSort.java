package MetodosOrdenacao;

public class BubbleSort {

	public int[] bubbleSort( int[] vetBubble){
		
		int count = 0;
		
		for( int i = vetBubble.length; i >= 1; i-- ){
			
			for( int j = 1; j < i; j++){
				if(vetBubble[j-1] > vetBubble[j]){
					int aux = vetBubble[j];
					vetBubble[j] = vetBubble[j-1];
					vetBubble[j-1]=aux;
					count = count + 1;
				}
			}
		}
		
		
		return vetBubble;
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
