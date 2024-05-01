/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.util.HashMap;

public class Food {
  private String food_type;
  private HashMap<String, String> parts = new HashMap<String,String>();

  public Food(String food_type) {
    this.food_type = food_type;
  }

  public String getPart( String key ) {
    return parts.get(key);
  }

  public void setPart(String key, String value) {
    parts.put(key, value);
  }

  public void show()
  {
        System.out.println();
        System.out.println("---------------------------");
        System.out.println(" Food Type: " + food_type);
        System.out.println(" Base : " + parts.get("base"));
        System.out.println(" Protein : " + parts.get("protein"));
        System.out.println(" Sauce : " + parts.get("sauce"));
        System.out.println(" Vegetables: " + parts.get("vegetables"));
        System.out.println(" Spices : " + parts.get("spice"));
  }

}
