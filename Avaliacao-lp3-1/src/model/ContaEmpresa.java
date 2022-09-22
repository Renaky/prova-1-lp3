package model;

public class ContaEmpresa implements Conta{
	private double saldo;

	@Override
	public double saque(double valor) {
		this.saldo = saldo-valor;
		return saldo;
	}

	@Override
	public double rendimento(double renda) {
		renda = this.saldo*0.02;
		return renda;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
