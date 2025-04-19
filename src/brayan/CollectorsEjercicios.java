/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

import Modelos.Producto;
import java.util.List;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;

/**
 *
 * @author Utente
 */
public class CollectorsEjercicios {

    public static void main(String[] args) {
        /*🥇 Ejercicio 1: Convertir lista a set
Entrada: List<String> nombres = List.of("Ana", "Brayan", "Ana", "Carlos");

Tarea: Convierte la lista en un Set para eliminar duplicados.*/
        List<String> nombres = List.of("Ana", "Brayan", "Ana", "Carlos");
        Set<String> nombresSinDup = Set.copyOf(nombres);
        System.out.println(nombresSinDup);

        /*🥈 Ejercicio 2: Unir nombres en un solo String
Entrada: List<String> nombres = List.of("Ana", "Brayan", "Carlos");

Tarea: Une todos los nombres separados por comas (",").

Ejemplo de salida: "Ana,Brayan,Carlos"*/
        String nombreUnido = nombresSinDup.stream().collect(Collectors.joining(","));
        /*  String nombreUnido =  Stream.of(nombresSinDup)
           .collect(Collectors.joining(","));*/
        System.out.println(nombreUnido);

        /*🥉 Ejercicio 3: Obtener promedio de edades
Entrada: List<Integer> edades = List.of(20, 25, 30, 18, 22);

Tarea: Calcula el promedio de todas las edades.
         */
        List<Integer> edades = List.of(20, 25, 30, 18, 22);
        double prom = edades.stream().collect(Collectors.averagingDouble(e -> e));
        System.out.println(prom);

        /*🎯 Ejercicio 4: Mapear producto-código
Supón que tienes una lista:
class Producto {
    private String nombre;
    private String codigo;
    private double precio;
}
Entrada: Lista de productos.

Tarea: Crea un Map<String, String>, 
donde la clave sea el codigo y el valor el nombre del producto.*/
List<Producto> productos = List.of(new Producto("prod1", "cod1", 20.2),
        new Producto("prod2", "cod2", 15.4));
Map<String,String> mapProductos = productos.stream()
       .collect(Collectors.toMap(Producto::getCodigo, Producto::getNombre));
        System.out.println(mapProductos);
      
/*🎯 Ejercicio 5: Agrupar productos por precio
Entrada: Lista de productos.
Tarea: Agrupa los productos en un Map<Double, List<Producto>> donde:
clave: el precio
valor: lista de productos que tienen ese precio*/    
      Map<Double, List<Producto>> agruProd = productos.stream().
              collect(Collectors.groupingBy(Producto::getPrecio));
      System.out.println(agruProd);
    }

}
