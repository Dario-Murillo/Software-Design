public class LicitadorInteresadoEnBlog {
    public void recibirActualizacion(Oferta oferta) {
        System.out.println(String.format("El blogger está escribiendo en su blog acerca de la oferta por el artículo %s por un monto de %.2f", oferta.getArticulo(), oferta.getMonto()));
        /* Código omitido: el comportamiento del licitador al recibir la oferta */
    }
}
