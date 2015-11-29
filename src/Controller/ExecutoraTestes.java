package Controller;

import java.util.List;

import MetodosOrdenacao.BubbleSort;
import MetodosOrdenacao.InsertionSort;
import MetodosOrdenacao.MergeSort;
import MetodosOrdenacao.QuickSort;
import Model.GeradoraDeVetor;
import Model.PerformanceDoMetodo;

import java.util.ArrayList;


public class ExecutoraTestes {

	List<PerformanceDoMetodo> testes;
	GeradoraDeVetor gdv;
	BubbleSort bubblesort;
	InsertionSort insertionsort;
	MergeSort mergeSort;
	QuickSort quicksort;
	
	int[] vetor;
	String metodo;
	
	public ExecutoraTestes(int qtd, String metodo){
		this.metodo=metodo;
		testes			=new ArrayList<PerformanceDoMetodo>();
		gdv				=new GeradoraDeVetor(qtd);
		insertionsort	=new InsertionSort();
		mergeSort		=new MergeSort();
		insertionsort	=new InsertionSort();
		quicksort		=new QuickSort();
		
		executarTestes();
	}
	
	public List<PerformanceDoMetodo> getResults() {
		return testes;
	}
	
	private void executarTestes(){
		
		getVetor(metodo);
		
		
		
		
	}
	
	private void getVetor(String metodo){
		
		switch(metodo){
		
		case "random":
			vetor= gdv.vetorRandom();
			break;
		case "invert":
			vetor= gdv.vetorInverOrdenado();
			break;
		case "groupo":
			vetor= gdv.vetorGroup();
			break;
			default:
				vetor=null;

		}
		
	}
	
}
