package course.Pratica.Application11CalcImposto.entities;

public class PessoaFisica extends Contribuinte{
	
	protected Double gastoSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public double calcImposto(){
		
		if (rendaAnual<20000){
			return rendaAnual*15/100 - gastoSaude*50/100; 
		} else {
			return rendaAnual*25/100 - gastoSaude*50/100;
		}
		
	}

}
