package course.Teoria.ExConsumer;

import java.util.function.Consumer;

public class UpdatePrice implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);

	}

}
