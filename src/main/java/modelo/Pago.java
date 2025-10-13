package modelo;
import java.util.Date;
import java.util.List;

public class Pago {

    private double montoAcumulado;
    private double vuelto;
    private Date fechaRealizacion;
    private Factura factura;
    private List<MedioDePago> mediosDePago;

    //constructor
    public Pago(double montoAcumulado, double vuelto, Date fechaRealizacion, Factura factura, List<MedioDePago> mediosDePago) {
        this.montoAcumulado = montoAcumulado;
        this.vuelto = vuelto;
        this.fechaRealizacion = fechaRealizacion;
        this.factura = factura;
        this.mediosDePago = mediosDePago;
    }
    //getters y setters
    public double getMontoAcumulado() {
        return montoAcumulado;
    }
    public void setMontoAcumulado(double montoAcumulado) {
        this.montoAcumulado = montoAcumulado;
    }
    public double getVuelto() {
        return vuelto;
    }
    public void setVuelto(double vuelto) {
        this.vuelto = vuelto;
    }
    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }
    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
    public Factura getFactura() {
        return factura;
    }
    public List<MedioDePago> getMediosDePago() {
        return mediosDePago;
    }

}
