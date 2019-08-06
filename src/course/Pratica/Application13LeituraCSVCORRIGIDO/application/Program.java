 package course.Pratica.Application13LeituraCSVCORRIGIDO.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import course.Pratica.Application13LeituraCSVCORRIGIDO.entities.Produto;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Produto> produtos = new ArrayList<>();

		System.out.println("Digite o caminho do arquivo");
		String path = sc.next();

		File sourceFile = new File(path);
		String folderPath = sourceFile.getParent();

		boolean success = new File(folderPath + "\\out").mkdirs();

		String targetFile = folderPath + "\\out\\sumary.csv";

		try (BufferedReader br = new BufferedReader (new FileReader (sourceFile))){
			String line = br.readLine();
			while (line != null){
				String[] itemStr = line.split(",");
				String name = itemStr[0];
				double value = Double.parseDouble(itemStr[1]);
				int quantity = Integer.parseInt(itemStr[2]);
				produtos.add(new Produto(name, value, quantity));
				line = br.readLine();
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))){
				for (Produto p : produtos){
					bw.write(p.getName()+","+p.total());
					bw.newLine();
				}
				System.out.println("Arquivo criado/atualizado!");
				
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		sc.close();
	}

}
