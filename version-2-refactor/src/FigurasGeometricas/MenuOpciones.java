package FigurasGeometricas;

import java.util.Scanner;

public class MenuOpciones {
	
	//Cada opcion llama a un método. Switch limpio - Solo decide

	public static void CalculoDeFiguras (int opcion, Scanner sc) {
		
		Figura f = null; //Creacion de objeto -- Asignacion de valor para pasar el objeto
		
		switch (opcion) {
		
		case 1:
			MensajeYCondicion.Case1(sc, f);
			break;
		case 2:
			MensajeYCondicion.Case2(sc, f);	
			break;
		case 3:
			MensajeYCondicion.Case3(sc, f);
			break;
		case 4:
			MensajeYCondicion.Case4(sc, f);
			break;
		case 0:
			System.out.println("El programa ha finalizado");
			break;
			default:
				System.out.println("Esta opción es incorrecta");
				System.out.println("Introduce una opción válida");
				
		}
	}
}
