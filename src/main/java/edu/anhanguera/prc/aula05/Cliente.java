package edu.anhanguera.prc.aula05;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

import javax.swing.JOptionPane;

public class Cliente {

	public static void main(String[] args) {
		Socket servidor = null;
		try {
			String mensagem = (String) JOptionPane.showInputDialog(null, "Escreva uma mensagem:",
					"Mensagem do Cliente", JOptionPane.PLAIN_MESSAGE, null, null, "escreva aqui");

			System.out.println("[CLIENT] - Conectando no servidor");
			servidor = new Socket("localhost", 1234);
			System.out.println("[CLIENT] - Conexão com sucesso !!!");
			
			PrintStream printStream = new PrintStream(servidor.getOutputStream());
			printStream.println(mensagem);
			
			System.out.println("[CLIENT] - Mensagem enviada: " + mensagem);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				servidor.close();
			} catch (IOException e) {}
		}
	}

}
