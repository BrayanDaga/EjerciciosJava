/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author Utente
 */
public class Pila<T> {

    ArrayList<T> lista = new ArrayList<>();

    public void push(T valor) {
        lista.add(valor);
    }

    public void pop() {
        if (lista.isEmpty()) {
            return;
        } else {
            lista.remove(lista.size() - 1);
        }
    }
    
    public void mostrar(){
        System.out.println(lista);
    }

}
