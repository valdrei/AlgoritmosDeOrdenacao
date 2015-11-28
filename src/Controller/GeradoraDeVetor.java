package Controller;

import java.util.Random;

import MetodosOrdenacao.BubbleSort;

public class GeradoraDeVetor {
	
	int[] vetor;
	int qtd;
	
	public GeradoraDeVetor(int qtd, String metodo){
		
		this.qtd=qtd;
		
	}
	
	//metodo Random
	public int[] vetorRandom(){
		
		Random random=new Random();
		vetor=new int[qtd];
		
		for(int i=0;i<qtd;i++){
			vetor[i]=random.nextInt();
		}
		
		return vetor;
	}
	
	//metodo Ordenado Inversamente
		public int[] vetorInverOrdenado(){
			//Cria os objetos utilizados
			BubbleSort bubble=new BubbleSort();
			Random random=new Random();
			//Inicia um vetor randomico
			vetor=this.vetorRandom();
			//Retorna o vertor ordenado inversamente	
			return bubble.invertBubleSort(vetor);			
		}
	
	//metodo Grupal de 10%
	public int[] vetorGroup(){
		Random random=new Random();
		vetor=new int[qtd];
		
		int j=0;
		int contador=0;
		int partes=qtd/10;
		
		for(int i=0;i<10;i++){
			
			int valor= random.nextInt();
			
			for(j=contador ;j<partes;j++){
				
				vetor[j]=valor;
						
				contador++;
			}		
			
		}
		return vetor;
	}
	
	
}
