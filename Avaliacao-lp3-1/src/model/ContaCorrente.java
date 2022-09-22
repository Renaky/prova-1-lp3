package model;

public class ContaCorrente implements Conta {
	private double saldo;
	private Rendimento renda;
	
	public ContaCorrente(double saldo, Rendimento renda) {
		this.saldo=saldo;
		this.renda=renda;
	}

	@Override
	public double saque(double valor) {
		this.saldo = saldo-valor;
		return saldo;
	}

	@Override
	public double rendimento(double renda) {
		renda = this.saldo*0.01;
		return renda;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Rendimento getRenda() {
		return renda;
	}

	public void setRenda(Rendimento renda) {
		this.renda = renda;
	}

}
