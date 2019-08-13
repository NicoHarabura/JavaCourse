package course.Teoria.InterfaceComAbstrata.interfaceEx2.model.entities;

public class ImpressoraConcreta extends DispositivoI implements Impressora1{

	public ImpressoraConcreta(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processarDoc (String doc) {
		System.out.println("Processando impressão: " + doc);
	}
	
	@Override
	public void impressao (String doc) {
		System.out.println("Imprimindo: " + doc);
	}

		
	
}
