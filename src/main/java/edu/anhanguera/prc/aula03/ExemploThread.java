package edu.anhanguera.prc.aula03;

public class ExemploThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Executando ExemploThread");
	}

	public static void main(String[] args) {
		ExemploThread exemploThread = new ExemploThread();
		exemploThread.start();
	}
	
}
