package it.gennaro.conto;

public class Conto {

	 String numeroConto;
	 double saldo;


	
	
	public Conto(String numeroConto, double saldo) {
		super();
		this.numeroConto = numeroConto;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Conto [numeroConto=" + numeroConto + ", saldo=" + saldo + "]";
	}

	public Conto() {
		
		
		
	}

	public String getNumeroConto() {
		return numeroConto;
	}
	public void setNumeroConto(String numeroConto) {
		this.numeroConto = numeroConto;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
