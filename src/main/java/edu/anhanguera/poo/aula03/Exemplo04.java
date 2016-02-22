package edu.anhanguera.poo.aula03;

public class Exemplo04 {

	public static void main(String[] args) {
		double media = 0;
		double notaB1 = 5;
		double notaB2 = 6;

		media = (notaB1 * 0.4) + (notaB2 * 0.6);

		if (media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

		System.out.println(media >= 6 ? "Aprovado" : "Reprovado");
	}

}
