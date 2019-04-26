package course.Pratica.Application11CalcImposto.entities;

public abstract class Contribuinte {

	protected String nome;
	protected Double rendaAnual;

	public Contribuinte(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	
	public Contribuinte() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public abstract double calcImposto();

}
