public class Item {
    private String descripcion;
    private int cantidad;
    private int costoUnitario;

    public Item(String descripcion, int cantidad, int costoUnitario) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.costoUnitario = costoUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(int costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public int getCostoTotal() {
        return costoUnitario * cantidad;
    }
}
