package course.Pratica.Application2;

public class Product {

	String name;
	double price;
	int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProduct(int quantity) {
		this.quantity += quantity;
	}

	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return "Nome: " + name + ", R$" + String.format("%.2f", price) + ", " + quantity + " unidades,"
				+ " Total: R$" + String.format("%.2f", totalValueInStock());

	}
}
