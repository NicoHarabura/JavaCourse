package course.Teoria.defaultMethods.services;

public class ServicoTaxaEUA implements ServicoTaxa{

	private Double taxaJuros;

	public ServicoTaxaEUA(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public Double getTaxaJuros() {
		return taxaJuros;
	}

	
}
