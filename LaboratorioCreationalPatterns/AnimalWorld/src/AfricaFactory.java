/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class AfricaFactory implements IContinenteFactory {
    @Override
    public IHerbivoro crearHerbivoro() {
        return new Nu();
    }

    @Override
    public ICarnivoro crearCarnivoro() {
        return new Leon();
    }

    @Override
    public IAnimal crearExotico() {
        return new Elefante();
    }
}
