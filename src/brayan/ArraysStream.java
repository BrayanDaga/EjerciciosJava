/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

import java.util.Arrays;

/**
 *
 * @author bm_vd
 */
public class ArraysStream {

    public static void main(String[] args) {
        int[] numeros = {5, 3, 9, 1, 4};
        String[] nombres = {"Brayan", "Diego", "Renato", "Nahel"};
        
        Arrays.sort(numeros);
        System.out.println("Array ordenado asc " + Arrays.toString(numeros));
        int indice = Arrays.binarySearch(nombres, "Renato");
        System.out.println("Renato posicio: " + indice);
        
        int[] copia = Arrays.copyOf(numeros, 7);
        System.out.println("Array copiado: " + Arrays.toString(copia));
        
        Arrays.stream(nombres).forEach(System.out::println);
        int suma = Arrays.stream(numeros).sum();
        System.out.println("Suma de los numeros : " + suma);
        
        Arrays.asList(numeros); // convertri a lista
        System.out.println(Arrays.toString(numeros));
    }
}
