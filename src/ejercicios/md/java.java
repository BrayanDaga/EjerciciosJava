/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.md;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.Comparator;

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
        List<String> nombres = List.of("Brayan", "Lucia", "Carlos", "Ana", "Jose");
        List<String> mayus = nombres.stream().map(nombre -> nombre.toUpperCase()).toList();
        System.out.println(mayus);

        System.out.println("*************************************************************\n");
        /*🎯 Reto 2: Hay al menos un número par
Dada esta lista:

List<Integer> numeros = List.of(1, 3, 5, 7, 9, 10);
¿Hay algún número par? (Resultado: true o false) */
        List<Integer> numeros = List.of(1, 3, 5, 7, 9, 10);
        boolean hayPar = numeros.stream().anyMatch(numero -> numero % 2 == 0);
        System.out.println("Hay par?: " + hayPar);
        System.out.println("*************************************************************\n");
        /*🎯 Reto 3: Nombre que empiece con 'J'
Lista:
List<String> nombres = List.of("Ana", "Jose", "Lucia", "Pedro");
Busca el primer nombre que empiece con "J".
(Puede salir un Optional<String> vacío o lleno.)*/
        Optional<String> nombreJ = nombres.stream().filter(nombre -> nombre.startsWith("J")).findFirst();
        System.out.println(nombreJ.orElse("No hay nombre con J"));
        System.out.println("*************************************************************\n");

        /*🎯 Reto 4: Palabras con más de 5 letras

List<String> palabras = List.of("Hola", "Programación", "Java", "Stream", "Ejercicios", "Sol");
Filtra solo las palabras que tengan más de 5 letras.*/
        List<String> palabras = List.of("Hola", "Programación", "Java", "Stream", "Ejercicios", "Sol");
        List<String> may5 = palabras.stream().filter(palabra -> palabra.length() > 5).toList();
        System.out.println(may5);
                System.out.println("*************************************************************\n");

        /*🎯 Reto 5: Número más grande
Lista:
List<Integer> numeros = List.of(45, 32, 88, 23, 64);
Obtén el número más grande.*/
        List<Integer> numeros2 = List.of(45, 32, 88, 23, 64);
        Optional<Integer> numeroMayor = numeros2.stream().max(Comparator.naturalOrder());
        System.out.println(numeroMayor);
        System.out.println("*************************************************************\n");

        /*🎯 Reto 6: Todos los números positivos
List<Integer> lista = List.of(10, 3, 7, -2, 15);
¿Todos los números son positivos? (true o false)*/
        List<Integer> lista = List.of(10, 3, 7, -2, 15);
        boolean todosPositivos = lista.stream().allMatch(ele -> ele > 0);
        System.out.println("Son todos positivos? : " + todosPositivos);
                System.out.println("*************************************************************\n");

        /*🎯 Reto 7: Filtrar autos por precio
List<Auto> autos = List.of(
    new Auto("Toyota", 15000),
    new Auto("BMW", 30000),
    new Auto("Kia", 18000)
);
Filtra los autos que cuesten más de 20,000.*/

 /*🎯 Reto 8: Contar productos por categoría
Supón que Producto tiene:

String nombre;
String categoria;
double precio;
Ahora, cuenta cuántos productos hay por cada categoría.*/

 /*🎯 Reto 9: Producto más caro y más barato
En una lista de Producto, encuentra:
El producto más caro (max)
El producto más barato (min)*/

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
    }
}
