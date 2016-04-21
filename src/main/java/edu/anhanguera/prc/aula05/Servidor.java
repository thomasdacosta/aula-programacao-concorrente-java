package edu.anhanguera.prc.aula05;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	public static void main(String[] args) {
		ServerSocket servidor = null;
		try {
			System.out.println("[SERVER] - Iniciando Servidor na porta 1234...");
			servidor = new ServerSocket(1234);
			System.out.println("[SERVER] - Servidor Iniciado");
			
			while (true) {
				System.out.println("[SERVER] - Aguardando conexão.");
				Socket cliente = servidor.accept();
				System.out.println("[SERVER] - Conexão Recebida de " + cliente.getInetAddress().getHostAddress());
			
				ProcessamentoThread processThread = new ProcessamentoThread();
				processThread.setSocket(cliente);
				Thread thread = new Thread(processThread);
				thread.start();
				
				System.out.println("[SERVER] - Thread de processamento em execução.");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				servidor.close();
			} catch (IOException e) {}
		}
	}
	
}
