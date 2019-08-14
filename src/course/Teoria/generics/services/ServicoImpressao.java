package course.Teoria.generics.services;

import java.util.ArrayList;
import java.util.List;

public class ServicoImpressao {

	private List<Object> list = new ArrayList<>();
	
	public void addValor (Object value) {
		list.add(value);
	}
	
	public Object primeiro() {
		if (list.isEmpty()) {
			throw new IllegalStateException("Lista está vazia");
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
