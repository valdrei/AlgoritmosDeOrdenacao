package MetodosOrdenacao;

import java.util.concurrent.SynchronousQueue;

public class QuickSort {
	
	public static int[] sort( int[] vetQuick){
		quickSort(vetQuick, 0, vetQuick.length -1 );
		
		return vetQuick;
	}
	
	public static int partition( int[] vetQuick, int left, int right){
		
		int i = left, j = right;
		int pivot = vetQuick[(left + right) / 2];
		
		while ( i <= j){
			while( vetQuick[i] < pivot)
				i++;
			while( vetQuick[j] > pivot)
				j--;
			if( i<= j ){
				int temp = vetQuick[i];
				vetQuick[i] = vetQuick[j];
				vetQuick[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
	
	
	public static void quickSort(int[] vetQuick, int left, int right){
		
		
			int index = partition(vetQuick, left, right);
			if(left < index -1)
				quickSort(vetQuick, left, index -1);
			if(index < right)
				quickSort(vetQuick, index, right);
		
	}
	
	
	public static void main(String[] args) {
		int[] vet = {2,5,4,8,6,8,1,3};
		QuickSort test = new QuickSort();
		int[] sorted = test.sort(vet);
		for(int i:sorted){
			System.out.print(i+",");
		}
		
	}
	
}
