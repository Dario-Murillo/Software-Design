/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class SaladBuilder extends FoodBuilder {

    public SaladBuilder () {
        this.food = new Food("Salad");
    }

    @Override
    protected void BuildBase() {
        System.out.println("Eliga el tamaño:\na.Pequeña\nb.Mediana\nc.Grande\nd.Extra Grande");
        String input = myScanner.nextLine();
        String base = "";
        switch (input) {
        case "a":
            base = "Pequeña";
            break;
        case "b":
            base = "Mediana";
            break;
        case "c":
            base = "Grande";
            break;
        case "d":
            base = "Extra Grande";
            break;
        default:
            break;
        }
        food.setPart("base", base);
    }

    @Override
    protected void setQuantity() {
        food.setProtein_quantity(1);
        food.setSauce_quantity(1);
        food.setSpices_quantity(1);
        food.setVegetables_quantity(4);
    }
}
