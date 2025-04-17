/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

import java.util.List;

/**
 *
 * @author bm_vd
 */
public class ArraysListStreamEjercicio2 {

    public static void main(String[] args) {
        /* Ejercicio 6: Promedio de edades
Dada una lista de edades, calcula el promedio de todas ellas.*/

        List<Integer> edades = List.of(20, 30, 25, 18, 22);
        if (!edades.isEmpty()) {
            int prom = edades.stream().reduce(0, (a, b) -> a + b) / edades.size();
            System.out.println("El promedio es : " + prom);
        } else {
            System.out.println("La lista está vacía, no se puede calcular el promedio.");
        }

        /*🔤 Ejercicio 7: Filtrar palabras largas
De una lista de palabras, obtén una nueva lista que contenga solo aquellas
con más de 5 letras.*/
        List<String> palabras = List.of("Hola", "Programación", "Java", "Stream", "Ejercicios", "Sol");
        List<String> mas5letras = palabras.stream().filter(e -> e.length() > 5).toList();
        mas5letras.forEach(System.out::println);

        /* Ejercicio 8: Concatenar nombres
Tienes una lista de nombres. Une todos los nombres en un solo String, separados por comas.

List<String> nombres = List.of("Ana", "Luis", "Pedro", "Sofia");
Salida esperada: "Ana,Luis,Pedro,Sofia"*/
        List<String> nombres = List.of("Ana", "Luis", "Pedro", "Sofia");
        String cadenaNombres = String.join(",", nombres);
        System.out.println(cadenaNombres);

        /* Ejercicio 9: Encontrar el número más grande
Dada una lista de números, encuentra el valor más alto.*/
        List<Integer> numeros = List.of(45, 32, 88, 23, 64);
        int numeroMayor = numeros.stream().reduce(0, (a, b) -> (a > b) ? a : b);
        System.out.println(numeroMayor);

        /*🧪 Ejercicio 10: Todos los números son positivos
Verifica si todos los números en una lista son positivos (mayores que cero).
         */
        List<Integer> lista = List.of(10, 3, 7, -2, 15);
        boolean sonPositivos = lista.stream().allMatch(n -> n > 0);
        if (sonPositivos) {
            System.out.println("Son todos positivos");
        } else {
            System.out.println("Alguno o todos no son positivos");
        }
    }
}
