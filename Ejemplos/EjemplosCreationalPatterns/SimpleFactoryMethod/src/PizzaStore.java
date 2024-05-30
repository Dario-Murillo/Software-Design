import pizzas.*;

public class PizzaStore {
	public Pizza orderPizza(String type) throws Exception {
		Pizza pizza = switch (type.toLowerCase()) {
			case "cheese" -> new CheesePizza();
			case "veggie" -> new VeggiePizza();
			case "clam" -> new ClamPizza();
			case "pepperoni" -> new PepperoniPizza();
			default -> throw new Exception("Invalid pizza type");
		};
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
