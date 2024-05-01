/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class App {
    public static void main(String[] args) throws Exception {
        MultiFunctionalCar hybrid = new MultiFunctionalCar();
        Car car = new Car();
        Airplane airplane = new Airplane();
        hybrid.drive();
        hybrid.fly();
        car.drive();
        airplane.fly();
    }
}
