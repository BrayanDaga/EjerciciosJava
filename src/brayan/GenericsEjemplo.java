/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

import Modelos.Caja;
import Modelos.Calculadora1;
import Modelos.Par;
import Modelos.Util;
import java.util.List;
import java.util.Arrays;

public class GenericsEjemplo {

    public static void main(String[] args) {

        /* Clase genérica con tipo T*/
        Caja<String> cajaDeTexto = new Caja<>();
        cajaDeTexto.guardar("Hola mundo");
        System.out.println(cajaDeTexto.obtener());

        Caja<Integer> cajaDeEntero = new Caja<>();
        cajaDeEntero.guardar(123);
        System.out.println(cajaDeEntero.obtener());

        /* Clave valor */
        Par<Integer, String> par = new Par<>(1, "Uno");
        System.out.println("Clave: " + par.getClave());
        System.out.println("Valor: " + par.getValor());

        /* Metodo generico */
            Util.imprimir("Texto");
        Util.imprimir(456);

        /*Bounded Generics (extends)*/
        System.out.println(Calculadora1.sumar(3, 4));        // int
        System.out.println(Calculadora1.sumar(3.5, 2.1));    // double

        /* Wildcards (?, ? extends, ? super)*/
        List<String> textos = Arrays.asList("a", "b", "c");
        imprimirLista(textos);

    }

    public static void imprimirLista(List<?> lista) {
        for (Object elemento : lista) {
            System.out.println(elemento);
        }
    }
}
