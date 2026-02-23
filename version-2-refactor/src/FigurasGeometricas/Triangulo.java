package FigurasGeometricas;

public class Triangulo extends Figura {
	
	protected double base, lado1, lado2;

	protected Triangulo(double base, double lado1, double lado2) {
		
		this.base = base;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	protected void calcularArea() {
		double s = (base + lado1 + lado2) / 2;
		area = Math.sqrt(s * (s - base) * (s - lado1) * (s - lado2));
	}

	@Override
	protected void calcularPerimetro() {

		perimetro = (base + lado1 + lado2);
		
	}

}
