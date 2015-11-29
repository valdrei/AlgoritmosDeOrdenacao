package MetodosOrdenacao;

import Model.PerformanceDoMetodo;

public class MergeSort {

	private int[] array;
    private int[] tempMergArr;
    private int length;
	
	public PerformanceDoMetodo sort(int[] vetMerge) {
		PerformanceDoMetodo mergeSrot = new PerformanceDoMetodo();
		
		long inicio = System.currentTimeMillis(); 
		int trocas = 0;
		
        this.array = vetMerge;
        this.length = vetMerge.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
        
        long fim = System.currentTimeMillis();
        mergeSrot.setTempeExecucao(fim-inicio);
		mergeSrot.setQtdTrocas(trocas);
		mergeSrot.setNomeAlgoritmo("Merge Sort");
        return mergeSrot;
       
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }

}
