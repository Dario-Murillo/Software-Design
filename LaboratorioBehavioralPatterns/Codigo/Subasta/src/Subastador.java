public class Subastador {
    private LicitadorDeAntiguedades licitadorDeAntiguedades;
    private LicitadorInteresadoEnBlog blogger;
    private LicitadorInteresadoEnPromedio promediador;

    public Subastador(LicitadorDeAntiguedades licitadorDeAntiguedades, LicitadorInteresadoEnBlog blogger, LicitadorInteresadoEnPromedio promediador) {
        this.licitadorDeAntiguedades = licitadorDeAntiguedades;
        this.blogger = blogger;
        this.promediador = promediador;
    }

    public void nuevaOfertaAceptada(Oferta oferta) {
        licitadorDeAntiguedades.recibirActualizacion(oferta);
        blogger.recibirActualizacion(oferta);
        promediador.recibirActualizacion(oferta);
    }

    public void recibirOferta(Oferta oferta) {
        nuevaOfertaAceptada(oferta);
    }
}
