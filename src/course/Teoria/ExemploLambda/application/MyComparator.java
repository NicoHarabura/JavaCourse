package course.Teoria.ExemploLambda.application;

import java.util.Comparator;

import course.Teoria.ExemploLambda.entities.Produto;

public class MyComparator implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
