package edu.anhanguera.prc.aula05;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializandoObjeto {
	
	public static void main(String[] args) {
		Pessoa pessoa = null;
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		
		try {
			fileInputStream = new FileInputStream("/tmp/pessoa.obj");
			objectInputStream = new ObjectInputStream(fileInputStream);
			
			pessoa = (Pessoa) objectInputStream.readObject();
			
			System.out.println(pessoa.getAltura());
			System.out.println(pessoa.getIdade());
			System.out.println(pessoa.getNome());
			System.out.println(pessoa.getPeso());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileInputStream.close();
				objectInputStream.close();
			} catch (Exception e) {}
		}
	}

}
