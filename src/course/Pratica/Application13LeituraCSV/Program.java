package course.Pratica.Application13LeituraCSV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

import course.Pratica.Application13LeituraCSV.entities.Produto;

public class Program {

	public static List<Produto> produtos = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = null;

		try {
			sc = new Scanner(System.in);
			System.out.println("Digite o caminho da pasta: ");
			String folderPath = sc.next();
			System.out.println("Agora digite o nome do arquivo:");
			String csvPath = folderPath + "\\" + sc.next();
			boolean success = new File(folderPath + "\\out").mkdirs();

			try (BufferedReader br = new BufferedReader(new FileReader(csvPath));
					BufferedWriter bw = new BufferedWriter(new FileWriter(folderPath + "\\out\\summary.csv"))) {
				String line = br.readLine();
				String[] arrayOfString = line.split(",");
				String name = arrayOfString[0];
				Double value = Double.parseDouble(arrayOfString[1]);
				int quantity = Integer.parseInt(arrayOfString[2]);
				produtos.add(new Produto(name, value, quantity));
				line = br.readLine();
				while (line != null) {
					arrayOfString = line.split(",");
					name = arrayOfString[0];
					value = Double.parseDouble(arrayOfString[1]);
					quantity = Integer.parseInt(arrayOfString[2]);
					produtos.add(new Produto(name, value, quantity));
					line = br.readLine();
				}
				for (Produto p : produtos) {
					bw.write(p.toString());
					bw.newLine();
				}
				
				System.out.println("Arquivo criado\\atualizado com sucesso");

			} catch (IOException e) {
				e.printStackTrace();
			} catch (PatternSyntaxException e) {
				e.printStackTrace();
			}
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			;
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}
}
