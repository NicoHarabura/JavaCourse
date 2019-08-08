package course.Teoria.InterfaceComAbstrata.abstrata.model.entities;

import course.Teoria.InterfaceComAbstrata.abstrata.model.enums.Cor;

public class Circulo extends Forma {

	private double raio;

	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(raio, 2);
	}
	
	public String toString() {
		return "Circulo " + getCor() + " de area: " + String.format("%.2f", area());
	}
	
}
