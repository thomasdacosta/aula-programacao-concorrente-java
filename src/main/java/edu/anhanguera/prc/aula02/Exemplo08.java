package edu.anhanguera.prc.aula02;

public class Exemplo08 {

	public static void main(String[] args) {
		Integer varInt = 2015;
		Double varDouble = 768.35;
		Float varFloat = 3.14159265f;
		Long varLong = 250000000l;
		Boolean varBoolean = true;
		Byte varByte = 8;
		Short varShort = 3;

		System.out.println("int: " + varInt);
		System.out.println("double: " + varDouble);
		System.out.println("float: " + varFloat);
		System.out.println("long: " + varLong);
		System.out.println("boolean: " + varBoolean);
		System.out.println("byte: " + varByte);
		System.out.println("short: " + varShort);

		String valor = "100";
		varInt = Integer.parseInt(valor);

		System.out.println("Valor convertido:" + valor);
	}

}
