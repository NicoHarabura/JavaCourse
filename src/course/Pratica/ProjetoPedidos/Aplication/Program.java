package course.Pratica.ProjetoPedidos.Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import course.Pratica.ProjetoPedidos.Entities.Client;
import course.Pratica.ProjetoPedidos.Entities.Order;
import course.Pratica.ProjetoPedidos.Entities.OrderItem;
import course.Pratica.ProjetoPedidos.Entities.Product;
import course.Pratica.ProjetoPedidos.Entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter client data: ");
		System.out.println("Name: ");
		String name = sc.next();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Birth Date: ");
		Date birthDate = new Date();
		birthDate = sdf1.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter Order Data: ");
		System.out.println("Status: ");
		String status = sc.next();
		OrderStatus os = OrderStatus.valueOf(status);
				
		Order order = new Order(new Date(), os, client);

		System.out.println("How many items for this order? ");
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.println("Product name: ");
			String productName = sc.next();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int productQuantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));
			order.addItem(orderItem);
			
		}

		System.out.println("ORDER SUMMARY: ");
		System.out.println(order.toString());
		
		sc.close();
	}
}
