package course.Teoria.Application3ExemploClasseAbstrata.entities;

import course.Teoria.Application3ExemploClasseAbstrata.entities.enums.Color;

public abstract class Forma {

	protected Color cor;
	
	public Forma(){
		
	}

	public Forma(Color cor) {
		this.cor = cor;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}
	
	public abstract double area();
	
}
