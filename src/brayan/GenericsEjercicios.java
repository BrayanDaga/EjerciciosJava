/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

import Modelos.Caja1;
import Modelos.Contenedor;
import Modelos.Pila;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GenericsEjercicios {

    public static void main(String[] args) {
        /*Reto: Crea una clase genérica Caja<T> que almacene un 
        objeto de cualquier tipo y tenga:
        un método guardar(T objeto)
        un método obtener() que retorne ese objeto
        un método mostrarTipo() que imprima el tipo guardado 
        (objeto.getClass().getSimpleName())*/
        Caja1<String> caja1 = new Caja1<>();
        caja1.guardar("Brayan");
        System.out.println(caja1.obtener());
        System.out.println(caja1.mostrarTipo());
        Caja1<Integer> caja2 = new Caja1();
        caja2.guardar(28);
        System.out.println(caja2.obtener());
        System.out.println(caja2.mostrarTipo());

        /*🔁 Clase Pila<T>
        Crea una clase genérica Pila<T> que simule una pila (push, pop, isEmpty).
        Prueba la pila con Strings y con enteros.*/
        Pila<String> pila1 = new Pila<>();
        pila1.push("Uno");
        pila1.push("Dos");
        pila1.push("Tres");
        pila1.pop();
        pila1.mostrar();

        Pila<Integer> pila2 = new Pila<>();
        pila2.push(2121);
        pila2.push(433);
        pila2.push(67);
        pila2.pop();
        pila2.mostrar();

        /*📦 Clase Contenedor<K, V>
        Implementa una clase que almacene un par clave-valor.
        Agrega un método para intercambiar clave y valor (si ambos son del mismo tipo).*/
        Contenedor<Integer, String> conte1 = new Contenedor<>(1, "uno");
        System.out.println(conte1.getValor());

        Contenedor<String, String> conte2 = new Contenedor<>("Clave", "valor");
        conte2.setClave("valor");
        conte2.setValor("Clave");
        System.out.println(conte2.getValor());

        /*📇 Método genérico encontrarMax
        Crea un método genérico que reciba un array de Comparable y devuelva el máximo.
        Prueba con un array de Integer y de String.*/
        Comparable[] arr1 = {1, 2, 3, 4};
        Comparable[] arr2 = {"uno", "dos", "tres", "cuatro"};
        System.out.println(encontrarMax(arr1));
        System.out.println(encontrarMin(arr2));
        System.out.println(encontrarMin(arr2));

        /*🧮 Método sumaNumeros
        Crea un método que reciba una lista de cualquier tipo que extienda Number y retorne la suma.*/
        Integer[] arrInt = {1, 2, 3, 4, 5, 6};
        System.out.println(sumarNum(arrInt));

        /*Wildcard flexible
        Crea una función que imprima cualquier lista (List<?>) y otra que solo acepte List<? extends Number>.*/
        List<String> lista1 = List.of("a", "b", "c", "d", "e");
        List<Integer> lista2 = List.of(1, 2, 3, 4, 5);
        imprimirLista(lista1);
        imprimirLista(lista2);
        imprimirListaNumber(lista2);
        //imprimirListaNumber(lista1); <- No se puede porque no es number

    }

    public static <T extends Comparable<T>> T encontrarMax(T[] arr) {
        return (T) Arrays.stream(arr).max(Comparator.naturalOrder()).orElse(null);
    }

    public static <T extends Comparable<T>> T encontrarMin(T[] arr) {
        return (T) Arrays.stream(arr).min(Comparator.naturalOrder()).orElse(null);
    }

    public static <T extends Number> double sumarNum(T[] arr) {
        return Arrays.stream(arr).mapToDouble(Number::doubleValue).sum();
    }

    private static void imprimirLista(List<?> lista) {
        /* for (Object ele : lista) {
            System.out.println(ele);
        }*/
        System.out.println(lista);

    }

    private static void imprimirListaNumber(List<? extends Number> lista) {
        /*  for (Object ele : lista) {
            System.out.println(ele);
        }*/
        System.out.println(lista);
    }
}
