import java.util.Scanner;

public class Palmieri_Bautista_ActividadEvaluable {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declaración de variables para cada caso

		int num, num2;
		double diametro, ladoCuadrado, ladoRectangulo1, ladoRectangulo2, ladoTriangulo1, ladoTriangulo3, pi = 3.1416,
				ladoTriangulo2;

		System.out.println("-- ÁREA Y PERÍMETRO DE UNA FIGURA GEOMÉTRICA --");

		/*
		 * Sistema de menú con indicaciones para elegir una figura geométrica Mucha
		 * interacción con el usuario Se intenta preveer errores por parte de los
		 * usuarios, teniendo la posibilidad de corrección para no despleagar en cada
		 * momento el menú principal Cada calculo parte del valor más fácil de conseguir
		 */

		do {
			System.out.println("*Selecciona una de las siguientes opciones*");

			System.out.println("1. Círculo");
			System.out.println("2. Cuadrado");
			System.out.println("3. Rectángulo");
			System.out.println("4. Triángulo");
			System.out.println("0. Finalizar");

			num = sc.nextInt();

			switch (num) {
			case 1:

				/*
				 * CIRCULO Petición simple, el número ingresado tiene que ser realista, caso
				 * contrario entra en bucle
				 */

				do {
					System.out.println("Introducir el diámetro del círculo deseado en centímetros");
					diametro = sc.nextDouble();
					if (diametro > 0) {
						System.out.println(
								"El área del círculo es de " + (pi * ((diametro / 2) * (diametro / 2))) + "cm^2");
						System.out.println("El perímetro es de " + (pi * diametro) + "cm");
					} else
						System.out.println("El valor ingresado es incorrecto");
				} while (diametro <= 0);
				break;
			case (2):

				/*
				 * CUADRADO Pedir un (1) solo lado del cuadrado ahorra líneas de código y prevee
				 * posibles errores
				 */

				do {
					System.out.println("Introducir la longitud de uno de los lados del cuadrado en centímetros");
					ladoCuadrado = sc.nextDouble();
					if (ladoCuadrado > 0) {
						System.out.println("El área del cuadrado es de " + (ladoCuadrado * ladoCuadrado) + "cm^2");
						System.out.println("El perímetro del cuadrado es de " + (ladoCuadrado * 4) + "cm");
					} else
						System.out.println("El valor ingresado es incorrecto");
				} while (ladoCuadrado <= 0);
				break;
			case (3):

				/*
				 * RECTANGULO Menú por posible cambio de opinión Salimos del bucle solo si el
				 * usuario llega al valor que desea o lo indique en un submenú en caso de error
				 */

				do {
					System.out.println("Introducir la longitud de uno de los lados del rectángulo en centímetros");
					ladoRectangulo1 = sc.nextDouble();

					System.out.println("Introducir la longitud del lado adyacente al primer dato introducido");
					ladoRectangulo2 = sc.nextDouble();

					// Atención a las condiciones

					if (ladoRectangulo1 > 0 && ladoRectangulo2 > 0) {

						if (ladoRectangulo1 != ladoRectangulo2) {
							System.out.println(
									"El área del rectángulo es de " + (ladoRectangulo1 * ladoRectangulo2) + "cm^2");
							System.out.println("El perímetro del rectángulo es de "
									+ ((ladoRectangulo1 + ladoRectangulo2) * 2) + "cm");
						} else {

							System.out.println("Los datos indican que la figura es un cuadrado");
							do {
								System.out
										.println("¿Desea continuar calculando el área y el perímetro de un cuadrado?");
								System.out.println("1. SI");
								System.out.println("2. NO");

								num2 = sc.nextInt();

								switch (num2) {
								case 1:
									System.out.println("El área del cuadrado es de "
											+ (ladoRectangulo1 * ladoRectangulo2) + "cm^2");
									System.out.println(
											"Su perímetro es de " + ((ladoRectangulo1 + ladoRectangulo2) * 2) + "cm^2");
									break;
								case 2:
									System.out.println("Revisa tu figura antes de continuar");
									break;
								default:
									System.out.println("Selecciona una opción válida");
								}
							} while (num2 != 1 && num2 != 2);
						}
					} else
						System.out.println("Ingresar un valor correcto");
				} while (ladoRectangulo1 <= 0 || ladoRectangulo2 <= 0);
				break;
			case (4):

				/*
				 * TRIANGULO DO-While en cada solicitud de datos para asegurarse que son válidos
				 */

				do {
					System.out.println("Introduce el valor en centímetros de uno de los lados del triángulo");
					ladoTriangulo1 = sc.nextDouble();
					if (ladoTriangulo1 <= 0) {
						System.out.println("El valor es incorrecto");
					}
				} while (ladoTriangulo1 <= 0);
				do {
					System.out.println("Introduce el valor del segundo lado del triángulo");
					ladoTriangulo2 = sc.nextDouble();
					if (ladoTriangulo2 <= 0) {
						System.out.println("El valor es incorrecto");
					}
				} while (ladoTriangulo2 <= 0);
				do {
					System.out.println("Introduce el valor del último lado");
					ladoTriangulo3 = sc.nextDouble();
					if (ladoTriangulo3 <= 0) {
						System.out.println("El valor es incorrecto");
					}
				} while (ladoTriangulo3 <= 0);

				// La condición es que la suma de dos de los lados de un triángulo, sea mayor
				// que el lado faltante

				if (ladoTriangulo1 + ladoTriangulo2 > ladoTriangulo3 && ladoTriangulo1 + ladoTriangulo3 > ladoTriangulo2
						&& ladoTriangulo3 + ladoTriangulo2 > ladoTriangulo1) {

					// Medimos el área de cada triángulo - fórmula de Herón -

					System.out.println("El valor del área del triángulo es " + (Math.sqrt(((ladoTriangulo1
							+ ladoTriangulo2 + ladoTriangulo3) / 2)
							* ((((ladoTriangulo1 + ladoTriangulo2 + ladoTriangulo3) / 2) - ladoTriangulo1)
									* (((ladoTriangulo1 + ladoTriangulo2 + ladoTriangulo3) / 2) - ladoTriangulo2)
									* (((ladoTriangulo1 + ladoTriangulo2 + ladoTriangulo3) / 2) - ladoTriangulo3))))
							+ "cm^2");
					System.out.println("El valor del perímetro es de "
							+ (ladoTriangulo1 + ladoTriangulo2 + ladoTriangulo3) + "cm");
				} else
					System.out.println("Los valores introducidos no corresponden a los valores de un triángulo");
				break;
			case (0):
				System.out.println("El programa ha finalizado");
				break;
			default:
				System.out.println("Esta opción es incorrecta");
				System.out.println("Introduce una opción válida");
			}
		} while (num != 0);

	}

}
