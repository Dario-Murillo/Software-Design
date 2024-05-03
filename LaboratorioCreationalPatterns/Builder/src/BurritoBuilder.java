/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class BurritoBuilder extends FoodBuilder {

    public BurritoBuilder () {
        this.food = new Food("Burrito");
    }

    @Override
    protected void BuildBase() {
        System.out.println("Eliga el tipo de tortilla:\na.Trigo\nb.Integral\nc.Maiz\nd.Harina");
        String input = myScanner.nextLine();
        String base = "";
        switch (input) {
        case "a":
            base = "Trigo";
            break;
        case "b":
            base = "Integral";
            break;
        case "c":
            base = "Maiz";
            break;
        case "d":
            base = "Harina";
            break;
        default:
            break;
        }
        food.setPart("base", base);
    }

    @Override
    protected void setQuantity() {
        food.setProtein_quantity(3);
        food.setSauce_quantity(2);
        food.setSpices_quantity(1);
        food.setVegetables_quantity(1);
    }
}
