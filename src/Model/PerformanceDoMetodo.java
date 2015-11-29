package Model;

public class PerformanceDoMetodo {
	
	private int qtdTrocas;
	private long tempeExecucao;
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

	public long getTempeExecucao() {
		return tempeExecucao;
	}

	public void setTempeExecucao(long tempeExecucao) {
		this.tempeExecucao = tempeExecucao;
	}

	public String getNomeAlgoritmo() {
		return nomeAlgoritmo;
	}

	public void setNomeAlgoritmo(String nomeAlgoritmo) {
		this.nomeAlgoritmo = nomeAlgoritmo;
	}
	
	

}
