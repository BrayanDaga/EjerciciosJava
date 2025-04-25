/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

import Modelos.Calculadora;
import Modelos.ContadorObjetos;
import Modelos.Estudiante;
import java.util.Arrays;

/**
 *
 * @author bm_vd
 */
public class Nivel1 {

    public static void main(String[] args) {
        /*
Ejercicio 1: static
Crea una clase ContadorObjetos que tenga:
Una variable static para contar cuántos objetos se crean.
Cada vez que crees un objeto, incrementa el contador.
Un método static que imprima cuántos objetos se han creado.*/

        new ContadorObjetos();
        new ContadorObjetos();
        new ContadorObjetos();
        System.out.println(ContadorObjetos.mostrarContador());

        /*
Ejercicio 2: super
Crea dos clases:

Persona con atributos nombre y edad.

Estudiante que herede de Persona y además tenga carrera.

Usa super para inicializar los datos heredados.*/
        Estudiante es = new Estudiante("Brayan", 28, "develop");
        System.out.println(es);

        /*  
Ejercicio 3: arrays multidimensionales
Crea una matriz 3x3 de enteros.

Rellena la matriz con los números del 1 al 9.

Imprime la matriz en formato tabla.*/
        int[][] miMatriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < miMatriz.length; i++) {

            for (int j = 0; j < miMatriz[i].length; j++) {
                System.out.print(miMatriz[i][j] + " ");
            }
            System.out.println("");
        }

        /*
Ejercicio 4: Arrays (clase utilitaria)
Crea un arreglo de 5 números desordenados.

Usa Arrays.sort para ordenarlos.

Luego usa Arrays.fill para cambiar todos los valores a 0.

Imprime el resultado después de cada operación.*/
        int[] myArray2 = {4, 6, 3, 2, 1, 7, 9, 2};
        System.out.println(Arrays.toString(myArray2));
        Arrays.sort(myArray2);
        System.out.println(Arrays.toString(myArray2));
        Arrays.fill(myArray2, 0);
        System.out.println(Arrays.toString(myArray2));

        /*
Ejercicio 5: sobrecarga
Crea una clase Calculadora.
Implementa métodos sumar para:
Dos enteros.
Dos doubles.
Tres enteros.*/
        Calculadora calc = new Calculadora();
        System.out.println(calc.sumar(4, 5));
        System.out.println(calc.sumar(4.50, 5.50));
        System.out.println(calc.sumar(1, 2, 3, 4, 5, 6, 7));

        /*        
Ejercicio 6: JavaDoc
Documenta tu clase Calculadora con JavaDoc:

Explica qué hace la clase.

Documenta cada método de suma indicando parámetros y valor de retorno.*/
        /**
         * *
         * Ver archivo Calculadora.java
         */
    }
}
