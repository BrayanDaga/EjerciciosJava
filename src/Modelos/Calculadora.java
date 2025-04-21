/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.Arrays;

/**
 *
 * @author Brayan Marino Vilchez Daga
 */
public class Calculadora {
/***
 * 
 * @param n1 int  
 * @param n2 int 
 * @return retorna suma int
 */
    public int sumar(int n1, int n2) {
        return n1 + n2;
    }
/***
 * 
 * @param n1  double 
 * @param n2  double
 * @return retorna suma double
 */
    public double sumar(double n1, double n2) {
        return n1 + n2;
    }
/***
 * 
 * @param n1 int
 * @param n2 int
 * @param n3 int
 * @return suma int
 */
    public int sumar(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

/***
 * 
 * @param numero n Numeros int
 * @return  suma de n numeros int
 */
    public int sumar(int... numero) {
        return Arrays.stream(numero).sum();
    }

  /***
 * 
 * @param numero n Numeros double
 * @return  suma de n numeros double
 */
    public double sumar(double... numero) {
        return Arrays.stream(numero).sum();
    }
}
