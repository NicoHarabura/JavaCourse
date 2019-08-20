package course.Pratica.Application186_SET.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import course.Pratica.Application186_SET.entities.LogDeEntrada;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o caminho do arquivo: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
		
			
			Set<LogDeEntrada> set = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(" ");
				String nome = fields[0];
				Date momento = Date.from(Instant.parse(fields[1]));
				
				set.add(new LogDeEntrada(nome, momento));
				
				line = br.readLine();
			}
			
			System.out.println("Total de usuários: " + set.size());
			
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		sc.close();

	}

}
