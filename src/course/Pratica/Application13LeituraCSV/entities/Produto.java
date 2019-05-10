package course.Pratica.Application13LeituraCSV.entities;

public class Produto {

	private String name;
	private Double value;
	private int quantity;

	public Produto(String name, Double value, int quantity) {
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public Double getValue() {
		return value;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public Double total (){
		return value * quantity;
	}

	@Override
	public String toString() {
		return name + "," + total();
	}

	
		
}
