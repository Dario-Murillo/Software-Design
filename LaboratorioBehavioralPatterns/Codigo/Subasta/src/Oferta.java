/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class Oferta {
    private double monto;
    private Object oferente;
    private String articulo;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Object getOferente() {
        return oferente;
    }

    public void setOferente(Object oferente) {
        this.oferente = oferente;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
}