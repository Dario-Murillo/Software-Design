import pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String type) throws Exception {
		return switch (type.toLowerCase()) {
			case "cheese" -> new ChicagoStyleCheesePizza();
			case "veggie" -> new ChicagoStyleVeggiePizza();
			case "clam" -> new ChicagoStyleClamPizza();
			case "pepperoni" -> new ChicagoStylePepperoniPizza();
			default -> throw new Exception("Invalid pizza type");
		};
	}
}
