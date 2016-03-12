package edu.anhanguera.prc.aula03;

public class ExemploRunnable implements Runnable {

	public void run() {
		System.out.println("Executando ExemploRunnable");
	}
	
	public static void main(String[] args) {
		ExemploRunnable exemploRunnable = new ExemploRunnable();
		
		Thread thread = new Thread(exemploRunnable);
		thread.start();
	}

}
