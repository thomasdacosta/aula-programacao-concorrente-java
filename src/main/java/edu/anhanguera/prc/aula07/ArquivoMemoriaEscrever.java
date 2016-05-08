package edu.anhanguera.prc.aula07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class ArquivoMemoriaEscrever {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		long bufferSize = 8 * 10000;
		try {
			File arquivo = new File("/tmp/arquivo_memoria.txt");
			arquivo.delete();
			FileChannel fileChannel = new RandomAccessFile(arquivo, "rw").getChannel();
			MappedByteBuffer mp = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, bufferSize);
			String valor = "GRAVANDO UMA INFORMACAO";
			for (int j=0;j<=10;j++) {
				mp.put(valor.getBytes());	
			}
			fileChannel.close();
			mp.clear();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}