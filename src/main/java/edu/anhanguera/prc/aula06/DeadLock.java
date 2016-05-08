package edu.anhanguera.prc.aula06;

public class DeadLock {
	
	public static void main(String[] args) {
		String carro1 = new String("Objeto 1");
		String carro2 = new String("Objeto 2");
		String carro3 = new String("Objeto 3");
		
		Thread thread1 = new Thread(new Rodovia(carro1, carro2), "THREAD 1");
		thread1.start();
		
		Thread thread2 = new Thread(new Rodovia(carro2, carro3), "THREAD 2");
		thread2.start();

		Thread thread3 = new Thread(new Rodovia(carro3, carro1), "THREAD 3");
		thread3.start();
		
	}

}
