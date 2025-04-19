/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

import Modelos.Alumno;
import java.util.List;
import Modelos.Auto;
import Modelos.Libro;
import Modelos.Producto;
import Modelos.Empleado;
import java.util.Optional;

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
        List<String> titulos = libros.stream().map(libro -> libro.getTitulo()).toList();
        titulos.forEach(System.out::println);

        /*🏆 Ejercicio 13: Alumno con mejor promedio
Tienes una lista de Alumno:
class Alumno {
    private String nombre;
    private double promedio;
}
Tarea:
Encuentra el alumno que tenga el mayor promedio.*/
        List<Alumno> alumnos = List.of(new Alumno("allumno1", 15.4),
                new Alumno("allumno2", 18.4),
                new Alumno("allumno3", 14.4));

        Optional<Alumno> mejorAlumno = alumnos.stream().reduce((a1, a2) -> a1.getPromedio() > a2.getPromedio() ? a1 : a2);
            mejorAlumno.ifPresent(System.out::println);

        /*🍔 Ejercicio 14: Precio total del pedido
Tienes una lista de Producto:

class Producto {
    private String nombre;
    private String codigo;
    private double precio;
}
Tarea:
Calcula el total a pagar sumando todos los precios.*/
        List<Producto> productos = List.of(
                new Producto("Laptop HP", "LPT001", 850.00),
                new Producto("MacBook Air", "LPT002", 850.00),
                new Producto("Mouse Logitech", "MSE003", 25.99),
                new Producto("Mouse Genius", "MSE004", 25.99),
                new Producto("Teclado Mecánico", "KEY005", 59.50),
                new Producto("Teclado Inalámbrico", "KEY006", 59.50),
                new Producto("Monitor Samsung", "MON007", 189.99),
                new Producto("Monitor LG", "MON008", 189.99),
                new Producto("Router TP-Link", "RTR009", 45.60),
                new Producto("Router D-Link", "RTR010", 45.60)
        );

        List<Double> precios = productos.stream().map(producto-> producto.getPrecio()).toList();
        precios.forEach(System.out::println);
        
        double sumprod = productos.stream().mapToDouble(Producto::getPrecio).sum();
      System.out.println("La suma total es :" +sumprod);

        /*🎯 Ejercicio 15: Hay algún empleado senior
Tienes una lista de Empleado:
      |
class Empleado {
    private String nombre;
    private int edad;
}
Tarea:
Verifica si existe algún empleado de 60 años o más.*/
    List<Empleado> empleados = List.of(new Empleado("empleado1", 45, 1400),
           new Empleado("empleado2", 65, 1800),
           new Empleado("empleado3", 55, 1600));
    boolean algun60mayor= empleados.stream().anyMatch(empleado -> empleado.getEdad()>=60);
        if (algun60mayor) {
            System.out.println("Si hay uno o varios con 60 años o mas");
        }else{
            System.out.println("Ninguno es mayor que 60");
        }
    }

}
