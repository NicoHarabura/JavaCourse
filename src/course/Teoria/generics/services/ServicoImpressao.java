package course.Teoria.generics.services;

import java.util.ArrayList;
import java.util.List;

public class ServicoImpressao<T> {

	private List<T> list = new ArrayList<>();
	
	public void addValor (T value) {
		list.add(value);
	}
	
	public T primeiro() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista est� vazia");
		}
		return list.get(0);
		
	}
	
	public void imprimir() {
		
		if (!list.isEmpty()) {
			System.out.print("[" + list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
	
}
