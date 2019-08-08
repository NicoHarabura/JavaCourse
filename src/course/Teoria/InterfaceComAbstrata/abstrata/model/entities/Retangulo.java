package course.Teoria.InterfaceComAbstrata.abstrata.model.entities;

import course.Teoria.InterfaceComAbstrata.abstrata.model.enums.Cor;

public class Retangulo extends Forma {

	private double altura;
	private double largura;
	
	public Retangulo(Cor cor, double altura, double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	@Override
	public double area() {
		return altura*largura;
	}
	
	public String toString() {
		return "Retangulo " + getCor() + " de area: " + String.format("%.2f", area());
	}
	
	
	
}
