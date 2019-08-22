package course.Teoria.mapsExemplo.application;

import java.util.HashMap;
import java.util.Map;

import course.Teoria.mapsExemplo.entities.Produto;

public class Program {

	public static void main(String[] args) {

		Map<Produto, Double> stock = new HashMap<>();

		Produto p1 = new Produto("TV", 900.0);
		Produto p2 = new Produto("Notebook", 1200.0);
		Produto p3 = new Produto("Tablet", 400.0);

		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);

		Produto ps = new Produto("TV", 900.0);

		System.out.println("Contem ps: " + stock.containsKey(ps));
		System.out.println(stock.size());
	}

}
