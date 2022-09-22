package model;

public class CaixaEletronico {
	private Conta conta;
	
	public void setStrategy(Conta conta) {
		this.conta=conta;
		
	}
	public double calculaRendimento(double renda) {
		
		return conta.rendimento(renda);

}
}
