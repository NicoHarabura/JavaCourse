package course.Teoria.InterfaceComAbstrata.interfaceEx2.model.entities;

public class DispCombo extends DispositivoI implements Impressora1, Escaner1 {

	public DispCombo(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public String escanear() {
		return "Resultado Scan Combo";
	}

	@Override
	public void impressao(String doc) {
		System.out.println("Impressão combo: " + doc);
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Processamento combo: " + doc);
	}

}
