package model;

public class ContaConjunta implements Conta {
	private double saldo;
	private Rendimento renda;
	public ContaConjunta(double saldo, Rendimento renda) {
		this.saldo=saldo;
		this.renda = renda;
	}

	@Override
	public double saque(double valor) {
		this.saldo = saldo-valor;
		return saldo;
	}

	@Override
	public double rendimento(double renda) {
		renda = this.saldo*0.012;
		return renda;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
