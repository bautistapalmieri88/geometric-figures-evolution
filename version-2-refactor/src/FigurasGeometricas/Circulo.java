package FigurasGeometricas;

public class Circulo extends Figura {
	
	protected double radio;

	protected Circulo(double radio) {
	
		this.radio = radio;
	}

	protected double getRadio() {
		return radio;
	}

	protected void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	protected void calcularArea() {
		area = (Math.PI*radio*radio);
		
	}

	@Override
	protected void calcularPerimetro() {
		perimetro = (2*Math.PI*radio);
		
	}

}
