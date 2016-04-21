package edu.anhanguera.prc.aula05;

import java.io.Serializable;

public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = -8617059067424820303L;
	
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
