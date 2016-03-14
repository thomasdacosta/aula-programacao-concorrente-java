package edu.anhanguera.prc.aula04;

public class Sincronizacao02 extends Thread {
	
	public static int contador = 0;
	
	public void run() {
		synchronized (this) {
			for (int i=1;i<=10;i++)
				incrementarContador();
		}
	}
	
	public void incrementarContador() {
		contador++;
		System.out.println(this.getName() + " - " + contador);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Sincronizacao02 sinc1 = new Sincronizacao02();
		
		Thread thread1 = new Thread(sinc1);
		thread1.start();
		
		Thread thread2 = new Thread(sinc1);
		thread2.start();
	}

}
