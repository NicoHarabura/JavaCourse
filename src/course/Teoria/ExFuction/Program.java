package course.Teoria.ExFuction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Implementa��o da interface
		//List<String> names =list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		//Reference method com m�todo n�o est�tico
		//List<String> names =list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		//Reference method com m�todo n�o est�tico
		//List<String> names =list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		//Express�o lambda declarada
		//Function<Product, String> func = p -> p.getName().toUpperCase(); 
		//List<String> names =list.stream().map(func).collect(Collectors.toList());
		
		//Express�o lambda inline
		List<String> names =list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);

	}

}
