package FigurasGeometricas;

public class RecogeDatos {
	
	//En cada metodo se agrupan los calculos desarrollados en las clases molde de cada objeto
	
	protected static void operacionCirculo (double diametro, Figura f) {
		
			double radio = (diametro/2);
			f = new Circulo (radio); //
			f.calcularArea();
			f.calcularPerimetro();
			Resultado.Resultados(f, "CIRCULO");
			
	}
	
	protected static void operacionCuadrado (double base, Figura f) {
		
		f = new Cuadrado (base);
		f.calcularArea();
		f.calcularPerimetro();
		Resultado.Resultados(f, "CUADRADO");
		
	}
	
	protected static void operacionRectangulo (double base, double altura, Figura f) {
		
		f = new Rectangulo (base, altura);
		f.calcularArea();
		f.calcularPerimetro();
		Resultado.Resultados(f, "RECTANGULO");
		
	}
	
	protected static void operacionTriangulo (double base, double lado1, double lado2, Figura f) {
	
		f = new Triangulo (base, lado1, lado2);
		f.calcularArea();
		f.calcularPerimetro();
		Resultado.Resultados(f, "TRIANGULO");
	}
}
