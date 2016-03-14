package edu.anhanguera.prc.aula04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class ContaCorrente {
	
	public HashMap<String, Double> extrato = new HashMap<String, Double>(); 
	public Double saldo;
	
	public void depositar(Double valor) {
		this.saldo += valor;
		extrato.put("DEPOSITO-" + new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date()), valor);
	}
	
	public void sacar(Double valor) {
	}
	
	public void extrato() {
		for (String tipo : extrato.keySet()) {
			System.out.println(tipo + " " + extrato.get(tipo));
		}
	}

	public HashMap<String, Double> getExtrato() {
		return extrato;
	}

	public void setExtrato(HashMap<String, Double> extrato) {
		this.extrato = extrato;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
