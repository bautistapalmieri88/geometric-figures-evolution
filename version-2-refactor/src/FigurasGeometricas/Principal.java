package FigurasGeometricas;

import java.util.Scanner;

public class Principal {

	//Menu Principal - Sin carga de calculos / Condiciones ==> Switch
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int opcion;
			
		System.out.println("==== FIGURAS ====");
		System.out.println("Calcular el area y diametro de figuras geométricas");

		do {

			System.out.println("*Selecciona la figura con la que quieres trabajar*");
			System.out.println("1. Circulo");
			System.out.println("2. Cuadrado");
			System.out.println("3. Rectangulo");
			System.out.println("4. Triangulo");
			System.out.println("0. Salir");
			
			opcion = sc.nextInt();
		
			MenuOpciones.CalculoDeFiguras(opcion, sc);
			
		} while (opcion != 0);
		System.out.println("Gracias por confiar en nuestra APP");
	}

}
