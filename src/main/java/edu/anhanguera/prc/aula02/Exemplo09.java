package edu.anhanguera.prc.aula02;

import java.util.Scanner;

public class Exemplo09 {

	public static void main(String[] args) {
		double notaB1;
		double notaB2;
		double media;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a nota da B1:");
		notaB1 = scanner.nextDouble();

		System.out.println("Digite a média:");
		media = scanner.nextDouble();

		notaB2 = (media - (notaB1 * 0.4)) / 0.6;
		System.out.println("Nota necessária para aprovação:" + notaB2);

		scanner.close();
	}

}
