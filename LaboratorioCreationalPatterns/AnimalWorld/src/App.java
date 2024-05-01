/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class App {

    public static IContinenteFactory cargarFactory(String factory) {
        switch (factory) {
            case "Africa":
                return new AfricaFactory();
            case "America":
                return new AmericaFactory();
            case "Asia":
                return new AsiaFactory();
            default:
                return null;
        }
    }

    public static void main(String[] args) throws Exception {
        IContinenteFactory continenteFactory = cargarFactory(args[1]);

        IHerbivoro herbivoro = continenteFactory.crearHerbivoro();
        System.out.printf("El animal herbívoro en el continente elegido es %s y come %s%n", herbivoro.getDescripcion(), herbivoro.getPlantaQueCome());

        ICarnivoro carnivoro = continenteFactory.crearCarnivoro();
        System.out.printf("El animal carnívoro en el continente elegido es %s y hace '%s'%n", carnivoro.getDescripcion(), carnivoro.getSonidoDistintivo());

        IAnimal exotico = continenteFactory.crearExotico();
        System.out.printf("El animal exotico en el continente elegido es %s", exotico.getDescripcion());
    }
}
