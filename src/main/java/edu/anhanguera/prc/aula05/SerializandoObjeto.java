package edu.anhanguera.prc.aula05;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializandoObjeto {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		
		try {
			pessoa.setAltura(1.75);
			pessoa.setIdade(31);
			pessoa.setNome("Bruce Wayne");
			pessoa.setPeso(85.45);
			
			fileOutputStream = new FileOutputStream("/tmp/pessoa.obj");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(pessoa);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileOutputStream.close();
				objectOutputStream.close();
			} catch (Exception e) {}
		}
	}

}
