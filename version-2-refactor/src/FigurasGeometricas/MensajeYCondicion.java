package FigurasGeometricas;

import java.util.Scanner;

public class MensajeYCondicion {
	
	//Cada condicion acompaña con mensaje por consola
	
	protected static void Case1 (Scanner sc, Figura f) {
		
		System.out.println("Ha seleccionado el Circulo");
		System.out.println("Para esto, es necesario que introduzcas su diametro en centímetros");
		System.out.println("El diametro es el valor de la recta que une dos puntos de una circunferencia, pasando por su centro.");
		double diametro = sc.nextDouble();
		sc.nextLine();
		if (diametro<=0) {
			System.out.println("El area y perímetro de esta figura no existen");
			System.out.println("Introduce un valor correcto");
		} else {
			RecogeDatos.operacionCirculo (diametro, f); //Llamada al metodo encargado de agrupar el calculo
		}			
		
	}
	
	protected static void Case2 (Scanner sc, Figura f) {
		
		System.out.println("Ha seleccionado el Cuadrado");
		System.out.println("Introducir la longitud de uno de los lados del cuadrado en centímetros");
		double base = sc.nextDouble();
		sc.nextLine();
		if (base <= 0) {
			System.out.println("El area y perímetro de esta figura no existen");
			System.out.println("El valor ingresado es incorrecto");
		} else {
			RecogeDatos.operacionCuadrado (base, f);
		}
		
	}
	
	protected static void Case3 (Scanner sc, Figura f) {
		
		double altura, base;
		int num;
			System.out.println("Ha seleccionado el Rectangulo");
			System.out.println("Introducir la longitud de uno de los lados del rectángulo en centímetros");
			base = sc.nextDouble();
			sc.nextLine();
			System.out.println("Introducir la longitud del lado adyacente al primer dato introducido");
			altura = sc.nextDouble();
			sc.nextLine();
			
			if (base > 0 && altura > 0) {
				if (base != altura) {
					RecogeDatos.operacionRectangulo(base, altura, f);
				} else {
					System.out.println("Los datos indican que la figura es un cuadrado");
					do {
						System.out.println("¿Desea continuar calculando el área y el perímetro de un cuadrado?");
						System.out.println("1. SI");
						System.out.println("2. NO");
						num = sc.nextInt();
						sc.nextLine();
						switch (num) {
						case 1:
							RecogeDatos.operacionCuadrado (base, f);
							break;
						case 2:
							System.out.println("Revisa tu figura antes de continuar");
							break;
						default:
							System.out.println("Selecciona una opción válida");
						}
					} while (num != 1 && num != 2);
				}
			} else
				System.out.println("Ingresar un valor correcto");
			
	}
	
	protected static void Case4 (Scanner sc, Figura f) {
		
		double lado1, lado2, base;
		do {
			System.out.println("Introduce el valor en centímetros de la base del triángulo");
			base = sc.nextDouble();
			if (base <= 0) {
				System.out.println("El valor es incorrecto");
			}
		} while (base <= 0);
		do {
			System.out.println("Introduce el valor de un lado del triángulo");
			lado1 = sc.nextDouble();
			if (lado1 <= 0) {
				System.out.println("El valor es incorrecto");
			}
		} while (lado1 <= 0);
		do {
			System.out.println("Introduce el valor del último lado");
			lado2 = sc.nextDouble();
			if (lado2 <= 0) {
				System.out.println("El valor es incorrecto");
			}
		} while (lado2 <= 0);
		
		// La condición es que la suma de dos de los lados de un triángulo, sea mayor
		// que el lado faltante

		if (base + lado1 > lado2 && base + lado2 > lado1
				&& lado2 + lado1 > base) {

			// Medimos el área de cada triángulo - fórmula de Herón -
			RecogeDatos.operacionTriangulo (base, lado1, lado2, f);
			
		} else
			System.out.println("Los valores introducidos no corresponden a los valores de un triángulo");
		
	}

}
