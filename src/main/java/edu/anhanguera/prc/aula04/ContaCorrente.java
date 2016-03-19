package edu.anhanguera.prc.aula04;

public class ContaCorrente {
	
	public double saldo;
	
	public ContaCorrente() {
	}
	
	public void sacar(double valor) {
		if ((saldo-valor) <= 0) {
			System.out.println("Saldo indisponivel: " + saldo);
		}
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}

}
