package edu.anhanguera.prc.aula02;

public class Exemplo06 {

	public static void main(String[] args) {
		String nomeGuerreiro = "Blackwall";
		String nomeMago = new String("Solas");

		System.out.println("Guerreiro:" + nomeGuerreiro);
		System.out.println("Mago:" + nomeMago);
		System.out.println("Tamanho:" + nomeGuerreiro.length());
		System.out.println("Tamanho:" + nomeMago.length());

		if (!nomeGuerreiro.equals(nomeMago)) {
			System.out.println("Os nomes são diferentes.");
		} else {
			System.out.println("Os nomes são iguais.");
		}

		nomeGuerreiro = nomeGuerreiro.toUpperCase();
		nomeMago = nomeMago.toLowerCase();

		System.out.println("Guerreiro:" + nomeGuerreiro);
		System.out.println("Mago:" + nomeMago);
	}

}
