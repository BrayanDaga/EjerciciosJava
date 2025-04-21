/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author bm_vd
 */
public class ContadorObjetos {
    static int contador=0;

    public ContadorObjetos() {
        contador++;
    }
    
    public static int mostrarContador() {
        return contador;
    }
}
