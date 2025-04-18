/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

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
public class CollectorsEjemplo {

    public static void main(String[] args) {
        // 1. toList() → convierte el Stream en List
        List<String> lista = Stream.of("A", "B", "C")
                .collect(Collectors.toList());
        System.out.println(lista); // [A, B, C]

// 2. toSet() → convierte en un Set (sin duplicados )
        Set<Integer> numeros = Stream.of(1, 2, 2, 3)
                .collect(Collectors.toSet());
        System.out.println(numeros); // [1, 2, 3]

//3. joining() → concatena Strings
        String nombres = Stream.of("Ana", "Luis", "Pedro")
                .collect(Collectors.joining(", "));
        System.out.println(nombres); // Ana, Luis, Pedro

//4. averagingInt(), averagingDouble(), averagingLong() → calcula el promedio
        double promedio = Stream.of(10, 20, 30)
                .collect(Collectors.averagingInt(x -> x));
        System.out.println(promedio); // 20.0    

//5. summarizingInt() → resumen estadístico (count, sum, min, max, average)
        IntSummaryStatistics stats = Stream.of(10, 20, 30)
                .collect(Collectors.summarizingInt(x -> x));
        System.out.println(stats);
// count=3, sum=60, min=10, average=20.000000, max=30
//✅ Útil si quieres TODO de golpe.        

// 6. groupingBy() → agrupar elementos según una condición
        Map<Integer, List<String>> agrupados = Stream.of("Ana", "Luis", "Pedro", "Sofia")
                .collect(Collectors.groupingBy(String::length));
        System.out.println(agrupados);
// {3=[Ana], 4=[Luis], 5=[Pedro, Sofia]}
//✔ Agrupa por la longitud de cada nombre.

//7. partitioningBy() → dividir en dos grupos (true/false)
        Map<Boolean, List<Integer>> particion = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(particion);
// {false=[1, 3, 5], true=[2, 4]}
/*true → pares
false → impares*/

//8. counting() → contar elementos
        long cantidad = Stream.of("Java", "Python", "C++")
                .collect(Collectors.counting());
        System.out.println(cantidad); // 3
        
//9. mapping() → transforma elementos dentro de otro Collector
String resultado = Stream.of("Java", "Python", "C++")
    .collect(Collectors.mapping(String::toUpperCase, Collectors.joining(", ")));
System.out.println(resultado); // JAVA, PYTHON, C++
//(primero los transforma a mayúsculas, luego los junta)        
    }
}
