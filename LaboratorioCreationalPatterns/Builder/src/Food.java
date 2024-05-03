/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.util.HashMap;

public class Food {
  private String food_type;

  private Integer protein_quantity;
  public Integer getProtein_quantity() {
    return protein_quantity;
  }

  public void setProtein_quantity(Integer protein_quantity) {
    this.protein_quantity = protein_quantity;
  }

  private Integer sauce_quantity;
  public Integer getSauce_quantity() {
    return sauce_quantity;
  }

  public void setSauce_quantity(Integer sauce_quantity) {
    this.sauce_quantity = sauce_quantity;
  }

  private Integer vegetables_quantity;
  public Integer getVegetables_quantity() {
    return vegetables_quantity;
  }

  public void setVegetables_quantity(Integer vegetables_quantity) {
    this.vegetables_quantity = vegetables_quantity;
  }

  private Integer spices_quantity;
  public Integer getSpices_quantity() {
    return spices_quantity;
  }

  public void setSpices_quantity(Integer spices_quantity) {
    this.spices_quantity = spices_quantity;
  }

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

  public void show() {
    System.out.println();
    System.out.println("---------------------------");
    System.out.println(" Food Type: " + food_type);
    System.out.println(" Base : " + parts.get("base"));
    System.out.println(" Protein : " + parts.get("protein") + "Quantity: " + Integer.toString(this.protein_quantity));
    System.out.println(" Sauce : " + parts.get("sauce") + "Quantity: " + Integer.toString(this.sauce_quantity));
    System.out.println(" Vegetables: " + parts.get("vegetables") + "Quantity: " + Integer.toString(this.vegetables_quantity));
    System.out.println(" Spices : " + parts.get("spice") + "Quantity: " + Integer.toString(this.spices_quantity));
  }

}
