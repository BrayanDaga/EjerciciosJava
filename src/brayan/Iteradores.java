package brayan;

import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import Modelos.Alumno;
import Modelos.Libro;
import Modelos.Persona;
import Modelos.Producto;

public class Iteradores {

    public static void main(String[] args) {

        /*📘 Ejercicio 1: Recorrer e imprimir
		 * Crea una lista de objetos Libro con atributos titulo y autor.
		 *  Usa un Iterator para imprimir todos los libros.
		 * */
        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Bersek", "Kentaro"));
        libros.add(new Libro("Naruto", "Kishimoto"));

        Iterator<Libro> iteratorLibro = libros.iterator();
        while (iteratorLibro.hasNext()) {
            Libro libro = (Libro) iteratorLibro.next();
            System.out.println(libro);
        }

        /*📕 Ejercicio 2: Eliminar durante la iteración
		 * Usa una lista de objetos Alumno. Elimina, usando un Iterator, a todos los alumnos que tengan una nota menor a 11.
		 * public class Alumno {
		 * private String nombre;
		 * private double promedio;
		 * // constructor, getters y toString
		 * }*/
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Alumno 1", 16.4));
        alumnos.add(new Alumno("Alumno 2", 10.4));
        alumnos.add(new Alumno("Alumno 3", 9.4));
        alumnos.add(new Alumno("Alumno 4", 17.4));

        Iterator<Alumno> iteratorAlumno = alumnos.iterator();
        while (iteratorAlumno.hasNext()) {
            Alumno alumno = (Alumno) iteratorAlumno.next();
            if (alumno.getPromedio() < 11) {
                iteratorAlumno.remove();
            }
        }
        System.out.println(alumnos);

        /*📗 Ejercicio 3: Buscar uno específico
		 * Itera una lista de Producto y busca uno con nombre "Laptop".
		 * Imprime sus detalles si lo encuentras.*/
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Impresora", "tecnologia"));
        productos.add(new Producto("TV", "tecnologia"));
        productos.add(new Producto("Laptop", "tecnologia"));

        Iterator<Producto> iteratorProducto = productos.iterator();
        while (iteratorProducto.hasNext()) {
            Producto producto = (Producto) iteratorProducto.next();
            if (producto.getNombre().contentEquals("Laptop")) {
                System.out.println(producto);
            }

        }

        /*📙 Ejercicio 4: Contar ocurrencias
Con una lista de Persona (con nombre y ciudad),
usa un Iterator para contar cuántas personas viven en "Lima".*/
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Brayan", 20, "lima"));
        personas.add(new Persona("Marino", 18, "ayacucho"));
        personas.add(new Persona("Renato", 19, "lima"));
        Iterator<Persona> iteratorPersona = personas.iterator();
        int i = 0;
        while (iteratorPersona.hasNext()) {
            Persona persona = (Persona) iteratorPersona.next();
            if (persona.getCiudad().equalsIgnoreCase("Lima")) {
                i++;
            }
        }
        System.out.println("Numeor de cantidad que viven en Lima: " + i);

        /*📒 Ejercicio 5: Reemplazar (con ayuda de índice)
            Aunque Iterator no permite reemplazar directamente,
            combina un ListIterator para reemplazar los nombres de todos los Cliente
            cuyo nombre sea "Invitado" por "Cliente Anónimo".*/
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Invitado"));
        clientes.add(new Cliente("brayan"));
        clientes.add(new Cliente("Invitado"));
        
        ListIterator<Cliente> listIterator = clientes.listIterator();
        while (listIterator.hasNext()) {
            Cliente next = listIterator.next();
            if (next.getNombre().equalsIgnoreCase("invitado")) {
              //  next.setNombre("Cliente Anónimo");//asi o la siguiente linea?
                listIterator.set(new Cliente("Cliente Anónimo"));
            }
        }
        System.out.println(clientes);
    }

    private static class Cliente {

        String nombre;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Cliente(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "Cliente{" + "nombre=" + nombre + '}';
        }
        
    }
}
