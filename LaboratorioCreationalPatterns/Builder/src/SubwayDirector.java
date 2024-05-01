/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class SubwayDirector {
  public void Construct( FoodBuilder foodBuilder ) {
    foodBuilder.BuildBase();
    foodBuilder.BuildProtein();
    foodBuilder.BuildSauce();
    foodBuilder.BuildVegetables();
    foodBuilder.BuildSpices();
  }
}
