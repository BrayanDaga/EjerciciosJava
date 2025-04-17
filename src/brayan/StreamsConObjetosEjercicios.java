/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

import java.util.List;
import Modelos.Auto;
import Modelos.Libro;

/**
 *
 * @author Utente
 */
public class StreamsConObjetosEjercicios {

    public static void main(String[] args) {
        /*🚗 Ejercicio 11: Filtrar autos por precio
Tienes una lista de objetos Auto:
class Auto {
    private String marca;
    private int precio;
    // Constructor, getters, setters, toString
}*
Filtra los autos que cuesten más de 20,000 y guárdalos en una nueva lista.
         */
        List<Auto> autos = List.of(new Auto("auto1", 15000),
                new Auto("auto2", 25000), new Auto("auto3", 30000));
        List<Auto> autoCosto20k = autos.stream().filter(auto -> auto.getPrecio() > 20000).toList();
        autoCosto20k.forEach(System.out::println);

        /*📚 Ejercicio 12: Nombres de libros
Tienes una lista de Libro:

class Libro {
    private String titulo;
    private String autor;
}
Tarea:
Obtén una lista solo con los títulos de todos los libros.*/
        List<Libro> libros = List.of(new Libro("libro1", "autor1"),
                new Libro("libro2", "autor2"),
                new Libro("libro3", "autor3"));
        
    }

}
