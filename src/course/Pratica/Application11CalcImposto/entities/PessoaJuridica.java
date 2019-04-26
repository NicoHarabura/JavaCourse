package course.Pratica.Application11CalcImposto.entities;

public class PessoaJuridica extends Contribuinte{
	
	protected Integer numFunc;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numFunc) {
		super(nome, rendaAnual);
		this.numFunc = numFunc;
	}

	public Integer getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}
	
	@Override
	public double calcImposto(){
		if (numFunc>10){
			return rendaAnual * 14/100;
		} else {
			return rendaAnual * 16/100;
		}
	}

}
