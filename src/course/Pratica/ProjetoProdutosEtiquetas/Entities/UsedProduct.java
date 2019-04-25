package course.Pratica.ProjetoProdutosEtiquetas.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;


public class UsedProduct extends Product {

	protected SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Date manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return name + "(used) R$" + price + "(Manufacture date: " + sdf.format(manufactureDate) + ")";
	}

}
