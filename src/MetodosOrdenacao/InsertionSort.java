package MetodosOrdenacao;

public class InsertionSort {

	public int[] insertionSort( int[] vetInsert){
		
		for(int i = 1; i < vetInsert.length; i++){
			int temp = vetInsert[i];
			int j;
			for(j = i-1; j >= 0 && temp < vetInsert[j]; j--)
				vetInsert[j+1] = vetInsert[j];
			
			vetInsert[j+1] = temp;
			
		}
		return vetInsert;
	}
}
