package brayan;
	
import java.util.InputMismatchException;
import java.util.Scanner;
	
	public class SumaDigitos {
	
		/*Escribe un programa que reciba un número entero y devuelva la suma de sus dígitos.
	Ejemplo: Entrada: 1234 → Salida: 10*/
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ingresa un numero");
			try {
				int num = scanner.nextInt();
	
				int sum = 0;
				while (num>0) {
					sum += num%10;
					num = num/10;
				}
				System.out.println(sum);
			} catch (InputMismatchException e) {
				System.err.println(e);
				System.err.println("Debes de poner un numero");
			}
			
			scanner.close();
		}
	
	}
