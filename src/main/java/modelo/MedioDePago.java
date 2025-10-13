package modelo;

public abstract class MedioDePago {

    private double monto;
    private double cotizacionEnPesos;
    private Moneda moneda;
    private Pago pago;

    //constructor
    public MedioDePago(double monto, double cotizacionEnPesos, Moneda moneda, Pago pago) {
        this.monto = monto;
        this.cotizacionEnPesos = cotizacionEnPesos;
        this.moneda = moneda;
        this.pago = pago;
    }
    //getters y setters
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public double getCotizacionEnPesos() {
        return cotizacionEnPesos;
    }
    public void setCotizacionEnPesos(double cotizacionEnPesos) {
        this.cotizacionEnPesos = cotizacionEnPesos;
    }
    public Moneda getMoneda() {
        return moneda;
    }
    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
    public Pago getPago() {
        return pago;
    }
    public void setPago(Pago pago) {
        this.pago = pago;
    }

}
