package brayan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioCajero {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa el dinero que deseas sacar: ");
            int dinero = scanner.nextInt();
            
            ArrayList<Integer> billetes = new ArrayList<>(Arrays.asList(100, 50, 20, 10));
            
            billetes.add(0, 200);
            billetes.add(0, 500);
            
            if (dinero <= 0 || dinero % 10 != 0) {
                System.out.println("Monto inválido. Debe ser positivo y múltiplo de 10.");
            } else {
                for (int billete : billetes) {
                    int cantidad = dinero / billete;
                    if (cantidad > 0) {
                        System.out.println(cantidad + " de " + billete);
                    }
                    dinero %= billete;
                }
            }
        }
    }

}
