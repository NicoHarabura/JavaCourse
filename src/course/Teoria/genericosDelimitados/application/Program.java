package course.Teoria.genericosDelimitados.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import course.Teoria.genericosDelimitados.entities.Produtos;
import course.Teoria.genericosDelimitados.services.ServicoCalculo;

public class Program {

	public static void main(String[] args) {
		
		List<Produtos> list = new ArrayList<>();
		
		String path = "C:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line!=null) {
				String[] campos = line.split(",");
				list.add(new Produtos(campos[0], Double.parseDouble(campos[1])));
				line = br.readLine();
			}
			
			Produtos x = ServicoCalculo.maior(list);
			System.out.println("Maior: ");
			System.out.println(x);
			
		} catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
	}
}
