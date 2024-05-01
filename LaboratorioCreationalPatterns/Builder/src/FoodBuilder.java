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
    protected abstract void BuildProtein();
    protected abstract void BuildSauce();
    protected abstract void BuildVegetables();
    protected abstract void BuildSpices();
    public void Show() {
        food.show();
    }


}
