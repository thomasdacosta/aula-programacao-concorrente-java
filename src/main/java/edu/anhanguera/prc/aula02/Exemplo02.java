package edu.anhanguera.prc.aula02;

public class Exemplo02 {

	public static void main(String[] args) {
		// É uma forma de criar comentários em linha.

		System.out.println("Imprimindo na saida do console");
		System.err.println("Imprimindo na saida de erro do console");
		System.out.print("Está forma não pula linha");
		System.err.format("Saida %s formatada", new String("é"));
		System.out.format("Esta %s também é formatada", new String("saida"));

		// O método abaixo possui o conceito de varargs
		System.out.format("%s formatada %s vários %s", new String("Saida"), new String("com"),
				new String("paramêtros"));
	}

}
