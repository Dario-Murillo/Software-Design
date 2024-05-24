import java.util.ArrayList;
import java.util.List;

public class Subastador {
    private List<Licitador> licitadores = new ArrayList<Licitador>();

    public void attach(Licitador licitador) {
        licitadores.add(licitador);
    }

    public void detach(Licitador licitador) {
        licitadores.remove(licitador);
    }

    public void notify(Oferta oferta) {
        for (Licitador licitador : licitadores) {
            licitador.update(oferta);
        }
        System.out.println("");
    }

}
