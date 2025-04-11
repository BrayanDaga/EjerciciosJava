package brayan;

import java.util.*;

public class CajeroConEstilo {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> billetes = new ArrayList<>(Arrays.asList(100, 50, 20, 10));
        ArrayList<String> historial = new ArrayList<>();

        boolean salir = false;

        while (!salir) {
            System.out.println("\n🔷🔷 Bienvenido al Cajero 🔷🔷");
            System.out.println("1. Retirar dinero");
            System.out.println("2. Ver historial de retiros");
            System.out.println("3. Salir");
            System.out.print("👉 Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\n💰 Ingresa el monto a retirar: ");
                    int monto = scanner.nextInt();

                    if (monto <= 0 || monto % 10 != 0) {
                        System.out.println("⚠️ Monto inválido. Debe ser positivo y múltiplo de 10.");
                        break;
                    }

                    System.out.println("\n🔊 BEEP! Procesando solicitud...\n");
                    Thread.sleep(1000);

                    int original = monto;
                    StringBuilder recibo = new StringBuilder();
                    recibo.append("\n🧾 === RECIBO ===\n");
                    recibo.append("Monto solicitado: ").append(original).append("\n");

                    // Animación de retiro de billetes
                    for (int billete : billetes) {
                        int cantidad = monto / billete;
                        if (cantidad > 0) {
                            recibo.append(cantidad).append(" x ").append(billete).append("\n");

                            // animación simple de billetes saliendo
                            for (int i = 0; i < cantidad; i++) {
                                System.out.print("🟩💸 ");
                                Thread.sleep(300);
                            }
                            System.out.println(); // salto después de animar billetes
                        }
                        monto %= billete;
                    }

                    recibo.append("----------------------\n");
                    recibo.append("Gracias por usar nuestro cajero. 😊\n");

                    // Imprimir recibo línea por línea
                    System.out.println("\n🖨️ Imprimiendo recibo...\n");
                    Thread.sleep(1000);
                    for (String linea : recibo.toString().split("\n")) {
                        System.out.println(linea);
                        Thread.sleep(300);
                    }

                    historial.add("Retiro de " + original + " realizado.");
                    break;

                case 2:
                    System.out.println("\n📜 Historial de retiros:");
                    if (historial.isEmpty()) {
                        System.out.println("No hay retiros aún.");
                    } else {
                        for (String registro : historial) {
                            System.out.println("• " + registro);
                        }
                    }
                    break;

                case 3:
                    salir = true;
                    System.out.println("👋 ¡Gracias por usar el cajero! Hasta pronto.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }
}
