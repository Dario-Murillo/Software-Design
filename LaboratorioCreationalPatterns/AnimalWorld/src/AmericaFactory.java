/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class AmericaFactory implements IContinenteFactory {

    @Override
    public IHerbivoro crearHerbivoro() {
        return new Bison();
    }

    @Override
    public ICarnivoro crearCarnivoro() {
        return new Lobo();
    }

    @Override
    public IAnimal crearExotico() {
        return new OsoPolar();
    }
    
}
