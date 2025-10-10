package com.gestionhotelera.tpgestionhoteleradeso.modelo;

public abstract class MedioDePago {

    private double monto;
    private double cotizacionEnPesos;

    //constructor
    public MedioDePago(double monto, double cotizacionEnPesos) {
        this.monto = monto;
        this.cotizacionEnPesos = cotizacionEnPesos;
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


}
