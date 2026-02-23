package FigurasGeometricas;

public class Resultado {
	
	//Mensaje generico -- Evita repeticion de lineas de codigos
	
	protected static void Resultados (Figura f, String nombreF) {
		
		System.out.println("El area del "+nombreF+" es de "+f.getArea()+" cm^2");
		System.out.println("El perimetro del "+nombreF+" es de "+f.getPerimetro()+" cm");
		
	}

}
