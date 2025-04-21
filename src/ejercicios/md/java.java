/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.md;

import java.util.List;
import java.util.Optional;
import java.util.Comparator;
import Modelos.Auto;
import Modelos.Producto;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author bm_vd
 */
public class java {

    public static void main(String[] args) {
        /*🎯 Reto 1: Nombres en mayúscula
Tienes esta lista:

List<String> nombres = List.of("Brayan", "Lucia", "Carlos", "Ana");
Obtén una lista nueva donde todos estén en MAYÚSCULAS.*/
        System.out.println("🎯 Reto 1: Nombres en mayúscula");
        List<String> nombres = List.of("Brayan", "Lucia", "Carlos", "Ana", "Jose");
        List<String> mayus = nombres.stream().map(nombre -> nombre.toUpperCase()).toList();
        System.out.println(mayus);

        System.out.println("*************************************************************");
        /*🎯 Reto 2: Hay al menos un número par
Dada esta lista:

List<Integer> numeros = List.of(1, 3, 5, 7, 9, 10);
¿Hay algún número par? (Resultado: true o false) */
        System.out.println("*🎯 Reto 2: Hay al menos un número par");
        List<Integer> numeros = List.of(1, 3, 5, 7, 9, 10);
        boolean hayPar = numeros.stream().anyMatch(numero -> numero % 2 == 0);
        System.out.println("Hay par?: " + hayPar);
        System.out.println("*************************************************************");
        /*🎯 Reto 3: Nombre que empiece con 'J'
Lista:
List<String> nombres = List.of("Ana", "Jose", "Lucia", "Pedro");
Busca el primer nombre que empiece con "J".
(Puede salir un Optional<String> vacío o lleno.)*/
        Optional<String> nombreJ = nombres.stream().filter(nombre -> nombre.startsWith("J")).findFirst();
        System.out.println(nombreJ.orElse("No hay nombre con J"));
        System.out.println("*************************************************************");

        /*🎯 Reto 4: Palabras con más de 5 letras
List<String> palabras = List.of("Hola", "Programación", "Java", "Stream", "Ejercicios", "Sol");
Filtra solo las palabras que tengan más de 5 letras.*/
        System.out.println("🎯 Reto 4: Palabras con más de 5 letras");
        List<String> palabras = List.of("Hola", "Programación", "Java", "Stream", "Ejercicios", "Sol");
        List<String> may5 = palabras.stream().filter(palabra -> palabra.length() > 5).toList();
        System.out.println(may5);
        System.out.println("*************************************************************");

        /*🎯 Reto 5: Número más grande
Lista:
List<Integer> numeros = List.of(45, 32, 88, 23, 64);
Obtén el número más grande.*/
        System.out.println("🎯 Reto 5: Número más grande");
        List<Integer> numeros2 = List.of(45, 32, 88, 23, 64);
        Optional<Integer> numeroMayor = numeros2.stream().max(Comparator.naturalOrder());
        System.out.println(numeroMayor);
        System.out.println("*************************************************************");

        /*🎯 Reto 6: Todos los números positivos
List<Integer> lista = List.of(10, 3, 7, -2, 15);
¿Todos los números son positivos? (true o false)*/
        System.out.println("Reto 6: Todos los números positivos");
        List<Integer> lista = List.of(10, 3, 7, -2, 15);
        boolean todosPositivos = lista.stream().allMatch(ele -> ele > 0);
        System.out.println("Son todos positivos? : " + todosPositivos);
        System.out.println("*************************************************************");

        /*🎯 Reto 7: Filtrar autos por precio
List<Auto> autos = List.of(
    new Auto("Toyota", 15000),
    new Auto("BMW", 30000),
    new Auto("Kia", 18000)
);
Filtra los autos que cuesten más de 20,000.*/
        System.out.println("🎯 Reto 7: Filtrar autos por precio");
        List<Auto> autos = List.of(
                new Auto("Toyota", 15000),
                new Auto("BMW", 30000),
                new Auto("Kia", 18000)
        );

        List<Auto> autoMas20k = autos.stream().filter(auto -> auto.getPrecio() > 20000).toList();
        System.out.println(autoMas20k);
        System.out.println("*************************************************************");

        /*🎯 Reto 8: Contar productos por categoría
Supón que Producto tiene:

String nombre;
String categoria;
double precio;
Ahora, cuenta cuántos productos hay por cada categoría.*/
        System.out.println("🎯 Reto 8: Contar productos por categoría");
        List<Producto> productos = List.of(
                new Producto("Laptop HP", "COD123", "Tecnología", 1500.0),
                new Producto("MacBook Air", "COD456", "Tecnología", 800.0),
                new Producto("Mouse Logitech", "COD789", "Accesorios", 20.0),
                new Producto("Mouse Genius", "COD712", "Accesorios", 30.0),
                new Producto("Teclado Mecánico", "COD711", "Accesorios", 60.0),
                new Producto("Teclado Inalámbrico", "COD546", "Accesorios", 65.0),
                new Producto("Monitor Samsung", "COD8764", "Tecnología", 150.0),
                new Producto("Monitor LG", "COD963", "Tecnología", 160.0),
                new Producto("Router TP-Link", "COD369", "Redes", 500.0),
                new Producto("Router D-Link", "COD852", "Redes", 600.0)
        );
        Map<String, Long> produMapCategoria = productos.stream().collect(
                Collectors.groupingBy(Producto::getCategoria, Collectors.counting())
        );
        System.out.println(produMapCategoria);
        System.out.println("*************************************************************");

        /*🎯 Reto 9: Producto más caro y más barato
En una lista de Producto, encuentra:
El producto más caro (max)
El producto más barato (min)*/
        System.out.println("🎯 Reto 9: Producto más caro y más barato");
        Optional<Producto> productoMax = productos.stream().
                max(Comparator.comparingDouble(producto -> producto.getPrecio()));
        Optional<Producto> productoMin = productos.stream().
                min(Comparator.comparingDouble(producto -> producto.getPrecio()));
        System.out.println(productoMax);
        System.out.println(productoMin);
        System.out.println("*************************************************************");

        /*🎯 Reto 10 (BONUS): Concatenar códigos de productos
Supón esta lista:
List<Producto> productos = List.of(
    new Producto("Laptop", "COD123", 1500),
    new Producto("Tablet", "COD456", 800),
    new Producto("Mouse", "COD789", 20)
);        
Concatena todos los códigos en un solo String separados por "|", así:
COD123|COD456|COD789
👊🏻 ¡Listo, ahí tienes los 10 RETOS!*/
        System.out.println("🎯 Reto 10 (BONUS): Concatenar códigos de productos");
   String productoString = productos.stream().map(producto->producto.getCodigo()).collect(Collectors.joining("|"));
        System.out.println(productoString);
    }
}
