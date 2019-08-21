package course.Teoria.maps.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();

		cookies.put("name", "Maria");
		cookies.put("email", "maria@hotmail.com");
		cookies.put("phone", "977311122");

		cookies.remove("email");
		cookies.put("phone", "988231122");

		System.out.println("Cookies tem o campo 'phone'? " + cookies.containsKey("phone"));
		System.out.println("Phone: " + cookies.get("phone"));
		System.out.println("Tamanho: " + cookies.size());

		for (String key : cookies.keySet()){
			System.out.println(key + " : " + cookies.get(key));{
		}
			
		}
	}

}
