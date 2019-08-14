package course.Teoria.defaultMethods.services;

import java.security.InvalidParameterException;

public class ServicoTaxaBrasil {

	private Double taxaJuros;

	public ServicoTaxaBrasil(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public double pagamento (double valor, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("Numero de meses deve ser positivo");
		}
		return valor * Math.pow((1+taxaJuros/100), meses);
	}
	
}
