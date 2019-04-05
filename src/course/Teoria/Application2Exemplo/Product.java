package course.Teoria.Application2Exemplo;

public class Product {

	private String name;
	 private double price;
	 private int quantity;

	public Product() {

	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName (){
		return name;
	}
	
	public void setName (String name){
		this.name = name;
	}
	
	public double getPrice (){
		return price;
	}
	
	public void setPrice (double price){
		this.price = price;
	}
	
	public int getQuantity (){
		return quantity;
	}
	
	//PRO SEGURANÇA NÂO CRIAMOS O setQuantity PARA O VALOR SÓ SER ALTERADO PELOS METODOS DE ADICIONAR OU REMOVER!!!

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
		return "Nome: " + name + ", R$" + String.format("%.2f", price) + ", " + quantity + " unidades," + " Total: R$"
				+ String.format("%.2f", totalValueInStock());

	}
}
