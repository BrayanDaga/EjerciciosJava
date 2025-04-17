/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

import java.util.Scanner;

/**
 *
 * @author Utente
 */
public class VectorOrdenamiento {

    String[] paises = new String[5];
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        VectorOrdenamiento obj = new VectorOrdenamiento();
        obj.cargar();
        obj.ordenar();
        obj.imprimir();
    }

    private void cargar() {
        System.out.println("Ingrese los 5 paises ");
        for (int i = 0; i < paises.length; i++) {
            System.out.print("Pais " + (i + 1) + " : ");
            paises[i] = scanner.nextLine();
        }
    }

    private void ordenar() {

        for (int i = 0; i <4; i++) {
            //5
            for (int j = 0; j < 4- i; j++) {
                //Peru > Chile  Q 
                if (paises[j].compareTo(paises[j + 1]) > 0) {
                    String aux ;
                    //Chile = Peru
                    //Peru = chile
                    aux = paises[j + 1];
                    paises[j + 1] = paises[j];
                    paises[j] = aux;

                }
            }

        }
    }

    private void imprimir() {
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i]);
        }
    }

}
