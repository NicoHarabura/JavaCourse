package course.Teoria.InterfaceComAbstrata.abstrata.application;

import course.Teoria.InterfaceComAbstrata.abstrata.model.entities.Circulo;
import course.Teoria.InterfaceComAbstrata.abstrata.model.entities.Forma;
import course.Teoria.InterfaceComAbstrata.abstrata.model.entities.Retangulo;
import course.Teoria.InterfaceComAbstrata.abstrata.model.enums.Cor;

public class Program {

	public static void main(String[] args)  {
		
		Forma f1 = new Retangulo(Cor.BRANCO, 2.0, 3.0);
		Forma f2 = new Circulo(Cor.BRANCO, 2.0);
		
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		
		
	}
	
}
