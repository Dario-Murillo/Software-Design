import java.util.Scanner;

public class SimpleFactoryMethod {
    public static void main(String[] args) throws Exception {
        var reader = new Scanner(System.in); 
        System.out.println("Please type the kind of pizza you wan to order:");
        var type = reader.nextLine();
        var pizzaStore = new PizzaStore();
        pizzaStore.orderPizza(type);
        reader.close();
    }
}
