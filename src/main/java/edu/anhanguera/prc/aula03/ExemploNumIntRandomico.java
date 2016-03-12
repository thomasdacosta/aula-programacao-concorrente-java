package edu.anhanguera.prc.aula03;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploNumIntRandomico implements Runnable {

	public static int parar = 0;
	
	public void run() {
		while (parar == 0) {
			int num = ThreadLocalRandom.current().nextInt(0, 9);
			System.out.println("Numero: " + num);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}

	public static void main(String[] args) {
		ExemploNumIntRandomico numIntRandomico = new ExemploNumIntRandomico();
		
		Thread thread = new Thread(numIntRandomico);
		thread.start();
	}
	
}
