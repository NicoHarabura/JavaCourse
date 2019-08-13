package course.Teoria.InterfaceComAbstrata.interfaceEx2.model.entities;

public class EscanerConcreto extends DispositivoI implements Escaner1{

	public EscanerConcreto(String serialNumber) {
		super(serialNumber);
		}

	@Override
	public String escanear() {
		return "Conteudo Escaneado!";
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Processando escaneamento: " + doc);
	}
	
}
