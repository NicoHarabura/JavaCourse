package course.Teoria.InterfaceComAbstrata.abstrataEx2.model.entities;

public class Impressora extends Dispositivo {

	public Impressora(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processarDoc (String doc) {
		System.out.println("Processando impressão: " + doc);
	}
	
	public void impressao (String doc) {
		System.out.println("Imprimindo: " + doc);
	}
}
