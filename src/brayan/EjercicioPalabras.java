package brayan;

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioPalabras {

    public static void main(String[] args) {
        try ( //Dado un texto, cuenta cuántas veces aparece cada palabra.
                //Imprime los resultados.
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa una oracion: ");
            String texto = scanner.nextLine();
            String[] palabras = texto.split("[^\\p{L}]+"); // \p{L} representa cualquier letra (incluye tildes)

            HashMap<String, Integer> contadorPalabra = new HashMap<>();

            for (String palabra : palabras) {
                if (contadorPalabra.containsKey(palabra)) {
                    contadorPalabra.put(palabra, contadorPalabra.get(palabra) + 1);
                } else {
                    contadorPalabra.put(palabra, 1);
                }
            }

            contadorPalabra.forEach((clave, valor) -> {
                System.out.println(clave + " : " + valor);
            });
        }
    }

}
