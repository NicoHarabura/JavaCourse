package course.Teoria.InterfaceComAbstrata.interfaceEx2.application;

import course.Teoria.InterfaceComAbstrata.interfaceEx2.model.entities.DispCombo;
import course.Teoria.InterfaceComAbstrata.interfaceEx2.model.entities.EscanerConcreto;
import course.Teoria.InterfaceComAbstrata.interfaceEx2.model.entities.ImpressoraConcreta;

public class Program {

	public static void main(String[] args) {
	
		ImpressoraConcreta p = new ImpressoraConcreta("12345");
		p.processarDoc("Texto 1");
		p.impressao("Texto 1");
		
		EscanerConcreto e = new EscanerConcreto("654321");
		e.processarDoc("Texto 2");
		System.out.println("Resultado do excaneamento: " + e.escanear());
		
		DispCombo c = new DispCombo("0987");
		c.processarDoc("redação");
		c.impressao("redação");
		System.out.println(c.escanear());
		
	}
}
