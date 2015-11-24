package MetodosOrdenacao;

public class BubbleSort {

	public int[] bubbleSort( int[] vetBubble){
		
		int temp;
		int contador = 0;
		
		for( int i = vetBubble.length; i >= 1; i-- ){
			
			for( int j = 1; j < i; j++){
				if(vetBubble[j-1] > vetBubble[j]){
					int aux = vetBubble[j];
					vetBubble[j] = vetBubble[j-1];
					vetBubble[j-1]=aux;
					contador = contador + 1;
				}
			}
		}
		
		
		return vetBubble;
	}
}
