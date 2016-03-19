package edu.anhanguera.prc.aula04;

public class BancoNaoSincronizado implements Runnable {
	
	public ContaCorrente contaCorrente;
	
	public void run() {
		for (int i=10;i<=100;i+=10) {
			contaCorrente.depositar(i);
			System.out.println("Saldo Atual:" + contaCorrente.saldo);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente();
		BancoNaoSincronizado banco = new BancoNaoSincronizado();
		banco.contaCorrente = contaCorrente;
		
		Thread thread1 = new Thread(banco);
		thread1.start();
		
		Thread thread2 = new Thread(banco);
		thread2.start();

		Thread thread3 = new Thread(banco);
		thread3.start();
	}


}
