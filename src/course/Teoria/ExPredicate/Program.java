package course.Teoria.ExPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		//list.removeIf(p -> p.getPrice() >= 100);
		
		//Implementacao da interface
		//list.removeIf(new ProductPredicate());
		
		//Reference method com método estático
		//list.removeIf(Product::staticProductPredicate);
		
		//Reference method com método não estático
		//list.removeIf(Product::nonStaticProductPredicate);
		
		//Expressão lambda declarada
		//Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		//list.removeIf(pred);
		
		//Expressão lambda inline
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		
		for (Product p : list) {
			 System.out.println(p.toString());
		 }
		
	}
}
