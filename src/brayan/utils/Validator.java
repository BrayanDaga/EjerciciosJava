package brayan.utils;

public class Validator {
	public static void validarNumeroMayor0(int numero) throws NumeroInvalidoException {
        if (numero < 0) {
        	throw new NumeroInvalidoException("El valor no puede ser menos de 0");
        }
    }
	
	public static void validarNombre(String nombre) throws TextoInvalidoException{
		if (nombre.isBlank() || nombre.equals("")) {
			throw new TextoInvalidoException("No uede estar vacio");
		}
	}
}
