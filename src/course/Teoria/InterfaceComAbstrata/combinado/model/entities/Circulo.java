package course.Teoria.InterfaceComAbstrata.combinado.model.entities;

import course.Teoria.InterfaceComAbstrata.combinado.model.enums.Cor;

public class Circulo  extends FormaAbstrata{

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
	
	public double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	
}
