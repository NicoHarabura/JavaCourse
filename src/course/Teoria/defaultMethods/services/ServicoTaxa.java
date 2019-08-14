package course.Teoria.defaultMethods.services;

import java.security.InvalidParameterException;

public interface ServicoTaxa {

	public Double getTaxaJuros();
	
	default double pagamento (double valor, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("Numero de meses deve ser positivo");
		}
		return valor * Math.pow((1+getTaxaJuros()/100), meses);
	}
	
}
