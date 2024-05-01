/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class Lobo implements ICarnivoro {
    @Override
    public String getSonidoDistintivo() {
        return "howl";
    }

    @Override
    public String getDescripcion() {
        return "El lobo feroz!";
    }
}