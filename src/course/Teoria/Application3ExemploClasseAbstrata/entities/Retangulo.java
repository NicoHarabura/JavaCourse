package course.Teoria.Application3ExemploClasseAbstrata.entities;

import course.Teoria.Application3ExemploClasseAbstrata.entities.enums.Color;

public class Retangulo extends Forma {

	protected Double comprimento;
	protected Double altura;

	public Retangulo(Color cor, Double comprimento, Double altura) {
		super(cor);
		this.comprimento = comprimento;
		this.altura = altura;
	}

	public Retangulo() {
		super();
	}

	public Double getComprimento() {
		return comprimento;
	}

	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return altura * comprimento;
	}

}
