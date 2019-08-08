package course.Teoria.InterfaceComAbstrata.combinado.model.entities;

import course.Teoria.InterfaceComAbstrata.combinado.model.enums.Cor;

public abstract class FormaAbstrata implements Forma{

	private Cor cor;

	public FormaAbstrata(Cor cor) {
		super();
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	
	
}
