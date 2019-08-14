package course.Teoria.genericosDelimitados.services;

import java.util.List;

public class ServicoCalculo {

	public static <T extends Comparable<? super T>> T maior(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalArgumentException("Lista está vazia");
		}
		T maior = list.get(0);
		for (T i : list) {
			if (i.compareTo(maior) > 0) {
				maior = i;
			}
		}
		return maior;
		
	}
}
