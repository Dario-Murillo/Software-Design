import pizzas.*;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) throws Exception {
		Pizza pizza = switch (type.toLowerCase()) {
			case "cheese" -> new CheesePizza();
			case "veggie" -> new VeggiePizza();
			case "clam" -> new ClamPizza();
			case "pepperoni" -> new PepperoniPizza();
			default -> throw new Exception("Invalid pizza type");
		};

		return pizza;
	}
}
