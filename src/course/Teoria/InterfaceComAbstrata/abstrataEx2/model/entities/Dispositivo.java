package course.Teoria.InterfaceComAbstrata.abstrataEx2.model.entities;

public abstract class Dispositivo {
	
	private String serialNumber;

	public Dispositivo(String serialNumber) {
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
