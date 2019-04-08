package course.Pratica.ProjetoPedidos.Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import course.Pratica.ProjetoPedidos.Entities.enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus status;

	private Client client;

	private List<OrderItem> orders = new ArrayList<>();

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrders() {
		return orders;
	}

	public void addItem(OrderItem orderItem) {
		orders.add(orderItem);
	}

	public void removeItem(OrderItem orderItem) {
		orders.remove(orderItem);
	}

	public Double total() {
		double sum = 0;
		for (OrderItem oi : orders) {
			sum += oi.subTotal();
		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment));
		sb.append("\n");
		sb.append("Order status: " + status);
		sb.append("\n");
		sb.append(
				"Client: " + client.getName() + " (" + sdf.format(client.getBirthDate()) + ") - " + client.getEmail());
		sb.append("\n");
		sb.append("Order itens: \n");
		for (OrderItem oi : orders) {
			sb.append(oi.getProduct().getName() + ", ");
			sb.append("R$" + String.format("%.2f", oi.getPrice()) + ", ");
			sb.append("Quantity: " + oi.getQuantity() + ", ");
			sb.append("Subtotal: R$" + String.format("%.2f", oi.subTotal()));
			sb.append("\n");
		}
		sb.append("\n");
		sb.append("Total price: " + total());

		return sb.toString();
	}

}
