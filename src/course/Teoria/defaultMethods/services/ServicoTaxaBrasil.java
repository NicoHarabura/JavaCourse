package course.Teoria.defaultMethods.services;

public class ServicoTaxaBrasil implements ServicoTaxa {

	private Double taxaJuros;

	public ServicoTaxaBrasil(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public Double getTaxaJuros() {
		return taxaJuros;
	}

}
