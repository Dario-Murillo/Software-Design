public class LicitadorInteresadoEnBlog implements Licitador {
    @Override
    public void update(Oferta oferta) {
        System.out.println(String.format("El blogger está escribiendo en su blog acerca de la oferta por el artículo %s por un monto de %.2f", oferta.getArticulo(), oferta.getMonto()));
    }
}
