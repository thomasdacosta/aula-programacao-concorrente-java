package edu.anhanguera.prc.aula06;

public class Rodovia implements Runnable {

	private String carro1;
	private String carro2;

	public Rodovia(String objeto1, String objeto2) {
		this.carro1 = objeto1;
		this.carro2 = objeto2;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " - 1 - Lock no " + carro1);
		synchronized (carro1) {
			System.out.println(Thread.currentThread().getName() + " - 2 - Lock no " + carro2);

			synchronized (carro2) {
				System.out.println("Lock");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Saindo do Lock");
	}

}
