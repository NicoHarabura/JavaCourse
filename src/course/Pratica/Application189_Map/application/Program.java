package course.Pratica.Application189_Map.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> urna = new LinkedHashMap<>();

		System.out.println("Digite o caminho do arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] campos = line.split(",");
				String nome = campos[0];
				Integer votos = Integer.parseInt(campos[1]);
				if (urna.containsKey(nome)) {
					int votosAtuais = urna.get(nome);
					urna.put(nome, votos + votosAtuais);
				} else {
					urna.put(nome, votos);
				}
				line = br.readLine();
			}

			for (String key : urna.keySet()) {
				System.out.println(key + ": " + urna.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}
}
