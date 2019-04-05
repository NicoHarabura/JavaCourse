package course.Teoria.Lista;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ListComWrapper {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Rick");
		list.add("Sylerne");
		list.add("Julio");
		list.add("Nicolau");
		list.add("Nathalia");

		System.out.println(list.size());

		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("---------------------");

		list.remove(1);

		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("---------------------");

		list.add(1, "Syssa");
		list.add("Syrlene");

		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("---------------------");

		list.remove("Syrlene");
		
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("---------------------");
		
		list.removeIf(x -> x.charAt(0)=='S'|| x.charAt(0)=='J');
		
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("---------------------");
		
		List<String> newList = new ArrayList<>();
		
		newList = list.stream().filter(x -> x.charAt(0)=='N').collect(Collectors.toList());
		
		List<String> newList2 = list.stream().filter(x -> x.charAt(0)=='R').collect(Collectors.toList());
		
		for (String name : newList) {
			System.out.println(name);
		}
		System.out.println("---------------------");
		
		for (String name : newList2) {
			System.out.println(name);
		}
		System.out.println("---------------------");
		
		String name = list.stream().filter(x -> x.charAt(0)=='N').findFirst().orElse(null);
		System.out.println(name);
	}
}
