package course.Teoria.Comparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import course.Teoria.Comparable.entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		List<Funcionario> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String funcionarioCSV = br.readLine();
			while (funcionarioCSV != null) {
				String[] campos = funcionarioCSV.split(",");
				list.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
				funcionarioCSV = br.readLine();
			}
			Collections.sort(list);
			for (Funcionario f : list) {
				System.out.println(f.getNome() + " , " + f.getSalario());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
