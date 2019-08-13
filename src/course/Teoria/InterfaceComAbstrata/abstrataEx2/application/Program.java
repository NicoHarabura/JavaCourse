package course.Teoria.InterfaceComAbstrata.abstrataEx2.application;

import course.Teoria.InterfaceComAbstrata.abstrataEx2.model.entities.Escaner;
import course.Teoria.InterfaceComAbstrata.abstrataEx2.model.entities.Impressora;

public class Program {

	public static void main(String[] args) {
	
		Impressora p = new Impressora("12345");
		p.processarDoc("Texto 1");
		p.impressao("Texto 1");
		
		Escaner e = new Escaner("654321");
		e.processarDoc("Texto 2");
		System.out.println("Resultado do excaneamento: " + e.escanear());
		
		
	}
	
}
