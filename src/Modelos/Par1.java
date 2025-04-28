/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Utente
 */
public class Par1<T, U> {

    T valor1;
    U valor2;

    public Par1(T valor1, U valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public T getPrimero() {
        return valor1;
    }

    public U getSegundo() {
          return valor2;
    }

    public void mostrarTipos() {
        System.out.println("Tip de primero "+ valor1.getClass().getSimpleName());
    System.out.println("Tip de segundo "+ valor2.getClass().getSimpleName());
    }

   

}
