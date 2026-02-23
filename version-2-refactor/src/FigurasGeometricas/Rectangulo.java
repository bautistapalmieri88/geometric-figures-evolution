package FigurasGeometricas;

public class Rectangulo extends Figura {
	
	double base, altura;

	protected Rectangulo(double base, double altura) {
		
		this.base = base;
		this.altura = altura;
	}

	@Override
	protected void calcularArea() {

		area = (base * altura);
		
	}

	@Override
	protected void calcularPerimetro() {

		perimetro = ((base + altura) * 2);
		
	}

}
