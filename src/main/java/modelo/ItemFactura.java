package modelo;

public class ItemFactura {

    private Integer cantidad;
    private String IDItemFactura;
    private Servicio servicio;
    private Factura factura;

    //constructor
    public ItemFactura(Integer cantidad, String IDItemFactura, Servicio servicio, Factura factura) {
        this.cantidad = cantidad;
        this.IDItemFactura = IDItemFactura;
        this.servicio = servicio;
        this.factura = factura;
    }
    //getters y setters
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public String getIDItemFactura() {
        return IDItemFactura;
    }
    public void setIDItemFactura(String IDItemFactura) {
        this.IDItemFactura = IDItemFactura;
    }
    public Servicio getServicio() {
        return servicio;
    }
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    public Factura getFactura() {
        return factura;
    }
    public void setFactura(Factura factura) {
        this.factura = factura;
    }

}
