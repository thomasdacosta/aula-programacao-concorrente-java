package edu.anhanguera.prc.aula05;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ProcessamentoThread implements Runnable {

	private Socket clientet = null;

	@Override
	public void run() {
		System.out.println("[PROCESSO] - Executando processamento do cliente " + clientet.getInetAddress().getHostAddress());
		Scanner scanner = null;
		try {
			scanner = new Scanner(clientet.getInputStream());
			while (scanner.hasNextLine()) {
				System.out.println("[PROCESSO] - Mensagem Recebida: " + scanner.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	public Socket getSocket() {
		return clientet;
	}

	public void setSocket(Socket socket) {
		this.clientet = socket;
	}

}
