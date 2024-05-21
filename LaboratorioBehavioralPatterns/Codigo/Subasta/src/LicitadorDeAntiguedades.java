public class LicitadorDeAntiguedades {
    public void recibirActualizacion(Oferta oferta) {
        System.out.println(String.format("LicitadorDeAntiguedades fue notificado de una nueva oferta del artículo %s por un monto de %.2f", oferta.getArticulo(), oferta.getMonto()));
        /* Código omitido: el comportamiento del licitador al recibir la oferta */
    }
}