/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;

/**
 *
 * @author bm_vd
 */
public class ArraysListStreamEjercicio {

    public static void main(String[] args) {

        /*
Ejercicio 1: Nombres en mayúsculas
Dada una lista de nombres, obtén una nueva lista con todos los nombres en mayúsculas.
Ejemplo de entrada:
["Brayan", "Lucia", "Carlos", "Ana"]
Salida esperada:
["BRAYAN", "LUCIA", "CARLOS", "ANA"]
         */
        List<String> nombres = List.of("Brayan", "Lucia", "Carlos", "Ana");

        List<String> mayus = nombres.stream().map(e -> e.toUpperCase()).toList();

        imprimirLista(mayus);

        /*Ejercicio 2: Filtrar mayores de edad
Dada una lista de edades, obtén una lista con solo las personas mayores o iguales a 18
Entrada:
[15, 22, 12, 30, 18, 10]
Salida esperada:
[22, 30, 18].*/
        List<Integer> edades = List.of(15, 22, 12, 30, 18, 10);
        List<Integer> mayores = edades.stream().filter(e -> e >= 18).toList();
        imprimirLista(mayores);

        /*💰 Ejercicio 3: Calcular el total
Dada una lista de precios de productos, calcula el total.

Entrada:
[99, 149, 79, 120]
Salida esperada:
Total: 447*/
        List<Integer> precios = List.of(99, 149, 79, 120);
        int total = precios.stream().reduce(0, (a, b) -> a + b);
        System.out.println(total);

        /* Ejercicio 4: ¿Hay algún número par?
Dada una lista de enteros, verifica si existe al menos un número par.

Entrada:
[1, 3, 5, 7, 9, 10]
Salida esperada:
true*/
        List<Integer> numeros = List.of(1, 3, 5, 7, 9, 10);
        boolean hayAlgunPar = numeros.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(hayAlgunPar);

        /*Ejercicio 5: Encuentra un nombre que empiece con 'J'
Dada una lista de nombres, encuentra alguno que comience con la letra 'J' (si existe).*/
        List<String> nombres2 = List.of("Pedro", "Julia", "Marcos", "Javier");
        Optional<String> nombreconJ = nombres2.stream().filter(e -> e.startsWith("J")).findFirst();
        System.out.println(nombreconJ.orElse("No se encontraron nombres con J"));
    }

    public static void imprimirLista(List lista) {
        System.out.println(Arrays.toString(lista.toArray()));
    }
}
