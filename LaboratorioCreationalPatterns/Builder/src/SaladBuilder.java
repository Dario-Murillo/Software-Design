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
    protected void BuildProtein() {
        System.out.println("Eliga el tipo de proteina:\na.Pavo\nb.Jamon\nc.Pollo\nd.Atun");
        String input = myScanner.nextLine();
        String protein = "";
        switch (input) {
        case "a":
            protein = "Pavo";
            break;
        case "b":
            protein = "Jamon";
            break;
        case "c":
            protein = "Pollo";
            break;
        case "d":
            protein = "Atun";
            break;
        default:
            break;
        }
        food.setPart("protein", protein);
    }

    @Override
    protected void BuildSauce() {
        System.out.println("Eliga el tipo de salsa:\na.Chipotle\nb.Mayonesa\nc.Tomate\nd.Mostaza");
        String input = myScanner.nextLine();
        String sauce = "";
        switch (input) {
        case "a":
            sauce = "Chipotle";
            break;
        case "b":
            sauce = "Mayonesa";
            break;
        case "c":
            sauce = "Tomate";
            break;
        case "d":
            sauce = "Mostaza";
            break;
        default:
            break;
        }
        food.setPart("sauce", sauce);
    }

    @Override
    protected void BuildVegetables() {
        System.out.println("Eliga un vegetal:\na.Lechuga\nb.Cebolla\nc.Tomate\nd.Zanahoria");
        String input = myScanner.nextLine();
        String vegetables = "";
        switch (input) {
        case "a":
            vegetables = "Lechuga";
            break;
        case "b":
            vegetables = "Cebolla";
            break;
        case "c":
            vegetables = "Tomate";
            break;
        case "d":
            vegetables = "Zanahoria";
            break;
        default:
            break;
        }
        food.setPart("vegetables", vegetables);
    }

    @Override
    protected void BuildSpices() {
        System.out.println("Eliga un condimento:\na.Sal\nb.Pesto\nc.Vinagreta\nd.Aceite de oliva");
        String input = myScanner.nextLine();
        String spice = "";
        switch (input) {
        case "a":
            spice = "Sal";
            break;
        case "b":
            spice = "Pesto";
            break;
        case "c":
            spice = "Vinagreta";
            break;
        case "d":
            spice = "Aceite de oliva";
            break;
        default:
            break;
        }
        food.setPart("spice", spice);
    }
}
