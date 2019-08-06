package course.Pratica.Application13LeituraCSVCORRIGIDO.entities;

public class Produto {

	protected String name;
	protected Double value;
	protected Integer quantity;

	public Produto(String name, Double value, Integer quantity) {
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public double total() {
		return value * quantity;
	}

}
