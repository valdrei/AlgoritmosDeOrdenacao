package model;

public class PerformanceDoMetodo {
	
	private int qtdTrocas;
	private int tempeExecucao;
	private String nomeAlgoritmo;
	
	public PerformanceDoMetodo(){
		qtdTrocas=-1;
		tempeExecucao=-1;
		nomeAlgoritmo="";
	}

	public int getQtdTrocas() {
		return qtdTrocas;
	}

	public void setQtdTrocas(int qtdTrocas) {
		this.qtdTrocas = qtdTrocas;
	}

	public int getTempeExecucao() {
		return tempeExecucao;
	}

	public void setTempeExecucao(int tempeExecucao) {
		this.tempeExecucao = tempeExecucao;
	}

	public String getNomeAlgoritmo() {
		return nomeAlgoritmo;
	}

	public void setNomeAlgoritmo(String nomeAlgoritmo) {
		this.nomeAlgoritmo = nomeAlgoritmo;
	}
	
	

}
