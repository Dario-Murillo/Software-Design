/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class Airplane implements IFly {

    /* @Override
    public void drive() {
        throw new UnsupportedOperationException("Driving is not supported for an airplane");
    } */

    @Override
    public void fly() {
        // Actions to fly a plane
        System.out.println("Flying a plane");
    }
}
