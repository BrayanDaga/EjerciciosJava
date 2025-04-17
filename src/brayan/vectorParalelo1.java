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
public class vectorParalelo1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            final String[] nombres = new String[5];
            final int[] edades = new int[5];
            
            for (int i = 0; i < nombres.length; i++) {
                System.out.print("Ingrese nombre: ");
                nombres[i] = scanner.nextLine();
                System.out.print("Ingrese edad: ");
                edades[i] = scanner.nextInt();
                scanner.nextLine();
                System.out.println("----------------------------");
            }
               for (int i = 0; i < edades.length; i++) {
                   if (edades[i]>=18) {
                       System.out.println("Nombre: "+nombres[i]+", Edad: "+edades[i]);
                   }
            }
            
            scanner.close();
        }
    }
}
