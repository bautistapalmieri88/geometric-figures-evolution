package FigurasGeometricas;

public class Cuadrado extends Figura {

	double base;
	
	protected Cuadrado(double base) {
		
		this.base = base;
	}

	@Override
	protected void calcularArea() {

		area = (base * base);
		
	}

	@Override
	protected void calcularPerimetro() {
		
		perimetro = (base*4);
		
	}

}
