package brayan;

import Modelos.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class EjercicioCrud {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Producto> productos =  new ArrayList<>();

            try (Scanner scanner = new Scanner(System.in)) {
                boolean continuar= true;
                while(continuar) {
                    System.out.println("""
                                          Opciones del Menu
                                          1. Agregar producto
                                          2. Mostrar productos
                                          3. Actualizar Producto
                                          4. Eliminar Producto
                                          5. Salir""");
                    int opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1 -> {
                            scanner.nextLine();
                            System.out.print("Intoduce el nombre del producto: ");
                            String nombre = scanner.nextLine();
                            System.out.print("Intoduce el codigo del producto: ");
                            String codigo = scanner.nextLine();
                            System.out.print("Intoduce el precio del producto: ");
                            double precio = scanner.nextDouble();
                            Producto newProducto = new Producto(nombre, codigo, precio);
                            productos.add(newProducto);
                            System.out.println("Producto agregado ...");
                            Thread.sleep(1000);
                        }
                        case 2 -> {
                            System.out.println("Mostrando productos: ");
                            Thread.sleep(3000);
                            productos.forEach(System.out::println);
                        }
                        case 3 -> {
                            scanner.nextLine();
                            System.out.println("Ingresa codigo a actualizar");
                            String opActu = scanner.nextLine();
                            Iterator<Producto> iter = productos.iterator();
                            while (iter.hasNext()) {
                                if (continuar) {
                                    Producto producto = iter.next();
                                    if (producto.getCodigo().equals(opActu)) {
                                        System.out.print("Ingrese el nuevo precio:");
                                        double precioac = scanner.nextDouble();
                                        producto.setPrecio(precioac);
                                        System.out.println("Producto Actualizado");
                                        Thread.sleep(1000);
                                        scanner.nextLine();
                                    }else {
                                        System.out.println("No se encontro el producto");
                                    }
                                }
                            }
                        }
                            
                        case 4 -> {
                            scanner.nextLine();
                            System.out.println("Ingresa codigo a eliminar");
                            String opEli = scanner.nextLine();
                            Iterator<Producto> iter1 = productos.iterator();
                            while (iter1.hasNext()) {
                                if (continuar) {
                                    Producto producto = iter1.next();
                                    if (producto.getCodigo().equals(opEli)) {
                                        iter1.remove();
                                        System.out.println("Producto Eliminado");
                                        Thread.sleep(1000);
                                    }else {
                                        System.out.println("No se encontro el producto");
                                    }
                                }
                            }
                        }
                        case 5 -> {
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
