package course.Teoria.InterfaceComAbstrata.interfaceEx2.model.entities;

public abstract class DispositivoI {

	private String serialNumber;

	public DispositivoI(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public abstract void processarDoc (String doc);
	
}
