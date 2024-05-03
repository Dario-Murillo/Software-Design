/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class SandwichBuilder extends FoodBuilder {

    public SandwichBuilder () {
        this.food = new Food("Sandwich");
    }

    @Override
    protected void BuildBase() {
        System.out.println("Eliga el tipo de pan:\na.Italiano\nb.Oregano\nc.Queso Parmeso\nd.Integral");
        String input = myScanner.nextLine();
        String bread = "";
        switch (input) {
            case "a":
                bread = "Italiano";
                break;
            case "b":
                bread = "Oregano";
                break;
            case "c":
                bread = "Queso Parmesano";
                break;
            case "d":
                bread = "Integral";
                break;
            default:
                break;
        }
        food.setPart("base", bread);
    }

    @Override
    protected void setQuantity() {
        food.setProtein_quantity(3);
        food.setSauce_quantity(2);
        food.setSpices_quantity(3);
        food.setVegetables_quantity(2);
    }
}

