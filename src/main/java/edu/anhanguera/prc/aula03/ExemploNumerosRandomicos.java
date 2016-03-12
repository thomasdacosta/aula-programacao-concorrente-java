package edu.anhanguera.prc.aula03;

public class ExemploNumerosRandomicos {
	
	public static void main(String[] args) {
		ExemploNumDoubleRandomico doubleRandomico = new ExemploNumDoubleRandomico();
		ExemploNumIntRandomico intRandomico = new ExemploNumIntRandomico();
		
		Thread threadDouble = new Thread(doubleRandomico);
		threadDouble.start();
		
		Thread threadInt = new Thread(intRandomico);
		threadInt.start();
		
		try {
			Thread.sleep(10000);
			
			ExemploNumDoubleRandomico.parar = 1;
			System.out.println("ExemploNumDoubleRandomico finalizado");
			
			Thread.sleep(10000);
			ExemploNumIntRandomico.parar = 1;
			System.out.println("ExemploNumIntRandomico finalizado");
			
		} catch (InterruptedException e) {}
	}

}
