package view;

import model.CaixaEletronico;
import model.Conta;
import model.ContaConjunta;
import model.ContaCorrente;
import model.Rendimento;
public class Main {

	public static void main(String[] args) {
		
		Conta strategy = new ContaCorrente(10000, Rendimento.CC);
		CaixaEletronico cx = new CaixaEletronico();
		cx.setStrategy(strategy);
		double rendimento = cx.calculaRendimento(0);
		
		System.out.printf("Rendimento mensal Conta corrente R$ %.2f\n ",+rendimento);
		
		
		strategy = new ContaConjunta(1500,Rendimento.CJ);
		rendimento = cx.calculaRendimento(0);
		System.out.printf("Rendimento mensal Conta conjunta R$ %.2f\n ",+rendimento);

	}

}
