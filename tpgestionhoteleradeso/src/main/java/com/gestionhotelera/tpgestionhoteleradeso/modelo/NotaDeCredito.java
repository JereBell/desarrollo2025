package com.gestionhotelera.tpgestionhoteleradeso.modelo;
import java.util.Date;
public class NotaDeCredito {

    private Date fechaRealizacion;
    private String IDNota;
    private double monto;   

    //constructor
    public NotaDeCredito(Date fechaRealizacion, String IDNota, double monto) {
        this.fechaRealizacion = fechaRealizacion;
        this.IDNota = IDNota;
        this.monto = monto;
    }
    //getters y setters


    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }
    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
    public String getIDNota() {
        return IDNota;
    }
    public void setIDNota(String IDNota) {
        this.IDNota = IDNota;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    

}
