/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author bm_vd
 */
public class ListStreamEjemplos {

    public static void main(String[] args) {
        List<String> nombres = List.of("Ana", "Luis", "Pedro");
        nombres.forEach(nombre -> System.out.println("Hola " + nombre));  // Inmutable

        String[] nomi = {"Ana", "Luis"};
        List<String> listaMutable = new ArrayList<>(List.of(nomi));
        listaMutable.replaceAll(nombre -> nombre.toUpperCase()); // Mutable
        listaMutable.forEach(System.out::println);

        //Reloaded
        List<Integer> numeros = List.of(1, 2, 3);
        List<Integer> alCuadrado = numeros.stream()
                .map(n -> n * n)
                .toList();

        List<Integer> alCubo = numeros.stream().map(n -> (int) n * n * n).toList();
        alCubo.forEach(System.out::println);

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        int suma = numeros.stream()
                .reduce(0, (a, b) -> a + b);

        List<String> palabras = List.of("Hola", "Mundo");
        String frase = palabras.stream()
                .reduce("", (a, b) -> a + " " + b).trim();
        StringBuffer frase1 = new StringBuffer();
        palabras.forEach(e -> frase1.append(e + " "));
        System.out.println(frase);
        System.out.println(frase1);

        boolean algunoEsMayorQue2 = numeros.stream()
                .anyMatch(n -> n > 2);
        boolean todosPositivos = numeros.stream()
                .allMatch(n -> n > 0);

        //encuentra el primero
        Optional<Integer> encontrado = numeros.stream()
                .filter(n -> n > 1)
                .findFirst();

        System.out.println(encontrado);

        List<String> ordenado = List.of("Zorro", "Ana", "Luis").stream()
                .sorted(Comparator.naturalOrder())
                .toList();
        ordenado.forEach(System.out::println);

        int index = IntStream.range(0, nombres.size())
                .filter(i -> nombres.get(i).equals("Luis"))
                .findFirst()
                .orElse(-1);
        System.out.println(index);

        List<String> relleno = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Collections.fill(relleno, "x");  // ["x", "x", "x"]

        boolean contiene = nombres.contains("Ana");  // true
        String unido = String.join(", ", nombres);  // "Ana, Luis, Pedro"
        System.out.println(unido);

        List<String> lista1 = List.of("a", "b");
        List<String> lista2 = List.of("c", "d");
        List<String> combinado = Stream.concat(lista1.stream(), lista2.stream())
                .toList();

        List<List<String>> anidado = List.of(List.of("a", "b"), List.of("c", "d"));
        List<String> plano = anidado.stream()
                .flatMap(List::stream)
                .toList();

        List<String> textos = List.of("Hola Mundo", "Java Streams");
        List<String> palabrasSeparadas = textos.stream()
                .flatMap(t -> Arrays.stream(t.split(" ")))
                .toList();
        palabrasSeparadas.forEach(System.out::println);

        List<Integer> desordenado = List.of(5, 2, 9);
        List<Integer> ordenado1 = desordenado.stream()
                .sorted()
                .toList();  

    }
}
