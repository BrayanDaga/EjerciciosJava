package brayan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoTXT {
    public static void main(String[] args) {
        String rutaArchivo = "nombres_edades.txt"; // Asegúrate que el archivo esté en la misma carpeta del proyecto o da la ruta completa
        int sumaEdades = 0;
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    int edad = Integer.parseInt(partes[1].trim());
                    sumaEdades += edad;
                    contador++;
                }
            }

            if (contador > 0) {
                double promedio = (double) sumaEdades / contador;
                System.out.println("Promedio de edades: " + promedio);
            } else {
                System.out.println("No se encontraron datos válidos.");
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Edad no válida en el archivo.");
        }
    }
}
