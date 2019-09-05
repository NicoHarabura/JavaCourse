package course.Teoria.ExConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {

	public static void main(String[] args) {
	
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Implementa��o da interface
		//list.forEach( list -> new UpdatePrice()	);
		
		//Reference method com m�todo est�tico
		//list.forEach(Product::statciPriceUpdate);
		
		//Reference method com m�todo n�o est�tico
		//list.forEach(Product::nonStatciPriceUpdate);
		
		//Express�o lambda declarada
		//double factor = 1.1;
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice()*factor);
		//list.forEach(cons);
		
		//Express�o lambda inline
		double factor = 1.1;
		list.forEach(p -> p.setPrice(p.getPrice()*factor));
		
		for (Product p : list) {
			System.out.println(p.toString());
		}
}
	
}
