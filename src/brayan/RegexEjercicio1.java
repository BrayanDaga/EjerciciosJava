package brayan;

public class RegexEjercicio1 {

	public static void ejercicio1() {
		/*
		 * > 🧪 Ejercicio 1: Valida si una cadena es un número entero positivo sin signo
		 * (ej: "10" ✅, "-10" ❌, "abc" ❌ ).
		 */
		String[] prueba = { "10", "-10", "abc" };
		for (String texto : prueba) {
			if (texto.matches("\\d+")) {
				System.out.println(texto + " ✅");
			} else {
				System.out.println(texto + " ❌");
			}
		}

	}

	public static void ejercicio2() {
		/*
		 * Valida si una cadena es un número decimal positivo con punto obligatorio
		 * (ej:"3.14" ✅, "2" ❌, "abc" ❌).
		 */
		String[] prueba = { "3.14", "2", "abc" };
		for (String texto : prueba) {
			if (texto.matches("\\d+\\.\\d+")) {
				System.out.println(texto + " ✅");
			} else {
				System.out.println(texto + " ❌");
			}
		}
	}

	public static void ejercicio3() {
		/*🧪 Ejercicio 3: Crea un programa que recorra una lista de Strings y 
		 * cuente cuántos son números válidos (enteros o decimales)./
		 */
		int i = 0;
		String[] prueba = { "3.14", "2", "abc","10", "-10", ".5", "5." };
		for (String texto : prueba) {
			if (texto.matches("[-+]?\\d+(\\.\\d+)?")) {
				// (\\.\\d+)?	Grupo opcional que representa un punto y más dígitos
				i++;
			}
		}
		System.out.println("Cantidad de numeros validos: "+i);
	}

	public static void main(String[] args) {
		ejercicio1();
		System.out.println("/**************/");
		ejercicio2();
		System.out.println("/**************/");
		ejercicio3();

	}

}
