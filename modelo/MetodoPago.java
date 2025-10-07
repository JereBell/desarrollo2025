package modelo;

import java.time.LocalDate;

public abstract class MetodoPago {
    private long id;
    private double monto;
    private LocalDate fechaPago;

    //geters
    public long getId() {
        return id;
    }
    public double getMonto() {
        return monto;
    }
    public LocalDate getFechaPago() {
        return fechaPago;
    }
    //seters
    public void setId(long id) {
        this.id = id;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

}
