package modelo;
import java.util.Date;
import java.util.List;

public class Factura {

    private Date fechaDeEmision;
    private TipoFactura tipo;
    private double importeTotal;
    private NotaDeCredito notaDeCredito;
    private ResponsablePagoTercero responsablePagoTercero;
    private Pago pago;
    private Pasajero pasajero;
    private List<ItemFactura> itemsFactura;


    //constructor
    public Factura(Date fechaDeEmision, TipoFactura tipo, double importeTotal) {
        this.fechaDeEmision = fechaDeEmision;
        this.tipo = tipo;
        this.importeTotal = importeTotal;
        this.notaDeCredito = null;
        this.responsablePagoTercero = null;
        this.pago = null;
        this.pasajero = null;
    }
      //constructor
    public Factura(Date fechaDeEmision, TipoFactura tipo, double importeTotal, NotaDeCredito notaDeCredito, ResponsablePagoTercero responsablePagoTercero) {
        this.fechaDeEmision = fechaDeEmision;
        this.tipo = tipo;
        this.importeTotal = importeTotal;
        this.notaDeCredito = notaDeCredito;
        this.responsablePagoTercero = responsablePagoTercero;
        this.pago = null;
    }
    //getters y setters
    public Date getFechaDeEmision() {
        return fechaDeEmision;
    }
    public void setFechaDeEmision(Date fechaDeEmision) {
        this.fechaDeEmision = fechaDeEmision;
    }
    public TipoFactura getTipo() {
        return tipo;
    }
    public void setTipo(TipoFactura tipo) {
        this.tipo = tipo;
    }
    public double getImporteTotal() {
        return importeTotal;
    }
    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }
    public NotaDeCredito getNotaDeCredito() {
        return notaDeCredito;
    }
    public void setNotaDeCredito(NotaDeCredito notaDeCredito) {
        this.notaDeCredito = notaDeCredito;
    }
    public ResponsablePagoTercero getResponsablePagoTercero() {
        return responsablePagoTercero;
    }
    public void setResponsablePagoTercero(ResponsablePagoTercero responsablePagoTercero) {
        this.responsablePagoTercero = responsablePagoTercero;
    }
    public Pago getPago() {
        return pago;
    }
    public void setPago(Pago pago) {
        this.pago = pago;
    }
    public Pasajero getPasajero() {
        return pasajero;
    }
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
    public List<ItemFactura> getItemsFactura() {
        return itemsFactura;
    }
    public void setItemsFactura(List<ItemFactura> itemsFactura) {
        this.itemsFactura = itemsFactura;
    }

}
