/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brayan;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Utente
 */
public class RegexEjemplo {
    public static void main(String[] args) {
        /*✅ Ejemplo 1: Validar números enteros (positivos o negativos)*/
        String[] pruebas1 = {"123", "-45", "+789", "abc", "12a"};

        for (String texto : pruebas1) {
            if (texto.matches("[-+]?\\d+")) {
                System.out.println(texto + " es un número entero válido.");
            } else {
                System.out.println(texto + " NO es válido.");
            }
        }
        /* [-+]? → Puede empezar con - o + (opcional)
         * \\d+ → Uno o más dígitos  */
        System.out.println("/**********************************************/");
        
        /*✅ Ejemplo 2: Validar números decimales*/
        String[] pruebas2 = {"3.14", "-0.99", "10", "+2.718", "12.", ".5", "abc"};

        for (String texto : pruebas2) {
            if (texto.matches("[-+]?\\d*\\.\\d+")) {
                System.out.println(texto + " es un número decimal válido.");
            } else {
                System.out.println(texto + " NO es válido.");
            }
        }
        
        /*[-+]? → signo opcional
         * \\d* → dígitos antes del punto (opcional)
         * \\. → el punto decimal (obligatorio)
         * \\d+ → al menos un dígito después del punto*/

    }
}
