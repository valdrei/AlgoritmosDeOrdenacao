package Controller;

import java.util.Random;

public class GeradoraDeVetor {
	
	int[] vetor;
	int qtd;
	
	public GeradoraDeVetor(int qtd, String metodo){
		
		switch (metodo){	
			case  	"random": 
				this.vetorRandom();
			break;
			case	"gropos":
				this.vetorGroup();
			break;
		}
		
		this.qtd=qtd;
		
		vetor=new int[qtd];
		
	}
	
	//metodo Random
	private void vetorRandom(){
		
		Random random=new Random();
		
		for(int i=0;i<qtd;i++){
			vetor[i]=random.nextInt();
		}		
		
	}
	
	//metodo Grupal
	private void vetorGroup(){
		
		int qtdvalores=0;
		
		
		for(int i=0;i<qtdvalores;i++){
			
		}
		
	}
	
	//Retorna o vetor
	public int[] getVetor(){
		
		return vetor;
	}
			
	
}
