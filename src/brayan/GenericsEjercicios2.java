/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

import Modelos.Par1;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class GenericsEjercicios2 {

    public static void main(String[] args) {
        /*Crea una clase Par<T, U> que almacene dos elementos genéricos 
    (pueden ser de distinto tipo).
    Agrega métodos:
    getPrimero()
    getSegundo()
    mostrarTipos() → imprime ambos tipos.*/
        Par1<String, Integer> par1 = new Par1<>("Edad", 30);

        System.out.println(par1.getPrimero());
        System.out.println(par1.getSegundo());
        par1.mostrarTipos();

        /*2. 🧮 Operaciones con arrays
        Crea un método genérico:
        <T extends Number> double promedio(T[] numeros)
        Devuelve el promedio de los elementos.*/
        Integer[] numeros = {20, 30, 25, 18, 22};
        System.out.println(obtenerPromedio(numeros));

        /*3. 🔍 Buscar un elemento en un array
        Crea un método:
        <T> boolean contiene(T[] array, T valor)
        Retorna true si el valor está en el array.*/
        String[] vocales = {"a", "e", "i", "o", "u"};
        System.out.println(elementoEncontrado(numeros,15));
        System.out.println(elementoEncontrado(vocales,"e"));
        
    }

    private static <T extends Number> double obtenerPromedio(T[] numeros) {
        return Arrays.stream(numeros).mapToDouble(Number::doubleValue).sum() / numeros.length;
    }

    private static <T> boolean elementoEncontrado(T[] arr, T valor) {
        return Arrays.stream(arr).anyMatch(e -> e.equals(valor));
    }

}
