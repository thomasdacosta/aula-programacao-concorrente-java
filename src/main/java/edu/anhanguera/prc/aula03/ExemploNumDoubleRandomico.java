package edu.anhanguera.prc.aula03;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploNumDoubleRandomico implements Runnable {
	
	public static int parar = 0;

	public void run() {
		while (parar == 0) {
			double num = ThreadLocalRandom.current().nextDouble(0, 9);
			System.out.println("Numero: " + num);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
		}		
	}
	
	public static void main(String[] args) {
		ExemploNumDoubleRandomico randomico = new ExemploNumDoubleRandomico();
		
		Thread thread = new Thread(randomico);
		thread.start();
	}

}
