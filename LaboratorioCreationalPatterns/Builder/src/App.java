/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.util.Scanner;

public class App {
    public static FoodBuilder foodType(String factory) {
        switch (factory) {
            case "a":
                return new SandwichBuilder();
            case "b":
                return new BurritoBuilder();
            case "c":
                return new SaladBuilder();
            default:
                return null;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Elija el tipo de alimento:\na.Sandwich\nb.Burrito\nc.Ensalada");
        Scanner scanner = new Scanner(System.in);
        FoodBuilder food = foodType(scanner.nextLine());
        SubwayDirector shop = new SubwayDirector();
        shop.Construct(food);
        scanner.close();
        food.Show();
    }
}
