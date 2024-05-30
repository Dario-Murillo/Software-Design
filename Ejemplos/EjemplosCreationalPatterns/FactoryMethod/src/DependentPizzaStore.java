import pizzas.*;

public class DependentPizzaStore {
 
	public Pizza createPizza(String style, String type) throws Exception {
		Pizza pizza = switch (style.toLowerCase()) {
				case "ny" -> switch (type.toLowerCase()) {
								case "cheese" -> new NYStyleCheesePizza();
								case "veggie" -> new NYStyleVeggiePizza();
								case "clam" -> new NYStyleClamPizza();
								case "pepperoni" -> new NYStylePepperoniPizza();
								default -> throw new Exception("Invalid pizza type");
							};
				case "chicago" -> switch (type.toLowerCase()) {
									case "cheese" -> new ChicagoStyleCheesePizza();
									case "veggie" -> new ChicagoStyleVeggiePizza();
									case "clam" -> new ChicagoStyleClamPizza();
									case "pepperoni" -> new ChicagoStylePepperoniPizza();
									default -> throw new Exception("Invalid pizza type");
								};
				default -> throw new Exception("Invalid pizza style");							
		};
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
