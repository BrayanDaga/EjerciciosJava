package brayan;

import Modelos.Empresa;
import Modelos.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioPOO {

    public static void main(String[] args) {
        try ( /*Crea una clase Empleado con nombre, edad, salario.
             * Luego crea una clase Empresa con una lista de empleados y métodos para:
            Agregar empleados
            Eliminar por nombre
            Mostrar los empleados con salario mayor a cierto monto*/
            Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            Empresa empresa = new Empresa();
            while (continuar) {
                System.out.println("""
                                   Opciones del Menu 
                                   1. Agregar empleados
                                   2. Eliminar por nombre
                                   3. Mostrar los empleados con salario mayor a cierto monto
                                   4. Salir""");
                int opcion = scanner.nextInt();
                switch (opcion) {

                    case 1 -> {
                        scanner.nextLine();
                        Empleado newEmpleado = new Empleado();
                        System.out.println("Ingrese nombre del nuevo Empleado: ");
                        newEmpleado.setNombre(scanner.nextLine());
                        System.out.println("Ingrese su edad : ");
                        newEmpleado.setEdad(scanner.nextInt());
                        System.out.println("Ingree su salario : ");
                        newEmpleado.setSalario(scanner.nextInt());
                        empresa.setEmpleados(newEmpleado);
                    }
                    case 2 -> {
                        System.out.print("Ingrese el salario mínimo a filtrar: ");
                        int monto = scanner.nextInt();
                        System.out.println("Empleados con salario mayor a " + monto + ":");
                        empresa.getEmpleados().stream()
                                .filter(e -> e.getSalario() > monto)
                                .forEach(System.out::println);
                    }
                    case 3 -> {
                        System.out.println("Mostrando Empleados : ");
                        ArrayList<Empleado> listaEmpleados = new ArrayList<>(empresa.getEmpleados());
                        listaEmpleados.forEach(empleado -> {
                            System.out.println(empleado);
                        });
                    }
                    case 4 -> {
                        continuar = false;
                        System.out.println("Adios");
                    }
                    default -> {
                    }
                }

            }
        }

    }

}
