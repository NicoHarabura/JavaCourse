package course.Pratica.ProjetoProdutosEtiquetas.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import course.Pratica.ProjetoProdutosEtiquetas.Entities.ImportedProduct;
import course.Pratica.ProjetoProdutosEtiquetas.Entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		List<course.Pratica.ProjetoProdutosEtiquetas.Entities.Product> list = new ArrayList<>();

		System.out.println("Enter number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.println("Commom, Used or Imported product? Type: c/u/i");
			char op = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			if (op == 'u') {
				System.out.println("Manufacture date: ");
				Date manufactureDate = sdf.parse(sc.next());
				course.Pratica.ProjetoProdutosEtiquetas.Entities.Product emp = new UsedProduct(name, price,
						manufactureDate);
				list.add(emp);
			} else if (op == 'i') {
				System.out.println("Customs fee: ");
				double customsFee = sc.nextDouble();
				course.Pratica.ProjetoProdutosEtiquetas.Entities.Product emp = new ImportedProduct(name, price,
						customsFee);
				list.add(emp);
			} else {
				course.Pratica.ProjetoProdutosEtiquetas.Entities.Product emp = new 
						course.Pratica.ProjetoProdutosEtiquetas.Entities.Product(
						name, price);
				list.add(emp);
			}
		}
		System.out.println("PRICE TAGS");
		for (course.Pratica.ProjetoProdutosEtiquetas.Entities.Product e : list){
			System.out.println(e.priceTag());
		}
		
		sc.close();
	}
}
