package brayan;

import java.util.Scanner;

import brayan.utils.TextoInvalidoException;

public class InvertirTexto {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws TextoInvalidoException {
/*Escribe un método que reciba un String y lo devuelva invertido 
 * sin usar métodos de Java como StringBuilder.reverse().*/
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa una palabra");
		String palabra = scanner.nextLine();

		if (palabra.isBlank() || palabra.equals("")) {
			throw new TextoInvalidoException("No puede ser vacio");
		}
		
		StringBuilder inverso = new StringBuilder();
		for (int i = palabra.length()-1; i >= 0; i--) {
			inverso.append(palabra.charAt(i));
		}
			
		System.out.println(inverso);
			
		
		scanner.close();

	}

}
