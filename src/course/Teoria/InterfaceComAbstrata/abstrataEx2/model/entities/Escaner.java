package course.Teoria.InterfaceComAbstrata.abstrataEx2.model.entities;

public class Escaner extends Dispositivo {

	public Escaner(String serialNumber) {
		super(serialNumber);
		}

	public String escanear() {
		return "Conteudo Escaneado!";
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Processando escaneamento: " + doc);
	}
	
}
