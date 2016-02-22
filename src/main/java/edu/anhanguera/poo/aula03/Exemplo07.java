package edu.anhanguera.poo.aula03;

public class Exemplo07 {

	public static void main(String[] args) {
		char linguagem[] = { 'J', 'a', 'v', 'a' };
		String java = "";
		
		for (int i=0;i<=linguagem.length-1;i++) {
			java += linguagem[i];
		}
		System.out.println("Linguagem " + java);
		
		int notas[] = new int[2];
		notas[0] = 6;
		notas[1] = 7;
		
		int i=0;
		while (i <= notas.length-1) {
			System.out.println("Nota " + (i + 1) + ":" + notas[i]);
			i++;
		}
		
		boolean ligado = true;
		do {
			System.out.println("Ligado");
			ligado = false;
		} while (ligado);
	}
	
}
