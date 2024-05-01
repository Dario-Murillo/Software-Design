/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class AsiaFactory implements IContinenteFactory {

    @Override
    public IHerbivoro crearHerbivoro() {
        return new Camello();
    }

    @Override
    public ICarnivoro crearCarnivoro() {
        return new TigreBengala();
    }

    @Override
    public IAnimal crearExotico() {
        return new OsoPandaRojo();
    }
}
