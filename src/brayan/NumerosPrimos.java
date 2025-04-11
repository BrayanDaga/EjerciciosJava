	package brayan;
	
	import java.util.InputMismatchException;
import java.util.Scanner;

import brayan.utils.NumeroInvalidoException;
import brayan.utils.Validator;
	
	public class NumerosPrimos {
	
		public static void main(String[] args) throws NumeroInvalidoException {
		     Scanner scanner = new Scanner(System.in);
		        System.out.print("Ingresa un número N: ");
		        try {
		        	 int N = scanner.nextInt();
		        	 Validator.validarNumeroMayor0(N);
				        for (int i = 2; i <= N; i++) {
				            boolean esPrimo = true;
			
				            for (int j = 2; j <= Math.sqrt(i); j++) {
				                if (i % j == 0) {
				                    esPrimo = false;
				                    break;
				                }
				            }
			
				            if (esPrimo) {
				                System.out.print(i + " ");
				            }
				        }
				} catch (InputMismatchException e) {
					System.err.println(e);
					System.err.println("Debe ser un numero");
				}
		       
		       scanner.close();
		}
	}
