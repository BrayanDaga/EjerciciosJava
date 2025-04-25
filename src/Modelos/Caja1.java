/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Utente
 */
public class Caja1<T> {
    private T contenido;
    
    public void guardar(T valor){
        contenido = valor;
    }
    
    public T obtener(){
        return contenido;
    }
    
    public String mostrarTipo(){
        return contenido.getClass().getSimpleName();
    }
    
}
