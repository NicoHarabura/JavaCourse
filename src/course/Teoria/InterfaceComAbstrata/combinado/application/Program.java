package course.Teoria.InterfaceComAbstrata.combinado.application;

import course.Teoria.InterfaceComAbstrata.combinado.model.entities.Circulo;
import course.Teoria.InterfaceComAbstrata.combinado.model.entities.FormaAbstrata;
import course.Teoria.InterfaceComAbstrata.combinado.model.entities.Retangulo;
import course.Teoria.InterfaceComAbstrata.combinado.model.enums.Cor;

public class Program {

	public static void main(String[] args) {
		
		FormaAbstrata f1 = new Retangulo(Cor.BRANCO, 2, 3);
		FormaAbstrata f2 = new Circulo(Cor.PRETO, 2);
		
		System.out.println("Retangulo: " + f1.getCor());
		System.out.println("Area: " + String.format("%.2f", f1.area()));
		System.out.println("Circulo: " + f2.getCor());
		System.out.println("Area: " + String.format("%.2f", f2.area()));
		
	}
	
}
