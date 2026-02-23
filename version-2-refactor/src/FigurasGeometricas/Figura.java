package FigurasGeometricas;

// Clase abstracta.. Hereda atributos y metodos a figuras geometricas

public abstract class Figura {
	
	protected double area;
	protected double perimetro;

	protected Figura() {
		
	}

	protected double getArea() {
		return area;
	}

	protected void setArea(double area) {
		this.area = area;
	}

	protected double getPerimetro() {
		return perimetro;
	}

	protected void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	@Override
	public String toString() {
		return "Figura [area=" + area + ", perimetro=" + perimetro + "]";
	}
	
	protected abstract void calcularArea ();
	
	protected abstract void calcularPerimetro ();

}
