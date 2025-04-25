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
         String texto = "abc123";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(texto);

        if (matcher.find()) {
            System.out.println("Se encontró un número: " + matcher.group());
        } else {
            System.out.println("No se encontró número.");
        }
    }
}
