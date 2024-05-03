/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.util.Scanner;

public abstract class FoodBuilder {
  
    protected Food food;
    protected Scanner myScanner = new Scanner(System.in);


    public Food getFood() {
        return food;
    }

    protected abstract void BuildBase();
    protected abstract void setQuantity();

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

    public void Show() {
        food.show();
    }

}
