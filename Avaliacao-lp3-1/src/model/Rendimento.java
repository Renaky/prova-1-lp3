package model;

public enum Rendimento {
	CC(0.01),
	CJ(0.012),
	PP(0.007),
	CE(0.02);
	
	
	private final double renda;
	
	private Rendimento(double a){
		this.renda = a;
		
	}

	public double getRenda() {
		return renda;
	}

}