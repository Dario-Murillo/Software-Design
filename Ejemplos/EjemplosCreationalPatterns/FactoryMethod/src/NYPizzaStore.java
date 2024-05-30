import pizzas.*;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String type) throws Exception {
		return switch (type.toLowerCase()) {
			case "cheese" -> new NYStyleCheesePizza();
			case "veggie" -> new NYStyleVeggiePizza();
			case "clam" -> new NYStyleClamPizza();
			case "pepperoni" -> new NYStylePepperoniPizza();
			default -> throw new Exception("Invalid pizza type");
		};
	}
}
